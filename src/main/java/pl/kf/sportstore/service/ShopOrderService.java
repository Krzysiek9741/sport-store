package pl.kf.sportstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kf.sportstore.model.order.OrderStatus;
import pl.kf.sportstore.model.order.ShopOrder;
import pl.kf.sportstore.model.products.Product;
import pl.kf.sportstore.model.user.User;
import pl.kf.sportstore.repository.ShoesRepository;
import pl.kf.sportstore.repository.ShopOrderRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ShopOrderService {

    ShopOrderRepository shopOrderRepository;

    @Autowired
    public ShopOrderService(ShopOrderRepository shopOrderRepository) {
        this.shopOrderRepository = shopOrderRepository;
    }

    public ShopOrder getShopOrderByCustomerAndStatus(User customer, OrderStatus orderStatus){
        return shopOrderRepository.findShopOrderByCustomerAndOrderStatus(customer, orderStatus);
    }

    public void saveOrder(ShopOrder shopOrder){
        shopOrderRepository.save(shopOrder);
    }

    /*public List<Product> getAllProductsFromCart(ShopOrder shopOrder){
        List<Product> products = new ArrayList<>();

        products.addAll(shopOrder.getClothes());
        products.addAll(shopOrder.getShoes());
        products.addAll(shopOrder.getEquipment());

        return products;
    }*/

    public Map<Product, Integer> getAllProductsFromCart(ShopOrder shopOrder){
        Map<Product, Integer> products = new HashMap<>();

        products.putAll(shopOrder.getClothes());
        products.putAll(shopOrder.getShoes());
        products.putAll(shopOrder.getEquipment());

        return products;
    }

}
