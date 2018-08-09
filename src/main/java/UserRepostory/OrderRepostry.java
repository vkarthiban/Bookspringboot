package UserRepostory;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Order;

public interface OrderRepostry extends JpaRepository<Order,Long> {

}
