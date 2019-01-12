package birenzi.dev.springbootmongodb.controller;

import birenzi.dev.springbootmongodb.model.Role;
import birenzi.dev.springbootmongodb.model.Sign;
import birenzi.dev.springbootmongodb.model.SignBoard;
import birenzi.dev.springbootmongodb.model.User;
import birenzi.dev.springbootmongodb.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    private UserRepo userRepo;

    /*  Get*/
    @GetMapping("/getAllSignBoards")
    public List<User> getAll(){
        return userRepo.findAll();
    }


    // post
    @PostMapping("/addUser")
    public User postOneUser(@RequestBody User user){
        return userRepo.insert(user);
    }

    // delete
    @DeleteMapping("/deleteUser/{id}")
    public void deleteOneUser(@PathVariable("id") String id){
           userRepo.deleteById(id);


    }


}
