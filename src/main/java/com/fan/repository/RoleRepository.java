package com.fan.repository;

import com.fan.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Pawel on 24.12.2017.
 */
public interface RoleRepository extends JpaRepository<Role,Long> {
}
