package pl.kf.sportstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.kf.sportstore.model.order.OrderStatus;
import pl.kf.sportstore.model.order.ShopOrder;
import pl.kf.sportstore.model.user.User;

@Repository
public interface ShopOrderRepository extends JpaRepository<ShopOrder, Long> {

    ShopOrder findShopOrderByCustomer(User customer);

    ShopOrder findShopOrderByCustomerAndOrderStatus(User customer, OrderStatus orderStatus);
}
