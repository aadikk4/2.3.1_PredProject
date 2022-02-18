package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> show();
    User getUserById(int id);
    void addUser(User user);
    void removeUser(int id);
    void updateUser(User user);

}
