package views;

import models.dto.MessageContext;

import java.util.Scanner;

public class MainView {
    public Scanner sc = new Scanner(System.in);
    public UserView userView = new UserView();
    public BoardView boardView = new BoardView();
    public void mainView(){
        while(true) {
            System.out.println("---- US_BR ----");
            System.out.println("1.Login");
            System.out.println("2.SignUp");
            System.out.println("*.Exit");
            System.out.println(MessageContext.CHOICE);
            int choice = 0;
            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println(MessageContext.ERROR);
                sc.nextLine();
                continue;
            }
            switch (choice) {
                case 1:
                    boolean b = userView.loginView();
                    if (b){
                        boardMainView();
                    }
                    break;
                case 2:
                    userView.signupView();
                    break;

                default:
                    System.out.println("System end");
                    return;
            }
        }
    }

    public void boardMainView(){
        while(true) {
            System.out.println("---- BOARD ----");
            System.out.println("---- USER: " + userView.userController.getUser().getName() + " ----");
            System.out.println("1.write");
            System.out.println("2.Full posts print");
            System.out.println("2.Only my posts print");
            System.out.println("*.logout");
            System.out.println(MessageContext.CHOICE);
            int choice = 0;
            try {
                choice = sc.nextInt();
            }catch (Exception e) {
                System.out.println(MessageContext.ERROR);
                sc.nextLine();
                continue;
            }
            switch (choice) {
                case 1:
                    boardView.write();
                    break;
                case 2:
                    boardView.readFullPosts();
                    break;
                case 3:
                    boardView.readMyPosts();
                    break;
                default:
                    userView.userController.logout();
                    return;
            }
        }

    }
}
