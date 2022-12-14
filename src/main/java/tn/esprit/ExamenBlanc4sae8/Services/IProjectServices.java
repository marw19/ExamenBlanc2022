package tn.esprit.ExamenBlanc4sae8.Services;
import tn.esprit.ExamenBlanc4sae8.Entity.Project;

import java.util.List;

public interface IProjectServices {
    Project ajouterProject(Project project);
    public void assignProjectToDeveloper(Integer projectId, Integer devId);
    public void assignProjectToScrumMaster(Integer projectId,String fName, String lName);
    public List<Project> getProjectByScrumMaster(String fName, String lNAME);
}
