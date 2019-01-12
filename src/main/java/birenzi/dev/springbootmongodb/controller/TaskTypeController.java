package birenzi.dev.springbootmongodb.controller;

import birenzi.dev.springbootmongodb.model.*;
import birenzi.dev.springbootmongodb.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class TaskTypeController {

    @Autowired
    private TaskTypeRepo taskTypeRepo;


    /*  Get*/
    @GetMapping("/getAllSignBoards")
    public List<TaskType> getAll(){
        return taskTypeRepo.findAll();
    }

    // post
    @PostMapping("/addTaskType")
    public TaskType postOneUser(@RequestBody TaskType taskType){
        return taskTypeRepo.insert(taskType);
    }


    // delete
    @DeleteMapping("/deleteUser/{id}")
    public void deleteOneUser(@PathVariable("id") String id){

           taskTypeRepo.deleteById(id);


    }

}
