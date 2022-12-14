package tn.esprit.ExamenBlanc4sae8.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import tn.esprit.ExamenBlanc4sae8.Entity.Role;
import tn.esprit.ExamenBlanc4sae8.Entity.Sprint;
import tn.esprit.ExamenBlanc4sae8.Entity.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

}
