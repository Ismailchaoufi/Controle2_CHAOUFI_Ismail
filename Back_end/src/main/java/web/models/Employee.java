package web.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;


    @ElementCollection
    private List<String> skills;
    @Enumerated(EnumType.STRING)
    private Role role;


    @ManyToMany(mappedBy = "employees")
    private List<Project> projects;


}
