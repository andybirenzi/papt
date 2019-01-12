package birenzi.dev.springbootmongodb.controller;

import birenzi.dev.springbootmongodb.model.*;
import birenzi.dev.springbootmongodb.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class SignBoardTaskContoller {

    /*  Break this controller into multiple controllers*/

    @Autowired
    private SignBoardTasksRepo boardTasksRepo;

    /*  Get*/
    @GetMapping("/getAllSignBoardsTasks")
    public List<SignBoardTasks> getAllBoardTasks(){
        return boardTasksRepo.findAll();
    }

    // post
    @PostMapping("/addBoardTask")
    public SignBoardTasks postOneUser(@RequestBody SignBoardTasks task){
        return boardTasksRepo.insert(task);
    }

    // delete
    @DeleteMapping("/deleteBoardTask/{id}")
    public void deleteOneTask(@PathVariable("id") String id){

           boardTasksRepo.deleteById(id);


    }


}
