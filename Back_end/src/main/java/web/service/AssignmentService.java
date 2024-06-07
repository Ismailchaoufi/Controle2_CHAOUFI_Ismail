package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.models.Assignment;

@Service
public class AssignmentService {
    @Autowired
    private AssignmentRepo assignmentRepo;

    public Assignment saveAssignment(Assignment assignment) {
        return assignmentRepo.save(assignment);
    }


}

