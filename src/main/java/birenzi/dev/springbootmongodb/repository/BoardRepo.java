package birenzi.dev.springbootmongodb.repository;

import birenzi.dev.springbootmongodb.model.SignBoard;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepo extends MongoRepository<SignBoard,String> {
}
