package birenzi.dev.springbootmongodb.service;

import birenzi.dev.springbootmongodb.modelLayer.model.SignBoardTasks;
import birenzi.dev.springbootmongodb.modelLayer.repository.SignBoardTasksRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SignBoardTaskService {

    @Autowired
    private SignBoardTasksRepo boardTasksRepo;

    public List<SignBoardTasks> getAllBoardTasks(){
        return boardTasksRepo.findAll();
    }

    public SignBoardTasks postOneUser(SignBoardTasks task){
        return boardTasksRepo.insert(task);
    }

    public void deleteOneTask(String id){    boardTasksRepo.deleteById(id);


    }
}
