package web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import web.models.Project;

public interface ProjectRepo extends JpaRepository<Project, Long> {
    Project getProjectsById(Long id);
    Project getProjectsByName(String name);
}
