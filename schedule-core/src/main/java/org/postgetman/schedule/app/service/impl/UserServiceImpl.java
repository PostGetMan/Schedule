package org.postgetman.schedule.app.service.impl;

import org.postgetman.schedule.app.domain.user.User;
import org.postgetman.schedule.app.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

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
        return null;
    }

    @Override
    public User findByEmail(String email) {
        for(User u : userList){
            if(u.getEmail().equals(email)){
                return u;
            }
        }
        return null;
    }

    @Override
    public void saveUser(User user) {
        if(!userList.contains(user)){
            userList.add(user);
        }
    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public void deleteUser(String email) {
        userList.removeIf(user -> user.getEmail().equals(email));
    }

    @Override
    public boolean isRegister() {
        return false;
    }
}
