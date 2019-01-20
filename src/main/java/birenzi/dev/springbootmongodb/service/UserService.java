package birenzi.dev.springbootmongodb.service;

import birenzi.dev.springbootmongodb.modelLayer.model.User;
import birenzi.dev.springbootmongodb.modelLayer.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;


    public List<User> getAllUsers(){
        return userRepo.findAll();
    }


    public User postOneUser(User user){
        return userRepo.insert(user);
    }

    public void deleteOneUser(String id){
           userRepo.deleteById(id);
    }


}
