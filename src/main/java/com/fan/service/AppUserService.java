package com.fan.service;

import com.fan.model.AppUser;

/**
 * Created by Pawel on 25.12.2017.
 */
public interface AppUserService {
    void save(AppUser user);

    AppUser findByUsername(String username);
}
