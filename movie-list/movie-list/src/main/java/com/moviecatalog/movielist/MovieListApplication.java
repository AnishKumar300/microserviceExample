package com.moviecatalog.movielist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication

public class MovieListApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieListApplication.class, args);
		
	}

}
