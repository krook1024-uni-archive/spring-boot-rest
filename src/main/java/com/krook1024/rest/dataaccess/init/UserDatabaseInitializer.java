package com.krook1024.rest.dataaccess.init;

import com.krook1024.rest.dataaccess.dao.UserDao;
import com.krook1024.rest.dataaccess.projection.UserProjection;
import java.util.Date;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class UserDatabaseInitializer {

    public static final String DEFAULT_ADMIN_USERNAME = "admin";
    public static final String DEFAULT_ADMIN_PASSWORD = "admin";
    private final UserDao userDao;

    public UserDatabaseInitializer(UserDao userDao) {
        this.userDao = userDao;
    }

    @PostConstruct
    public void initDatabase() {
        if (userDao.findByName("admin").isEmpty()) {
            UserProjection.UserProjectionBuilder userProjectionBuilder
                = UserProjection.builder();

            userProjectionBuilder.id(null);
            userProjectionBuilder.name(DEFAULT_ADMIN_USERNAME);
            userProjectionBuilder.password(DEFAULT_ADMIN_PASSWORD);
            userProjectionBuilder.createdAt(new Date());
            userProjectionBuilder.isAdmin(true);

            userDao.save(userProjectionBuilder.build());
        }
    }
}
