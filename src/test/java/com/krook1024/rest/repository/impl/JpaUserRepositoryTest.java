package com.krook1024.rest.repository.impl;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import com.krook1024.rest.dataaccess.dao.UserDao;
import com.krook1024.rest.dataaccess.projection.UserProjection;
import com.krook1024.rest.domain.User;
import com.krook1024.rest.repository.UserRepository;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class JpaUserRepositoryTest {

    private UserRepository underTest;

    @Mock
    private UserDao userDao;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        underTest = new JpaUserRepository(userDao);
    }

    @Test
    public void testFindAllUsers() {
        // given
        Date date = new Date();
        UUID uuid = new UUID(1, 1);
        List<UserProjection> userProjections = List.of(
            new UserProjection(uuid , "test", "test", date, true)
        );
        given(userDao.findAll()).willReturn(userProjections);

        // when
        List<User> found = underTest.findAll();

        // then
        List<User> expected = List.of(
            new User("test", "test", date, true)
        );
        assertEquals(expected, found);
        verify(userDao).findAll();
        verifyNoMoreInteractions(userDao);
    }
}