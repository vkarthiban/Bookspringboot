package model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Order")
public class Order 
{

	private String name;
	private String Bookname;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBookname() {
		return Bookname;
	}
	public void setBookname(String bookname) {
		Bookname = bookname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	private int price;
}
