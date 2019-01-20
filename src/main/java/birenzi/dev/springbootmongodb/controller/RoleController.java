package birenzi.dev.springbootmongodb.controller;

import birenzi.dev.springbootmongodb.modelLayer.model.Role;
import birenzi.dev.springbootmongodb.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class RoleController {


    @Autowired
    private RoleService RoleService;


    /*  Get*/
    @GetMapping("/getAllRoles")
    public List<Role> getAllRoles(){
        return RoleService.getAllRoles();
    }

    // post
    @PostMapping("/addRole")
    public Role addOneUser(@RequestBody Role role){
        return RoleService.addOneRole(role);
    }

    // delete
    @DeleteMapping("/deleteRole/{id}")
    public void deleteOneRole(@PathVariable("id") String id){
        RoleService.deleteOneRole(id);
    }


}
