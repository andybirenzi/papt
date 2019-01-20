package birenzi.dev.springbootmongodb.service;

import birenzi.dev.springbootmongodb.modelLayer.model.Role;
import birenzi.dev.springbootmongodb.modelLayer.repository.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    private RoleRepo roleRepo;

    public List<Role> getAllRoles(){
        return roleRepo.findAll();
    }

    public Role addOneRole(Role role){
        return roleRepo.insert(role);
    }

    public void deleteOneRole(String id){roleRepo.deleteById(id);

    }
}
