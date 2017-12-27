package com.fan.service.impl;

import com.fan.model.AppUser;
import com.fan.repository.AppUserRepository;
import com.fan.repository.RoleRepository;
import com.fan.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;

/**
 * Created by Pawel on 25.12.2017.
 */
@Service
public class AppUserServiceImpl implements AppUserService {
    @Autowired
    AppUserRepository appUserRepository;
    @Autowired
    RoleRepository roleRepository;

    @SuppressWarnings("unchecked")
    @Override
    public void save(AppUser user) {
        user.setPassword(user.getPassword());
        user.setRoles(new HashSet<>(roleRepository.findAll()));
        appUserRepository.save(user);
    }

    @Override
    public AppUser findByUsername(String username) {
        return appUserRepository.findByUsername(username);
    }
}
