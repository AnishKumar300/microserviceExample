package com.moviecatalog.movierating.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.moviecatalog.movierating.model.MovieRatingModel;

@RestController

public class MovieRatingController {

	@GetMapping("/movie-ratings/{moviename}")
	public MovieRatingModel getMovieRating(@PathVariable("moviename") String movieName) {

		List<MovieRatingModel> ratingModels = new ArrayList<MovieRatingModel>();
		ratingModels.add(new MovieRatingModel("DDLJ", 5));
		ratingModels.add(new MovieRatingModel("KKHH", 4));
		MovieRatingModel model = ratingModels.stream().filter(rm -> rm.getMovieName().equals(movieName)).findAny().orElse(null); 
		return model; 
	}

}
