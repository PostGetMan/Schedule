package org.postgetman.schedule.app.service;

import org.postgetman.schedule.app.domain.user.User;
import org.postgetman.schedule.app.dto.LoginDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<User> findAll();

    User findOne(Long id);

    User findByLogin(final String login);

    void saveUser(User user);

    void deleteUser(Long id);

    boolean isExist(User user);

    User validateUser(LoginDTO loginDTO);

}
