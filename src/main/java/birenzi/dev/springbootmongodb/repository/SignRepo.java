package birenzi.dev.springbootmongodb.repository;

import birenzi.dev.springbootmongodb.model.Sign;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignRepo extends MongoRepository<Sign,String> {
}
