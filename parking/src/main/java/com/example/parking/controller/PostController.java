package com.example.parking.controller;

import com.example.parking.models.Post;
//import com.example.parking.service.PostService;
import com.example.parking.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
//@RequestMapping(path = "api/v1/post")
public class PostController {

    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping("/addPost")
    public String savePost(@RequestBody Post post)
    {
        return postService.savePost(post);
    }

    @GetMapping("/findAllPosts")
    public List<Post> getPosts()
    {
        return postService.getPosts();
    }

    @GetMapping("/findPost/{id}")
    public Optional<Post> getPost(@PathVariable int id)
    {
        return postService.getPost(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deletePost(@PathVariable int id) {
        return postService.deletePost(id);
    }
}
