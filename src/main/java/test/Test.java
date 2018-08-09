package test;

import dao.UserDao;
import model.Employee;

public class Test {

	public static void main(String[] args)throws Exception
	{
		
		UserDao userdao=new UserDao();
		Employee emp=new Employee();
		    emp.setName("karthiban");
		    emp.setEmail("karthi567@gmail.com");
		    emp.setPassword("akethi567");
		   
	       Employee emp2= userdao.save(emp);
	       System.out.println(emp2);

	}

}
