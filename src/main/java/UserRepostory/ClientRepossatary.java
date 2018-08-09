package UserRepostory;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Employee;

public interface ClientRepossatary extends JpaRepository<Employee,Long>{

}
