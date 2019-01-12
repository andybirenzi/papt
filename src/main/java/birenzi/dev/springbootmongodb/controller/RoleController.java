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
public class RoleController {


    @Autowired
    private RoleRepo roleRepo;


    /*  Get*/
    @GetMapping("/getAllRoles")
    public List<Role> getAllRoles(){
        return roleRepo.findAll();
    }

    // post
    @PostMapping("/addRole")
    public Role addOneUser(@RequestBody Role role){
        return roleRepo.insert(role);
    }

    // delete
    @DeleteMapping("/deleteRole/{id}")
    public void deleteOneRole(@PathVariable("id") String id){

           roleRepo.deleteById(id);


    }


}
