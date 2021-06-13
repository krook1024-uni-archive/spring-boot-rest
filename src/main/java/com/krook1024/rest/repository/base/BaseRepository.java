package com.krook1024.rest.repository.base;

import java.util.List;

public interface BaseRepository<S> {

    List<S> findAll();

    void save(S s);

    void update(S s);
}
