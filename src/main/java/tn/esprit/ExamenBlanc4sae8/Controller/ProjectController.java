package tn.esprit.ExamenBlanc4sae8.Controller;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ExamenBlanc4sae8.Entity.Project;
import tn.esprit.ExamenBlanc4sae8.Services.IProjectServices;
import tn.esprit.ExamenBlanc4sae8.Services.ProjectServices;

@RestController
@RequestMapping(value = "/Project", method = RequestMethod.POST)
@AllArgsConstructor
public class ProjectController {
     IProjectServices iProjectServices;
    @PostMapping("/AddProject")
    public Project ajouterProject (@RequestBody Project project) { return iProjectServices.ajouterProject(project);}

    @PostMapping("/assignProjectToDevoloper/{idProject}/{idDeveloper}")
    public void assignUniversiteToDepartement(@PathVariable("idProject") int idProject,
                                              @PathVariable("idDeveloper") int idDeveloper){
        iProjectServices.assignProjectToDeveloper(idProject,idDeveloper);
    }

    @PostMapping("/assignProjectToScrumMaster/{idProject}/{fName}/{lName}")
    public void assignProjectToScrumMaster(@PathVariable("idProject") int idProject,
                                            @PathVariable("fName") String fName,
                                           @PathVariable("lName")String lName){
        iProjectServices.assignProjectToScrumMaster(idProject,fName,lName);

    }
    @GetMapping("/getProjectByScrumMaster/{fName}/{lName}")
    @ResponseBody
    public void getProjectByScrumMaster(@PathVariable("fName") String fname, @PathVariable("lName") String lname) {
        iProjectServices.getProjectByScrumMaster(fname,lname);
    }


}
