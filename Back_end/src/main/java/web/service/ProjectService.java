package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.models.Employee;
import web.models.Project;
import web.repositories.ProjectRepo;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepo projectRepo;

    public List<Project> getAllProjects() {
        return projectRepo.findAll();
    }

    public Project saveProject(Project project) {
        return projectRepo.save(project);
    }

    public Project getProjectById(Long id){
        return projectRepo.getProjectsById(id);
    }
    public Project getProjectsByName(String name){
        return projectRepo.getProjectsByName(name);
    }
}

