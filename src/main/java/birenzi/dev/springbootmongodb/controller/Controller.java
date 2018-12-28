package birenzi.dev.springbootmongodb.controller;

import birenzi.dev.springbootmongodb.Board;
import birenzi.dev.springbootmongodb.BoardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private BoardRepo repo;
    @GetMapping("/")
    public List<Board> getAll(){
        return repo.findAll();
    }
}
