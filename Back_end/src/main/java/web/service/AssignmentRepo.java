package web.service;

import org.springframework.data.jpa.repository.JpaRepository;
import web.models.Assignment;

public interface AssignmentRepo extends JpaRepository<Assignment, Long> {
}

