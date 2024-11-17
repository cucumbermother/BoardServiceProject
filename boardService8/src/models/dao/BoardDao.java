package models.dao;

import models.dto.Board;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    public static final BoardDao boardDao = new BoardDao();
    private BoardDao() {

    }
    public static BoardDao getInstance() {
        return boardDao;
    }
    public List<Board> boardList = new ArrayList<>();

    public void addBoard(String userName, String content) {
        Board board = new Board(userName, content);
        boardList.add(board);
    }
}
