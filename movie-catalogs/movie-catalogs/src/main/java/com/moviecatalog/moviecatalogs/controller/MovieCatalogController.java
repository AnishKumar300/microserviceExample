package com.moviecatalog.moviecatalogs.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.moviecatalog.moviecatalogs.model.Movie;
import com.moviecatalog.moviecatalogs.model.MovieCatalog;
import com.moviecatalog.moviecatalogs.model.MovieRating;

@RestController
public class MovieCatalogController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping("/moviecatalog")
	public List<MovieCatalog> getMovieCatalog(){
		
		// movieList
		Movie[] movie = restTemplate.getForObject("http://movie-list/movies", Movie[].class); 
		List<Movie> movies  = Arrays.asList(movie);
		// movie rating
		 return movies.stream().map(ml -> {
			  MovieRating movieRating = restTemplate.getForObject("http://movie-rating/movie-ratings/"+ml.getMovieName(), MovieRating.class);
			  
			  return new MovieCatalog(ml.getMovieName(), ml.getYear(), movieRating.getRating());
		  }).collect(Collectors.toList());
	}
}
