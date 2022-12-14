package tn.esprit.ExamenBlanc4sae8.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ExamenBlanc4sae8.Entity.Project;
import tn.esprit.ExamenBlanc4sae8.Entity.Role;
import tn.esprit.ExamenBlanc4sae8.Entity.Sprint;
import tn.esprit.ExamenBlanc4sae8.Entity.User;
import tn.esprit.ExamenBlanc4sae8.Repository.ProjectRepository;
import tn.esprit.ExamenBlanc4sae8.Repository.SprintRepository;
import tn.esprit.ExamenBlanc4sae8.Repository.UserRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

@Service
public class ProjectServices implements IProjectServices {
    @Autowired
    ProjectRepository projectRepository;
    SprintRepository sprintRepository;
    @Autowired
    UserRepository userRepository;
    @Override
    public Project ajouterProject(Project project  ) {
        LocalDate date = LocalDate.now();
        Sprint s = new Sprint();
        s.setDescription("sprint project");
        s.setStartDate(date);
        s.setProject(project);
        sprintRepository.save(s);
        return projectRepository.save(project);}

    @Override
    public void assignProjectToDeveloper(Integer projectId, Integer devId) {
        Project p = projectRepository.findById(projectId).orElse(null);
        User u = userRepository.findById(devId).orElse(null);
        p.getUsers().add(u);
        projectRepository.save(p);
    }

    @Override
    public void assignProjectToScrumMaster(Integer projectId,String fName, String lName) {
        Project p = projectRepository.findById(projectId).orElse(null);
        p.getScrumMaster().setFName(fName);
        p.getScrumMaster().setLName(lName);
        projectRepository.save(p);
    }
    @Override
    public List<Project> getProjectByScrumMaster(String fName, String lNAME)  {
        return projectRepository.getProjectByScrumMaster(fName,lNAME);
    }
}
