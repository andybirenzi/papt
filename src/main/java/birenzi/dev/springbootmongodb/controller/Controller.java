package birenzi.dev.springbootmongodb.controller;

import birenzi.dev.springbootmongodb.model.Sign;
import birenzi.dev.springbootmongodb.model.SignBoard;
import birenzi.dev.springbootmongodb.model.User;
import birenzi.dev.springbootmongodb.repository.BoardRepo;
import birenzi.dev.springbootmongodb.repository.SignRepo;
import birenzi.dev.springbootmongodb.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class Controller {
    @Autowired
    private BoardRepo boardRepo;
    @Autowired
    private SignRepo signRepo;
    @Autowired
    private UserRepo userRepo;

    /*  Get*/
    @GetMapping("/getAllSignBoards")
    public List<SignBoard> getAll(){
        return boardRepo.findAll();
    }
    @GetMapping("/getAllUsers")
    public List<User> getAllUsers(){
        return userRepo.findAll();
    }
    @GetMapping("/getAllSigns")
    public List<Sign> getAllSigns(){
        return signRepo.findAll();
    }

    // post
    @PostMapping("/addUser")
    public User postOneUser(@RequestBody User user){
        return userRepo.insert(user);
    }
    @PostMapping("/addBoard")
    public SignBoard postOneUser(@RequestBody SignBoard signBoard){
        return boardRepo.insert(signBoard);
    }
    @PostMapping("/addSign")
    public Sign postOneSign(@RequestBody Sign sign){
        return signRepo.insert(sign);
    }

//    // delete
//    @DeleteMapping("/deleteUser/{username}")
//    public User deleteOneUser(@PathVariable("username") String userName){
//      User user=  userRepo.findOne(userName);
//        return user;
//
//    }
//    @PostMapping("/addBoard")
//    public SignBoard postOneUser(@RequestBody SignBoard signBoard){
//        return boardRepo.insert(signBoard);
//    }
//    @PostMapping("/addSign")
//    public Sign postOneSign(@RequestBody Sign sign){
//        return signRepo.insert(sign);
//    }


}
