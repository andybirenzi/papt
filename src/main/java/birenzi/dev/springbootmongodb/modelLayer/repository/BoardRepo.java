package birenzi.dev.springbootmongodb.modelLayer.repository;

import birenzi.dev.springbootmongodb.modelLayer.model.SignBoard;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepo extends MongoRepository<SignBoard,String> {

}
