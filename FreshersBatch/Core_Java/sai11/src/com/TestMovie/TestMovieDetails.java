package com.TestMovie;

import com.movie.MovieDetails;
import com.movielist.MovieDetailsList;

public class TestMovieDetails {
	public static void main(String[] args) {
		
		MovieDetailsList mdl = new MovieDetailsList();
		mdl.addMovie(new MovieDetails("Raja","Venkatesh","Soundarya","Romantic Drama Film"));
		mdl.addMovie(new MovieDetails("Aashiqui2","Aditya Roy Kapur","Shraddha Kapoor","Romantic Musical Drama Film "));
		mdl.addMovie(new MovieDetails("Game Of Thrones","Kit Harington","Emilia Clarke ","Adventure and Fantasy"));
	
		for(MovieDetails movie:mdl.getMovieDetails("movieName")) {
			System.out.println(movie);
		}
		System.out.println("******************************************************************************************************************************************");
	
		
	
	}
}
