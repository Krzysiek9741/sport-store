package pl.kf.sportstore.model.order;

import pl.kf.sportstore.model.products.Product;
import pl.kf.sportstore.model.products.cloth.Cloth;
import pl.kf.sportstore.model.products.equipment.Equipment;
import pl.kf.sportstore.model.products.shoes.Shoes;
import pl.kf.sportstore.model.user.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Entity
public class ShopOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private User customer;
    @ElementCollection
    @CollectionTable(name = "order_cloth_mapping",
            joinColumns = {@JoinColumn(name = "shop_order_id", referencedColumnName = "id")})
    @MapKeyColumn(name = "cloth")
    @Column(name = "quantity")
    private Map<Cloth, Integer> clothes = new HashMap<>();
    @ElementCollection
    @CollectionTable(name = "order_shoes_mapping",
            joinColumns = {@JoinColumn(name = "shop_order_id", referencedColumnName = "id")})
    @MapKeyColumn(name = "shoes")
    @Column(name = "quantity")
    private Map<Shoes, Integer> shoes = new HashMap<>();
    @ElementCollection
    @CollectionTable(name = "order_equipment_mapping",
            joinColumns = {@JoinColumn(name = "shop_order_id", referencedColumnName = "id")})
    @MapKeyColumn(name = "equipment")
    @Column(name = "quantity")
    private Map<Equipment, Integer> equipment = new HashMap<>();
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus = OrderStatus.STARTED;
    @Transient
    private Map<Product, Integer> shoppingCart = new HashMap<>();

    public ShopOrder() {
    }

    public ShopOrder(User customer) {
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }

    public Map<Product, Integer> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(Map<Product, Integer> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Map<Cloth, Integer> getClothes() {
        return clothes;
    }

    public void setClothes(Map<Cloth, Integer> clothes) {
        this.clothes = clothes;
    }

    public Map<Shoes, Integer> getShoes() {
        return shoes;
    }

    public void setShoes(Map<Shoes, Integer> shoes) {
        this.shoes = shoes;
    }

    public Map<Equipment, Integer> getEquipment() {
        return equipment;
    }

    public void setEquipment(Map<Equipment, Integer> equipment) {
        this.equipment = equipment;
    }

    public void addToCart(Product product, Integer quantity, String prodType){
        if (prodType.equals("cloth")) {
            this.clothes.put((Cloth)product,quantity);
        }
        if (prodType.equals("shoes")) {
            this.shoes.put((Shoes)product, quantity);
        }
        if (prodType.equals("equipment")) {
            this.equipment.put((Equipment)product, quantity);
        }
    }
}
