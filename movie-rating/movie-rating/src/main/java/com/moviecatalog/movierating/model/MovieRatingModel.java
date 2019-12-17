package com.moviecatalog.movierating.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MovieRatingModel {
	
	@JsonProperty("MovieName")
	private String MovieName;
	
	@JsonProperty("rating")
	private int rating;

	public MovieRatingModel(String movieName, int rating) {
		super();
		MovieName = movieName;
		this.rating = rating;
	}

	public String getMovieName() {
		return MovieName;
	}

	public void setMovieName(String movieName) {
		MovieName = movieName;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
