package birenzi.dev.springbootmongodb.repository;

import birenzi.dev.springbootmongodb.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends MongoRepository<Role, String> {
}
