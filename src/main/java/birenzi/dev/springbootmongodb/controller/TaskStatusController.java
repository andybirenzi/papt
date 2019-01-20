package birenzi.dev.springbootmongodb.controller;

import birenzi.dev.springbootmongodb.modelLayer.model.TaskStatus;
import birenzi.dev.springbootmongodb.service.TaskStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class TaskStatusController {


    @Autowired
    private TaskStatusService taskStatusService;

    /*  Get*/
    @GetMapping("/getAllTaskStatuses")
    public List<TaskStatus> getAllTaskStatus(){
        return taskStatusService.getAllTaskStatus();
    }

    // post
    @PostMapping("/addTaskStatus")
    public TaskStatus postOneTaskStatus(@RequestBody TaskStatus status){
        return taskStatusService.postOneTaskStatus(status);
    }

    // delete

    @DeleteMapping("/deleteTaskStatus/{id}")
    public void deleteOneTaskStatus(@PathVariable("id") String id){
        taskStatusService.deleteOneTaskStatus(id);
    }


}
