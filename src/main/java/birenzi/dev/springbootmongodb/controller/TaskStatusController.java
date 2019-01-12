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
    @GetMapping("/getAllSignBoards")
    public List<TaskStatus> getAllTaskStatus(){
        return taskStatusRepo.findAll();
    }

    // post
    @PostMapping("/addUser")
    public TaskStatus postOneTaskStatus(@RequestBody TaskStatus status){
        return taskStatusRepo.insert(status);
    }

    // delete

    @DeleteMapping("/deleteBoard/{id}")
    public void deleteOneBoard(@PathVariable("id") String id){
        taskStatusRepo.deleteById(id);
    }


}
