package views;

import controllers.BoardController;
import controllers.UserController;
import models.dto.Board;

import java.util.Scanner;

public class BoardView {
    public Scanner sc = new Scanner(System.in);
    public UserController userController = new UserController();
    public BoardController boardController = new BoardController();
    public void write() {
        System.out.println("---- BOARD ----");
        System.out.println("---- USER: " + userController.getUser().getName() + " ----");
        System.out.println("Please enter your Message: ");
        String message = sc.nextLine();
        boardController.addBoard(message);
    }
    public void readMyPosts() {
        System.out.println("---- BOARD ----");
        System.out.println("---- USER: " + userController.getUser().getName() + " ----");
        for (Board board : boardController.boardDao.boardList) {
            if (board.getUserName().equals(userController.getUser().getName())){
                System.out.println(board);
            }
        }
    }

    public void readFullPosts() {
        System.out.println("---- BOARD ----");
        System.out.println("---- USER: " + userController.getUser().getName() + " ----");
        for (Board board : boardController.boardDao.boardList) {
                System.out.println(board);
        }
    }
}
