package tn.esprit.ExamenBlanc4sae8.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.ExamenBlanc4sae8.Entity.User;
import tn.esprit.ExamenBlanc4sae8.Repository.UserRepository;
@Service
@AllArgsConstructor
public class UserServices implements IUserServices {
    UserRepository userRepository ;
    @Override
    public  User addUser(User user) {return userRepository.save(user);}
}