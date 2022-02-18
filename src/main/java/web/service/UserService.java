package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> show();
    User getUserById(int id);
    void addUser(User user);
    void removeUser(int id);
    void updateUser(User user);
}
