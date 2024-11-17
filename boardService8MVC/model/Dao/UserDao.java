package day23.boardService8MVC.model.Dao;

import day23.boardService8MVC.model.Dto.UserDto;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static final UserDao userDao = new UserDao();

    public UserDao() {
    }

    public static UserDao getInstance() {
        return userDao;
    }
    public List<UserDto> users = new ArrayList<>();
    public UserDto user = new UserDto(); // 등록된 유저 저장

    /**
     * addUserDto
     * @param user
     */
    public void addUserDto(UserDto user) {
        System.out.println("sign up:" + user);
        users.add(user);
    }

    /**
     * checkUserDto
     * @param id,password
     * @return
     */
    public Boolean checkUserDto(String id, String password) {
        for (UserDto user : users) {
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
        for (UserDto user : users) {
            if (user.checkId(id)){
                System.out.println("This id already in");
                return false;
            }
        }
        return true;
    }
}
