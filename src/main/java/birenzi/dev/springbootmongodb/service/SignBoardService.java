package birenzi.dev.springbootmongodb.service;

import birenzi.dev.springbootmongodb.modelLayer.model.SignBoard;
import birenzi.dev.springbootmongodb.modelLayer.repository.BoardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SignBoardService {
    @Autowired
    private BoardRepo boardRepo;

    public List<SignBoard> getAllSignBoards() {
        return boardRepo.findAll();
    }

    public SignBoard postOneBoard(SignBoard signBoard) {
        return boardRepo.insert(signBoard);
    }

    public void deleteOneSignBoard(String id) {      boardRepo.deleteById(id);

    }
}
