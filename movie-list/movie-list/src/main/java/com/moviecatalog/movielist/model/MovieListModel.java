package com.moviecatalog.movielist.model;

public class MovieListModel {

	String movieName;
	String year;
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public MovieListModel(String movieName, String year) {
		super();
		this.movieName = movieName;
		this.year = year;
	}
	
	
	
	
}
