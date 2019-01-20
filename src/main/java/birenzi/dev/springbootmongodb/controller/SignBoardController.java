package birenzi.dev.springbootmongodb.controller;

import birenzi.dev.springbootmongodb.modelLayer.model.SignBoard;
import birenzi.dev.springbootmongodb.service.SignBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 *
 */
@RestController
public class SignBoardController {

    @Autowired
    private SignBoardService boardService;

    /*  Get*/
    @GetMapping("/getAllSignBoards")
    public List<SignBoard> getAllSignBoards(){
        return boardService.getAllSignBoards();
    }


    // post

    @PostMapping("/addBoard")
    public SignBoard postOneBoard(@RequestBody SignBoard signBoard){
        return boardService.postOneBoard(signBoard);
    }

    // delete
    @DeleteMapping("/deleteSignBoard/{id}")
    public void deleteOneSignBoard(@PathVariable("id") String id){
        boardService.deleteOneSignBoard(id);
    }


}
