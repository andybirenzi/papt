package birenzi.dev.springbootmongodb.modelLayer.repository;

import birenzi.dev.springbootmongodb.modelLayer.model.Sign;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignRepo extends MongoRepository<Sign,String> {
}
