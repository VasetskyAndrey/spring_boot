package app.spring_boot.service;

import app.spring_boot.entity.User;
import java.util.List;

public interface UserService {
    public void create(User user);
    public User read(Long id);
    public void update(User user);
    public void delete(Long id);

    List<User> getAllUsers();
}
