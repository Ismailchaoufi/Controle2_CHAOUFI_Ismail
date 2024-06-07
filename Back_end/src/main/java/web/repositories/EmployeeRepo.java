package web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import web.models.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    Employee getEmployeeById(Long id);
    Employee getEmployeeByName(String name);
}

