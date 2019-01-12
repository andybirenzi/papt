package birenzi.dev.springbootmongodb.repository;

import birenzi.dev.springbootmongodb.model.SignCategory;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;
@Document
public interface SignCategoryRepo extends MongoRepository<SignCategory,String> {

}
