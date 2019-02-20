package com.TestMovie;

import com.movie.MovieDetails;
import com.movielist.MovieDetailsList;

public class TestMovieDetails {
	public static void main(String[] args) {
		
		MovieDetailsList mdl = new MovieDetailsList();
		/*mdl.addMovie(new MovieDetails("Raja","Venkatesh","Soundarya","Romantic Drama Film"));
		mdl.addMovie(new MovieDetails("Aashiqui2","Aditya Roy Kapur","Shraddha Kapoor","Romantic Musical Drama Film "));
		mdl.addMovie(new MovieDetails("Game Of Thrones","Kit Harington","Emilia Clarke ","Adventure and Fantasy"));
		*/
		MovieDetails MD=new MovieDetails("Raja","Venkatesh","Soundarya","Romantic Drama Film");
		MovieDetails MD1=new MovieDetails("Aashiqui2","Aditya Roy Kapur","Shraddha Kapoor","Romantic Musical Drama Film ");
		MovieDetails MD2=new MovieDetails("Game Of Thrones","Kit Harington","Emilia Clarke ","Adventure and Fantasy");
		
		System.out.println("******************************************************************************************************************************************");
		
		mdl.addMovie(MD);
		mdl.addMovie(MD1);
		mdl.addMovie(MD2);
		
		mdl.Display();
		System.out.println(mdl.removeMovie("Sye"));
		System.out.println("-----------------------------------------");
				mdl.Display();
				System.out.println("-----------------------------------------");
				System.out.println("After Sorting.");
				System.out.println("-----------------------------------------");
				for(MovieDetails dm:mdl.Sort("MovieName"))
				{
					System.out.println(dm);				
				}			
		mdl.removeAllMovie();
		mdl.Display();
		System.out.println("******************************************************************************************************************************************");
	
		
	
	}
}
