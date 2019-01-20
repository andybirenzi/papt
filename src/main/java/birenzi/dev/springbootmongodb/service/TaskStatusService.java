package birenzi.dev.springbootmongodb.service;

import birenzi.dev.springbootmongodb.modelLayer.model.TaskStatus;
import birenzi.dev.springbootmongodb.modelLayer.repository.TaskStatusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TaskStatusService {


    @Autowired
    private TaskStatusRepo taskStatusRepo;

    public List<TaskStatus> getAllTaskStatus(){
        return taskStatusRepo.findAll();
    }

    public TaskStatus postOneTaskStatus(TaskStatus status){
        return taskStatusRepo.insert(status);
    }

    public void deleteOneTaskStatus(String id){
        taskStatusRepo.deleteById(id);
    }


}
