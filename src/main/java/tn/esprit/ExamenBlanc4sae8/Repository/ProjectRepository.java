package tn.esprit.ExamenBlanc4sae8.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import tn.esprit.ExamenBlanc4sae8.Entity.Project;


import java.util.List;

public interface ProjectRepository  extends JpaRepository<Project, Integer> {
    @Query("SELECT  p FROM Project p  where  p.scrumMaster =?1   ")
    List<Project> getProjectByScrumMaster(@PathVariable("fName") String fname , @PathVariable("lName")String lname);

}
