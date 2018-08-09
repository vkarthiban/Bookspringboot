package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import UserRepostory.ClientRepossatary;
import UserRepostory.OrderRepostry;
import model.Employee;
import model.Order;

@Service
public class OrderDao
{

	@Autowired
	OrderRepostry orderrepostry;
	public Order placeorder(Order order)
	{
		return orderrepostry.save(order);
		
	}
	public List<Order> showorder()
	{
		return orderrepostry.findAll();
		
	}
}
