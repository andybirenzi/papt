package birenzi.dev.springbootmongodb.controller;

import birenzi.dev.springbootmongodb.modelLayer.model.User;
import birenzi.dev.springbootmongodb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /*  Get*/
    @GetMapping("/getAllUsers")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }


    // post
    @PostMapping("/addUser")
    public User postOneUser(@RequestBody User user){
        return userService.postOneUser(user);
    }

    // delete
    @DeleteMapping("/deleteUser/{id}")
    public void deleteOneUser(@PathVariable("id") String id){
           userService.deleteOneUser(id);


    }


}