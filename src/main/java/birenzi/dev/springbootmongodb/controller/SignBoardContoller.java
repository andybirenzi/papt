package birenzi.dev.springbootmongodb.controller;

import birenzi.dev.springbootmongodb.model.SignBoard;
import birenzi.dev.springbootmongodb.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class SignBoardContoller {

    /*  Break this controller into multiple controllers*/

    @Autowired
    private BoardRepo boardRepo;

    /*  Get*/
    @GetMapping("/getAllSignBoards")
    public List<SignBoard> getAll(){
        return boardRepo.findAll();
    }


    // post

    @PostMapping("/addBoard")
    public SignBoard postOneBoard(@RequestBody SignBoard signBoard){
        return boardRepo.insert(signBoard);
    }

    // delete
    @DeleteMapping("/deleteUser/{id}")
    public void deleteOneUser(@PathVariable("id") String id){

           boardRepo.deleteById(id);


    }


}
