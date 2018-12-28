package birenzi.dev.springbootmongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringbootMongodbApplication {
	@Autowired
	private BoardRepo repo;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMongodbApplication.class, args);
	}
	@Bean
	CommandLineRunner init() {

		return args -> {

			Board board1 = new Board(1,"Andy", new Address("Buja","Burundi"));
			Board board2 = new Board(3,"Bill", new Address("Mwaro","Burundi"));
			Board board3 = new Board(5,"Will", new Address("Rumonge","Burundi"));

			List<Board> list = Arrays.asList(board1,board2,board3);
			repo.insert(list);

		};

	}

}

