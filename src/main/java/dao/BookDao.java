package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import UserRepostory.BookRepostry;
import UserRepostory.ClientRepossatary;
import model.Book;


@Service
public class BookDao
{
	@Autowired
	 BookRepostry bookrepostry;
    public  Book save(Book book)
    {
    	
   	 return bookrepostry.save(book);
    }
    public List<Book> Getallbook()
    {
    	return bookrepostry.findAll();
    }
    public Book onebook(Long book)
    {
		return bookrepostry.findOne(book);
    	
    }
}
