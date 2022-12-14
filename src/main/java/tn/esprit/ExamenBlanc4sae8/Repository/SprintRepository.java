package tn.esprit.ExamenBlanc4sae8.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.ExamenBlanc4sae8.Entity.Sprint;
public interface SprintRepository extends JpaRepository <Sprint, Integer> {
}
