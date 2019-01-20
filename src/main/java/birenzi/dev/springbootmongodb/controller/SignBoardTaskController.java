package birenzi.dev.springbootmongodb.controller;

import birenzi.dev.springbootmongodb.modelLayer.model.SignBoardTasks;
import birenzi.dev.springbootmongodb.service.SignBoardTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class SignBoardTaskController {

    /*  Break this controller into multiple controllers*/

    @Autowired
    private SignBoardTaskService boardTasksService;

    /*  Get*/
    @GetMapping("/getAllSignBoardsTasks")
    public List<SignBoardTasks> getAllBoardTasks(){
        return boardTasksService.getAllBoardTasks();
    }

    // post
    @PostMapping("/addBoardTask")
    public SignBoardTasks postOneUser(@RequestBody SignBoardTasks task){
        return boardTasksService.postOneUser(task);
    }

    // delete
    @DeleteMapping("/deleteBoardTask/{id}")
    public void deleteOneTask(@PathVariable("id") String id){
        boardTasksService.deleteOneTask(id);
    }


}
