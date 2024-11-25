package tech.izak.Microservice.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.izak.Microservice.Employee.Entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
