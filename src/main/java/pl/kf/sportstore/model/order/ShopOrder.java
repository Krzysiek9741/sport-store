package pl.kf.sportstore.model.order;

import pl.kf.sportstore.model.products.Product;
import pl.kf.sportstore.model.products.cloth.Cloth;
import pl.kf.sportstore.model.products.equipment.Equipment;
import pl.kf.sportstore.model.products.shoes.Shoes;
import pl.kf.sportstore.model.user.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ShopOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private User customer;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Cloth> clothes = new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL)
    private List<Shoes> shoes = new ArrayList<>();
    @OneToMany(cascade = CascadeType.ALL)
    private List<Equipment> equipment = new ArrayList<>();
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus = OrderStatus.STARTED;
    @Transient
    private List<Product> shoppingCart = new ArrayList<>();

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

    public List<Product> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(List<Product> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public List<Cloth> getClothes() {
        return clothes;
    }

    public void setClothes(List<Cloth> clothes) {
        this.clothes = clothes;
    }

    public List<Shoes> getShoes() {
        return shoes;
    }

    public void setShoes(List<Shoes> shoes) {
        this.shoes = shoes;
    }

    public List<Equipment> getEquipment() {
        return equipment;
    }

    public void setEquipment(List<Equipment> equipment) {
        this.equipment = equipment;
    }

    public void addToCart(Product product, String prodType){
        if (prodType.equals("cloth")) {
            this.clothes.add((Cloth)product);

        }
        if (prodType.equals("shoes")) {
            this.shoes.add((Shoes)product);

        }
        if (prodType.equals("equipment")) {
            this.equipment.add((Equipment) product);
        }
    }
}
