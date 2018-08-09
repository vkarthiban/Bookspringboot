package controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.UserDao;
import model.Employee;

@Controller
@RequestMapping("/Users")
public class Usercontroller
{
       @Autowired
       UserDao userdao;
       @PostMapping("/user")
	public Employee Createuser(@Valid @RequestBody Employee emp)
	{
    	    Employee emp1= new Employee();
    	     emp1=emp;
		return userdao.save(emp1);
	}
       @GetMapping("/user")
	public List<Employee> getalluser()
	{
		return userdao.FindAll();
	}
       @GetMapping("/user/{name}")
       public ResponseEntity<Employee> getEmployeebyid(@PathVariable(value="name") Long empname)
       {
    	    Employee emp=userdao.Findone(empname);
    	    if(emp==null)
    	    {
    	    	return ResponseEntity.notFound().build();
    	    }
		return ResponseEntity.ok().body(emp) ;
    	   
       }
       
      /* @PutMapping("/user/{name}")
       public ResponseEntity<Employee> updateUser(@PathVariable(value="name") Long empname,@Valid @RequestBody Employee emp1)
       {
    	   Employee emp2=userdao.
		return null;
    	   
       }*/
       
	
}
