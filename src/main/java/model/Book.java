package model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="books")
public class Book 
{
   
	@NotBlank
	private String name;
	@NotBlank
	private  int price;
	@NotBlank
	private int author_id;
	
	public String getName() {
		return name;
	}
  
	public void setName(String name) {
		this.name = name;
	}
   
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAuthor_id() {
		return author_id;
	}
	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}
	
	
}
