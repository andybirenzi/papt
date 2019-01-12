package birenzi.dev.springbootmongodb.repository;

import birenzi.dev.springbootmongodb.model.TaskType;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskTypeRepo extends MongoRepository<TaskType,String > {
}
