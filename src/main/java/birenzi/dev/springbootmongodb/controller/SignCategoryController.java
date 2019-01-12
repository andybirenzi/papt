package birenzi.dev.springbootmongodb.controller;

import birenzi.dev.springbootmongodb.model.*;
import birenzi.dev.springbootmongodb.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class SignCategoryController {

    /*  Break this controller into multiple controllers*/

    @Autowired
    private SignCategoryRepo signCategoryRepo;

    /*  Get*/
    @GetMapping("/getAllSignCategory")
    public List<SignCategory> getAll(){
        return signCategoryRepo.findAll();
    }

    // post
    @PostMapping("/addSignCategory")
    public SignCategory postOneUser(@RequestBody SignCategory category){
        return signCategoryRepo.insert(category);
    }

    // delete

    @DeleteMapping("/deleteSignCategory/{id}")
    public void deleteOneSignCategory(@PathVariable("id") String id){
        signCategoryRepo.deleteById(id);
    }


}
