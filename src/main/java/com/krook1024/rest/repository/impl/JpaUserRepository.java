package com.krook1024.rest.repository.impl;

import com.krook1024.rest.dataaccess.dao.UserDao;
import com.krook1024.rest.dataaccess.projection.UserProjection;
import com.krook1024.rest.domain.User;
import com.krook1024.rest.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Repository;

@Repository
public class JpaUserRepository implements UserRepository {

    private final UserDao userDao;

    public JpaUserRepository(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Optional<User> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public void deleteByName(String name) {

    }

    @Override
    public List<User> findAll() {
        return mapToUsers(userDao.findAll());
    }

    @Override
    public void save(User user) {

    }

    @Override
    public void update(User user) {

    }

    private List<User> mapToUsers(List<UserProjection> userProjections) {
        return userProjections.stream()
            .map(this::mapToUser)
            .collect(Collectors.toList());
    }

    private User mapToUser(UserProjection userProjection) {
        User.UserBuilder userBuilder = User.builder();

        userBuilder.name(userProjection.getName())
            .password(userProjection.getPassword())
            .isAdmin(userProjection.getIsAdmin())
            .createdAt(userProjection.getCreatedAt());

        return userBuilder.build();
    }
}
