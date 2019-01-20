package birenzi.dev.springbootmongodb.service;

import birenzi.dev.springbootmongodb.modelLayer.model.SignCategory;
import birenzi.dev.springbootmongodb.modelLayer.repository.SignCategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SignCategoryService {

    @Autowired
    private SignCategoryRepo signCategoryRepo;

    public List<SignCategory> getAll(){
        return signCategoryRepo.findAll();
    }

    public SignCategory postOneUser(SignCategory category){
        return signCategoryRepo.insert(category);
    }

    public void deleteOneSignCategory(String id){
        signCategoryRepo.deleteById(id);
    }

}
