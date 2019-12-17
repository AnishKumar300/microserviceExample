package com.moviecatalog.moviecatalogs.model;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"movieName",
"year"
})
public class Movie {

@JsonProperty("movieName")
private String movieName;
@JsonProperty("year")
private String year;

@JsonProperty("movieName")
public String getMovieName() {
return movieName;
}

@JsonProperty("movieName")
public void setMovieName(String movieName) {
this.movieName = movieName;
}

@JsonProperty("year")
public String getYear() {
return year;
}

@JsonProperty("year")
public void setYear(String year) {
this.year = year;
}

}