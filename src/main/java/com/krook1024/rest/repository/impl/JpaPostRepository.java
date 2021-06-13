package com.krook1024.rest.repository.impl;

import com.krook1024.rest.domain.Post;
import com.krook1024.rest.repository.PostRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class JpaPostRepository implements PostRepository {

    @Override
    public Optional<Post> findByTitle(String title) {
        return Optional.empty();
    }

    @Override
    public void deleteByTitle(String title) {

    }

    @Override
    public List<Post> findAll() {
        return null;
    }

    @Override
    public void save(Post post) {

    }

    @Override
    public void update(Post post) {

    }
}
