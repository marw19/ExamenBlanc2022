package tn.esprit.ExamenBlanc4sae8.Controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ExamenBlanc4sae8.Entity.Sprint;
import tn.esprit.ExamenBlanc4sae8.Entity.User;
import tn.esprit.ExamenBlanc4sae8.Services.IUserServices;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/user", method = RequestMethod.POST)
public class userController {
    IUserServices iUserServices;
    @PostMapping("/AddUser")
    @ResponseBody
    public User addUser(@RequestBody User user){
        return iUserServices.addUser(user) ;
    }


}
