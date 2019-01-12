package birenzi.dev.springbootmongodb.repository;

import birenzi.dev.springbootmongodb.model.SignBoardTasks;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignBoardTasksRepo extends MongoRepository<SignBoardTasks,String> {
}
