package com.example.parking;

import com.example.parking.controller.PostController;
import com.example.parking.models.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ParkingApplication {

//	private final PostController postController;
//
//	@Autowired
//	public ParkingApplication(PostController postController) {
//		this.postController = postController;
//	}
//	@GetMapping
//	public List<Post> getPosts()
//	{
//		return postController.getPosts();
//	}
	public static void main(String[] args) {
		SpringApplication.run(ParkingApplication.class, args);
	}

}
