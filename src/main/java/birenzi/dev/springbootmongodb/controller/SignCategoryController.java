package birenzi.dev.springbootmongodb.controller;

import birenzi.dev.springbootmongodb.modelLayer.model.SignCategory;
import birenzi.dev.springbootmongodb.service.SignCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class SignCategoryController {

    /*  Break this controller into multiple controllers*/

    @Autowired
    private SignCategoryService signCategoryService;

    /*  Get*/
    @GetMapping("/getAllSignCategory")
    public List<SignCategory> getAll(){
        return signCategoryService.getAll();
    }

    // post
    @PostMapping("/addSignCategory")
    public SignCategory postOneUser(@RequestBody SignCategory category){
        return signCategoryService.postOneUser(category);
    }

    // delete

    @DeleteMapping("/deleteSignCategory/{id}")
    public void deleteOneSignCategory(@PathVariable("id") String id){
        signCategoryService.deleteOneSignCategory(id);
    }


}
