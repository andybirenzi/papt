package birenzi.dev.springbootmongodb.modelLayer.repository;

import birenzi.dev.springbootmongodb.modelLayer.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends MongoRepository<Role, String> {
}
