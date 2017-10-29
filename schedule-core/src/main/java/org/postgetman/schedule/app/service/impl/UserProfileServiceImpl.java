package org.postgetman.schedule.app.service.impl;

import org.postgetman.schedule.app.domain.user.UserProfile;
import org.postgetman.schedule.app.service.UserProfileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserProfileServiceImpl implements UserProfileService{

    private final Logger LOGGER = LoggerFactory.getLogger(UserProfileServiceImpl.class);

    @Override
    public List<UserProfile> findAll() {
        return null;
    }

    @Override
    public UserProfile findOne(Long id) {
        return null;
    }

    @Override
    public void save(UserProfile userProfile) {
    }

    @Override
    public void update(Long id, UserProfile userProfile) {

    }

    @Override
    public void delete(UserProfile userProfile) {
    }
}
