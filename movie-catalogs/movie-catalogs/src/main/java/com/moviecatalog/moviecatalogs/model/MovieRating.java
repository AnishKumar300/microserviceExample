package com.moviecatalog.moviecatalogs.model;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"rating",
"movieName"
})
public class MovieRating {

@JsonProperty("rating")
private Integer rating;
@JsonProperty("movieName")
private String movieName;

@JsonProperty("rating")
public Integer getRating() {
return rating;
}

@JsonProperty("rating")
public void setRating(Integer rating) {
this.rating = rating;
}

@JsonProperty("movieName")
public String getMovieName() {
return movieName;
}

@JsonProperty("movieName")
public void setMovieName(String movieName) {
this.movieName = movieName;
}

}