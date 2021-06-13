package com.krook1024.rest.repository;

import com.krook1024.rest.domain.User;
import com.krook1024.rest.repository.base.BaseRepository;
import java.util.Optional;

public interface UserRepository extends BaseRepository<User> {

    Optional<User> findByName(String name);

    void deleteByName(String name);

}
