package controllers;

import models.dao.BoardDao;
import models.dao.UserDao;

public class BoardController {
    public UserDao userDao = UserDao.getInstance();
    public BoardDao boardDao = BoardDao.getInstance();
    public void addBoard(String message) {
        boardDao.addBoard(userDao.user.getName(),message);
    }
}
