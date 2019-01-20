package birenzi.dev.springbootmongodb.service;

import birenzi.dev.springbootmongodb.modelLayer.model.TaskType;
import birenzi.dev.springbootmongodb.modelLayer.repository.TaskTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TaskTypeService {

    @Autowired
    private TaskTypeRepo taskTypeRepo;


    public List<TaskType> getAllTaskTypes(){
        return taskTypeRepo.findAll();
    }

    public TaskType postOneTaskType(TaskType taskType){
        return taskTypeRepo.insert(taskType);
    }


    public void deleteOneTaskType(String id){
           taskTypeRepo.deleteById(id);
    }

}
