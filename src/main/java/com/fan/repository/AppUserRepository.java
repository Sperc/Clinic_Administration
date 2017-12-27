package com.fan.repository;

import com.fan.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Pawel on 24.12.2017.
 */
public interface AppUserRepository extends JpaRepository<AppUser,Long> {
    AppUser findByUsername(String username);
}
