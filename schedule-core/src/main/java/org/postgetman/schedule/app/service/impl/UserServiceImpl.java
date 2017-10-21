package org.postgetman.schedule.app.service.impl;

import org.postgetman.schedule.app.domain.user.User;
import org.postgetman.schedule.app.exception.UserAlreadyExist;
import org.postgetman.schedule.app.exception.UserNotFoundException;
import org.postgetman.schedule.app.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    private List<User> userList;

    public UserServiceImpl(){
        userList = new ArrayList<>();
    }

    @Override
    public List<User> findAll() {
        return userList;
    }

    @Override
    public User findOne(Long id) {
        for(User u : userList){
            if(u.getId().equals(id)){
                return u;
            }
        }

        LOGGER.error("No user with id: {}",id);
        throw new UserNotFoundException("No such user");
    }

    @Override
    public User findByEmail(String email) {
        for(User u : userList){
            if(u.getEmail().equals(email)){
                return u;
            }
        }
        LOGGER.error("There is no user with email: {}",email);
        throw new UserNotFoundException("No such user");
    }

    @Override
    public void saveUser(User user) {
        if(!userList.contains(user) && !isExist(user)){
            userList.add(user);
        }
    }

    @Override
    public void deleteUser(Long id) {
        userList.removeIf(user -> user.getId().equals(id));
    }

    @Override
    public void deleteUser(String email) {
        userList.removeIf(user -> user.getEmail().equals(email));
    }

    @Override
    public boolean isExist(User user) {
        for(User u : userList){
            if(u.getEmail().equals(user.getEmail()) ||
                    u.getLogin().equalsIgnoreCase(user.getLogin())){

                LOGGER.error("User already exist");
                throw new UserAlreadyExist("User already exist with that loogin or email");
            }
        }
        return false;
    }

    @Override
    public boolean isRegister() {
        return false;
    }
}
