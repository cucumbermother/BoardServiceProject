package models.dto;

import models.dao.UserDao;

public class Board {
    private String userName;
    private String content;

    public Board(String userName, String content) {
        this.userName = userName;
        this.content = content;
    }

    public Board() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Board{" +
                "userName=" + userName +
                ", content='" + content + '\'' +
                '}';
    }
}
