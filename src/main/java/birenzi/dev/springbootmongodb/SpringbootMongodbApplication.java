package birenzi.dev.springbootmongodb;

import birenzi.dev.springbootmongodb.repository.BoardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringbootMongodbApplication {
	@Autowired
	private BoardRepo repo;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMongodbApplication.class, args);
	}


}

