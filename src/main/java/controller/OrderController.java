package controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import UserRepostory.OrderRepostry;
import dao.OrderDao;
import model.Order;

@Controller
@RequestMapping("Order")
public class OrderController
{

	  @Autowired
	  OrderDao orderdao;
	  
	  public Order placeorder(@Valid @RequestBody Order order)
	  {
		     Order order1=new Order();
		          order1=order;
		return orderdao.placeorder(order1);
		  
	  }
}
