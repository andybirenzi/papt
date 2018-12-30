package birenzi.dev.springbootmongodb.repository;

import birenzi.dev.springbootmongodb.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import static org.springframework.data.mongodb.core.query.Criteria.where;

@Repository
public interface UserRepo extends MongoRepository<User,String> {
//    @Query(new org.springframework.data.mongodb.core.query.Query(where("userName").is(userName)),User.class))
     User findUserByUserName(String username);
}
