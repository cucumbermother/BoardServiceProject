package models.dao;

import models.dto.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static final UserDao userDao = new UserDao();

    public UserDao() {
    }

    public static UserDao getInstance() {
        return userDao;
    }
    public List<User> users = new ArrayList<>();
    public User user = new User();

    /**
     * addUser
     * @param user
     */
    public void addUser(User user) {
        System.out.println("sign up:" + user);
        users.add(user);
    }

    /**
     * checkUser
     * @param id,password
     * @return
     */
    public Boolean checkUser(String id, String password) {
        for (User user : users) {
            if (user.checkUser(id, password)){
                userDao.user = user;
                System.out.println(userDao.user);
                return true;
            }
        }
        return false;
    }

    /**
     * checkId
     * @param id
     * @return
     */
    public Boolean checkId(String id) {
        for (User user : users) {
            if (user.checkId(id)){
                System.out.println("This id already in");
                return false;
            }
        }
        return true;
    }
}
