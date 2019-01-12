package birenzi.dev.springbootmongodb.repository;

import birenzi.dev.springbootmongodb.model.TaskStatus;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskStatusRepo extends MongoRepository<TaskStatus,String>{
}
