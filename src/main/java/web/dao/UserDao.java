package web.dao;

import web.model.User;
import java.util.List;

public interface UserDao {

    void createUser(User user);

    List<User> getAllUsers();

    void deleteUserById(Long id);

    void updateUserById(Long userId, String name, String lastName, Long age);

    User getUserById(Long id);
}
