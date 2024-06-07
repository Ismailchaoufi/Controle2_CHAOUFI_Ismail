package web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.models.Employee;
import web.models.Project;
import web.service.EmployeeService;
import web.service.ProjectService;

@RestController
@RequestMapping("/projects")
public class ProjectController {
    @Autowired
    private ProjectService projectService;
    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public String getAllProjects(Model model) {
        model.addAttribute("projects", projectService.getAllProjects());
        return "projects";
    }

//    @GetMapping("/assign")
//    @PreAuthorize("hasRole('MANAGER')")
//    public String assignEmployeeForm(Model model) {
//        model.addAttribute("projects", projectService.getAllProjects());
//        model.addAttribute("employees", employeeService.getAllEmployees());
//        return "assign";
//    }
//
//    @PostMapping("/assign")
//    @PreAuthorize("hasRole('MANAGER')")
//    public String assignEmployee(@RequestParam Long projectId, @RequestParam Long employeeId) {
//        Project project = projectService.getProjectById(projectId);
//        Employee employee = employeeService.getEmployeeById(employeeId);
//        // Logic to assign employee to project
//        return "redirect:/projects";
//    }
@GetMapping("/assign")
@PreAuthorize("hasRole('ROLE_MANAGER')")
public String assignEmployeeForm(Model model) {
    model.addAttribute("projects", projectService.getAllProjects());
    model.addAttribute("employees", employeeService.getAllEmployees());
    return "assign";
}

    @PostMapping("/assign")
    @PreAuthorize("hasRole('ROLE_MANAGER')")
    public String assignEmployee(@RequestParam Long projectId, @RequestParam Long employeeId) {
        Project project = projectService.getProjectById(projectId);
        Employee employee = employeeService.getEmployeeById(employeeId);
        project.getEmployees().add(employee);
        projectService.saveProject(project);
        return "redirect:/projects";
    }
}

