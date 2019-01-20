package birenzi.dev.springbootmongodb.modelLayer.repository;

import birenzi.dev.springbootmongodb.modelLayer.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends MongoRepository<User,String> {
//    @Query(new org.springframework.data.mongodb.core.query.Query(where("userName").is(userName)),User.class))
     User findUserByUserName(String username);
}
