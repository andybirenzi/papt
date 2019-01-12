package birenzi.dev.springbootmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskType extends MongoRepository<TaskType,String > {
}
