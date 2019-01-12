package birenzi.dev.springbootmongodb.controller;

import birenzi.dev.springbootmongodb.model.*;
import birenzi.dev.springbootmongodb.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class TaskStatusController {


    @Autowired
    private TaskStatusRepo taskStatusRepo;

    /*  Get*/
    @GetMapping("/getAllTaskStatuses")
    public List<TaskStatus> getAllTaskStatus(){
        return taskStatusRepo.findAll();
    }

    // post
    @PostMapping("/addTaskStatus")
    public TaskStatus postOneTaskStatus(@RequestBody TaskStatus status){
        return taskStatusRepo.insert(status);
    }

    // delete

    @DeleteMapping("/deleteTaskStatus/{id}")
    public void deleteOneTaskStatus(@PathVariable("id") String id){
        taskStatusRepo.deleteById(id);
    }


}
