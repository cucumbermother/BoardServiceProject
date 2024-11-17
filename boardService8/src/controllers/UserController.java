package controllers;


import models.dao.UserDao;
import models.dto.MessageContext;
import models.dto.User;

public class UserController {
    private final UserDao userDao = UserDao.getInstance();

    /**
     * signUp
     * @param id
     * @param password
     * @param name
     * @return
     */
    public User signUp(String id, String password, String name) {
        User user = new User(id, password, name);
        System.out.println(MessageContext.SUCCESS);
        return user;
    }

    /**
     * login
     * @param id
     * @param password
     * @return
     */
    public Boolean login(String id, String password) {
        return userDao.checkUser(id, password);
    }

    /**
     * logout
     * @return
     */
    public Boolean logout(){
        userDao.user = null;
        return true;
    }

    /**
     * addUser
     * @param user
     */
    public void addUser(User user) {
        userDao.addUser(user);
    }

    /**
     * checkId
     * @param id
     * @return
     */
    public boolean checkId(String id) {
        return userDao.checkId(id);
    }

    /**
     * getUserName
     * @return
     */
    public User getUser() {
        return userDao.user;
    }
}
