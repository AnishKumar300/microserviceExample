package com.moviecatalog.movielist.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.moviecatalog.movielist.model.MovieListModel;

@Controller
public class MovieListController {

	@GetMapping("/movies")
	public ResponseEntity<List<MovieListModel>> getMovieList(){
		
		List<MovieListModel> movieList = new  ArrayList<MovieListModel>();
		MovieListModel listModel1 = new MovieListModel("DDLJ", "1998");
		MovieListModel listModel2 = new MovieListModel("KKHH", "1998");
		movieList.add(listModel1);
		movieList.add(listModel2);
		return new ResponseEntity<List<MovieListModel>>(movieList, HttpStatus.OK);
	}
	
	
	
	
	
}
