package org.postgetman.schedule.app.service;

import org.postgetman.schedule.app.domain.user.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<User> findAll();

    User findOne(Long id);

    User findByEmail(final String email);

    void saveUser(User user);

    void deleteUser(Long id);

    void deleteUser(final String email);

    boolean isExist(User user);

    boolean isRegister();
}
