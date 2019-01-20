package birenzi.dev.springbootmongodb.controller;

import birenzi.dev.springbootmongodb.modelLayer.model.TaskType;
import birenzi.dev.springbootmongodb.service.TaskTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class TaskTypeController {

    @Autowired
    private TaskTypeService taskTypeService;


    /*  Get*/
    @GetMapping("/getAllTaskTypes")
    public List<TaskType> getAllTaskTypes(){
        return taskTypeService.getAllTaskTypes();
    }

    // post
    @PostMapping("/addTaskType")
    public TaskType postOneTaskType(@RequestBody TaskType taskType){
        return taskTypeService.postOneTaskType(taskType);
    }


    // delete
    @DeleteMapping("/deleteTaskType/{id}")
    public void deleteOneTaskType(@PathVariable("id") String id){

           taskTypeService.deleteOneTaskType(id);


    }

}
