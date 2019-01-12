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
    @GetMapping("/getAllTaskTypes")
    public List<TaskType> getAllTaskTypes(){
        return taskTypeRepo.findAll();
    }

    // post
    @PostMapping("/addTaskType")
    public TaskType postOneTaskType(@RequestBody TaskType taskType){
        return taskTypeRepo.insert(taskType);
    }


    // delete
    @DeleteMapping("/deleteTaskType/{id}")
    public void deleteOneTaskType(@PathVariable("id") String id){

           taskTypeRepo.deleteById(id);


    }

}
