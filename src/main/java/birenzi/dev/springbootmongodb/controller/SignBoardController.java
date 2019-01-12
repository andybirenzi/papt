package birenzi.dev.springbootmongodb.controller;

import birenzi.dev.springbootmongodb.model.SignBoard;
import birenzi.dev.springbootmongodb.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class SignBoardController {

    @Autowired
    private BoardRepo boardRepo;

    /*  Get*/
    @GetMapping("/getAllSignBoards")
    public List<SignBoard> getAllSignBoards(){
        return boardRepo.findAll();
    }


    // post

    @PostMapping("/addBoard")
    public SignBoard postOneBoard(@RequestBody SignBoard signBoard){
        return boardRepo.insert(signBoard);
    }

    // delete
    @DeleteMapping("/deleteSignBoard/{id}")
    public void deleteOneSignBoard(@PathVariable("id") String id){

           boardRepo.deleteById(id);


    }


}
