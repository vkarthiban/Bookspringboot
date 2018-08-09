package dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import UserRepostory.ClientRepossatary;
import model.Employee;

@Service
public class UserDao 
{
     @Autowired
     
     ClientRepossatary clientrepositry;
     public  Employee save(Employee emp)
     {
    	 return clientrepositry.save(emp);
     }
     public List<Employee> FindAll()
     {
		return clientrepositry.findAll();
    	 
     }
     public Employee Findone(Long emp)
     {
		return clientrepositry.findOne(emp);
    	 
     }
	 
}
