package birenzi.dev.springbootmongodb.service;

import birenzi.dev.springbootmongodb.modelLayer.model.Sign;
import birenzi.dev.springbootmongodb.modelLayer.repository.SignRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SignService {

    @Autowired
    private SignRepo signRepo;

    public List<Sign> getAllSigns(){
        return signRepo.findAll();
    }
    public Sign postOneSign(Sign sign){
        return signRepo.insert(sign);
    }
    public void deleteOneSign(String id){
           signRepo.deleteById(id);
    }


}
