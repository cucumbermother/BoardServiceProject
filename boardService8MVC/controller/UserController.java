package day23.boardService8MVC.controller;

import day23.boardService8MVC.model.Dao.UserDao;
import day23.boardService8MVC.model.Dto.MessageContext;
import day23.boardService8MVC.model.Dto.UserDto;

public class UserController {
    private final UserDao userDao = UserDao.getInstance();

    /**
     * signUp
     * @param id
     * @param password
     * @param name
     * @return
     */
    public UserDto signUp(String id, String password, String name) {
        UserDto user = new UserDto(id, password, name);
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
        return userDao.checkUserDto(id, password);
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
     * addUserDto
     * @param user
     */
    public void addUserDto(UserDto user) {
        userDao.addUserDto(user);
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
     * getUserDtoName
     * @return
     */
    public UserDto getUserDto() {
        return userDao.user;
    }
}
