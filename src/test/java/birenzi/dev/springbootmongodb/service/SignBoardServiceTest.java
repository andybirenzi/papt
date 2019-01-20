package birenzi.dev.springbootmongodb.service;

import static org.mockito.Mockito.*;


import birenzi.dev.springbootmongodb.modelLayer.model.Location;
import birenzi.dev.springbootmongodb.modelLayer.model.SignBoard;
import birenzi.dev.springbootmongodb.modelLayer.model.User;
import birenzi.dev.springbootmongodb.modelLayer.repository.BoardRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SignBoardServiceTest {

    @Autowired
    SignBoardService signBoardService;

    @Mock
    BoardRepo boardRepo;

    @Test
    public void getAllSignBoards() {
        when(boardRepo.findAll()).thenReturn(Stream.
                of(new SignBoard("12",41255981,7856889,"dimensions",
                        "une description",new Date("01/01/2019"),new User(),new Location())
                        ,new SignBoard("12",41255981,7856889,"dimensions",
                                "une description",new Date("01/01/2019"),new User(),new Location())).collect(Collectors.toList()));
        assertEquals(2,signBoardService.getAllSignBoards().size());
    }

    @Test
    public void postOneBoard() {

        SignBoard signBoard = new SignBoard("12",41255981,7856889,"dimensions",
                "une description",new Date("01/01/2019"),new User(),new Location());
        when(boardRepo.insert(signBoard)).thenReturn(signBoard);
        assertEquals(signBoard,signBoardService.postOneBoard(signBoard));
    }

    @Test
    public void deleteOneSignBoard() {
       String id = "12";
       signBoardService.deleteOneSignBoard(id);
       verify(boardRepo,times(1)).deleteById(id);

    }
}