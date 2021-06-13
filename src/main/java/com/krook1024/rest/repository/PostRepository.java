package com.krook1024.rest.repository;

import com.krook1024.rest.domain.Post;
import com.krook1024.rest.repository.base.BaseRepository;
import java.util.Optional;

public interface PostRepository extends BaseRepository<Post> {

    Optional<Post> findByTitle(String title);

    void deleteByTitle(String title);
}
