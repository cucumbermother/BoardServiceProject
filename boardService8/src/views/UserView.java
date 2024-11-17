package views;

import controllers.UserController;
import models.dto.MessageContext;
import models.dto.User;

import java.util.Scanner;

public class UserView {
    public Scanner sc = new Scanner(System.in);
    public UserController userController = new UserController();

    /**
     * sign up
     */
    public void signupView(){
        while (true) {
            System.out.println("---- sign up ----");
            System.out.println("Enter id: ");
            String id = sc.nextLine();
            if (!userController.checkId(id)) {
                System.out.println(MessageContext.USER_ALREADY);
                continue;
            }
            System.out.println("Enter password: ");
            String password = sc.nextLine();
            System.out.println("Enter name: ");
            String name = sc.nextLine();

            User user = userController.signUp(id, password, name);
            userController.addUser(user);
            return;
        }
    }

    /**
     * login
     */
    public boolean loginView() {
        System.out.println("---- login ----");
        System.out.println("Enter id: ");
        String id = sc.nextLine();
        System.out.println("Enter password: ");
        String password = sc.nextLine();

        if (userController.login(id, password)) {
            System.out.println(MessageContext.LOGIN_SUCCESS);
            return true;
        }
        System.out.println(MessageContext.LOGIN_ERROR);
        return false;

    }
}
