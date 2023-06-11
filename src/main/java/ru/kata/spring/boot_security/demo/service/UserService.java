package ru.kata.spring.boot_security.demo.service;


import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.model.User;
import java.util.List;


public interface UserService extends UserDetailsService {
    void addUser(User user);
    void deleteUser(User user);
    void deleteUser(long id);
    void modifyUser(User user);
    User findUserById(long id);
    List<User> getUsersList();
}
