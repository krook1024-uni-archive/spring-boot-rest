package com.krook1024.rest.dataaccess.dao;

import com.krook1024.rest.dataaccess.projection.UserProjection;
import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<UserProjection, UUID> {

    Optional<UserProjection> findByName(String name);
}
