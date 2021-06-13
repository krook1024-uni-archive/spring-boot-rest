package com.krook1024.rest.presentation.api.controller;

import com.krook1024.rest.domain.Post;
import com.krook1024.rest.repository.PostRepository;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    private final PostRepository postRepository;

    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @GetMapping("/post")
    public List<Post> getAllPosts() {
        return List.of();
    }
}
