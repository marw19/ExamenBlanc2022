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
public class Project implements Serializable {
   @Id
   @GeneratedValue ( strategy = GenerationType.IDENTITY)
   int id;
   String title;
   String description;
   @OneToMany(cascade = CascadeType.ALL, mappedBy = "Project")
   private Set<Sprint> sprint;
   @ManyToMany
   Set<User> users;
   @ManyToOne
   User scrumMaster;

}
