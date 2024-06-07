package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.models.Employee;
import web.repositories.EmployeeRepo;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    public Employee getEmployeeById(Long id){
        return employeeRepo.getEmployeeById(id);
    }
    public Employee getEmployeeByName(String name){
        return employeeRepo.getEmployeeByName(name);
    }

}

