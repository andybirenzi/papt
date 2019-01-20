package birenzi.dev.springbootmongodb.modelLayer.repository;

import birenzi.dev.springbootmongodb.modelLayer.model.SignCategory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignCategoryRepo extends MongoRepository<SignCategory,String> {

}
