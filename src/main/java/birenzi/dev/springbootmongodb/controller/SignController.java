package birenzi.dev.springbootmongodb.controller;

import birenzi.dev.springbootmongodb.modelLayer.model.Sign;
import birenzi.dev.springbootmongodb.service.SignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class SignController {


    @Autowired
    private SignService SignService;


    /*  Get*/
    @GetMapping("/getAllSigns")
    public List<Sign> getAllSigns(){
        return SignService.getAllSigns();
    }


    // post
    @PostMapping("/addSign")
    public Sign postOneSign(@RequestBody Sign sign){
        return SignService.postOneSign(sign);
    }

    // delete
    @DeleteMapping("/deleteSign/{id}")
    public void deleteOneSign(@PathVariable("id") String id){

           SignService.deleteOneSign(id);


    }


}
