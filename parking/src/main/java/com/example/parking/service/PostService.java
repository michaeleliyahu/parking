package com.example.parking.service;
import com.example.parking.Repository.PostRepository;
import com.example.parking.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;


@Service
public class PostService {

    private final PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public String savePost(@RequestBody Post post)
    {
        postRepository.save(post);
        return "added book with id:" +post.getId();
    }

    public List<Post> getPosts()
    {
        return postRepository.findAll();
    }

    public Optional<Post> getPost(@PathVariable int id)
    {
        return postRepository.findById(id);
    }

    public String deletePost(@PathVariable int id) {
        postRepository.findById(id);
        return "book deleted with id : " + id;
    }

}
