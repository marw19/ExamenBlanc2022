package tn.esprit.ExamenBlanc4sae8.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id ;
    String email ;
    String pwd ;
    String fName;
    String lName;
    Role role;
    @OneToMany (cascade = CascadeType.ALL , mappedBy = "scrumMaster")
    private Set<Project> project;
    @ManyToMany
     Set<Project> projects;


}
