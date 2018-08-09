package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.BookDao;
import dao.OrderDao;
import model.Book;
import model.Order;

@Controller
@RequestMapping("Admincontrll")
public class Admincontroller 
{

	 @Autowired
	 BookDao bookdao;
	 public List<Book> allbooks()
	 {
		 return bookdao.Getallbook();
	 }
	 public Book addbook(Book book)
	 {
		  Book b1=new Book();
		  b1=book;
		return bookdao.save(b1);
		 
	 }
	 @Autowired
	 OrderDao orderdao;
	 public List<Order> Orderlist()
	 {
		return orderdao.showorder();
		 
	 }
}
