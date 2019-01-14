package birenzi.dev.springbootmongodb.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import birenzi.dev.springbootmongodb.model.Location;
import birenzi.dev.springbootmongodb.model.SignBoard;
import birenzi.dev.springbootmongodb.model.User;

@RunWith(SpringRunner.class)
@DataJpaTest
public class BoardRepoTest {

	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	private BoardRepo boardRepo;

	@Test
	public void shouldReturnBoardfoundById() {

		// given
		SignBoard board = new SignBoard("1", "1", 541255, 54585, "great", "viva", new Date(),
				new User("1", "Bir", "Andrew", "Mateo", "papt", "mateo21", "mateo@gmail.com", "75228754"),
				new Location("Makamba", "Burundi"));

		entityManager.persist(board);
		entityManager.flush();

		// when
		SignBoard boardFound = boardRepo.findByNumber(board.getNumber());
		
		assertThat(board.getId()).isEqualTo(boardFound.getId());

	}

}
