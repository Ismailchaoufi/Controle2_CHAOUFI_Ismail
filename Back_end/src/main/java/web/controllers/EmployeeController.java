package web.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import web.models.Assignment;
import web.models.Employee;
import web.models.Project;
import web.service.AssignmentService;
import web.service.EmployeeService;
import web.service.ProjectService;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private ProjectService projectService;

    @Autowired
    private AssignmentService assignmentService;

    @GetMapping("/employees")
    public String showEmployees(Model model) {
        List<Employee> employees = employeeService.getAllEmployees();
        model.addAttribute("employees", employees);
        return "employees";
    }

    @PostMapping("/assignEmployee")
    public String assignEmployeeToProject(@RequestParam("employeeName") String employeeName,
                                          @RequestParam("projectName") String projectName,
                                          @RequestParam("implication") int implication) {

        Employee employee = employeeService.getEmployeeByName(employeeName);
        Project project = projectService.getProjectsByName(projectName);


        if (employee == null || project == null) {

            return "redirect:/error.jsp";
        }


        Assignment assignment = new Assignment();
        assignment.setEmployee(employee);
        assignment.setProject(project);
        assignment.setImplication(implication);
        assignmentService.saveAssignment(assignment);


        return "redirect:/home.jsp";
    }

}

