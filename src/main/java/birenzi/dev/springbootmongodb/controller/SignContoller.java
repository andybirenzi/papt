package birenzi.dev.springbootmongodb.controller;

import birenzi.dev.springbootmongodb.model.Role;
import birenzi.dev.springbootmongodb.model.Sign;
import birenzi.dev.springbootmongodb.model.SignBoard;
import birenzi.dev.springbootmongodb.model.User;
import birenzi.dev.springbootmongodb.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class SignContoller {


    @Autowired
    private SignRepo signRepo;


    /*  Get*/
    @GetMapping("/getAllSignBoards")
    public List<Sign> getAllSigns(){
        return signRepo.findAll();
    }


    // post
    @PostMapping("/addSign")
    public Sign postOneSign(@RequestBody Sign sign){
        return signRepo.insert(sign);
    }

    // delete
    @DeleteMapping("/deleteUser/{id}")
    public void deleteOneSign(@PathVariable("id") String id){

           signRepo.deleteById(id);


    }


}
