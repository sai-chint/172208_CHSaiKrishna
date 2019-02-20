package com.movielist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.movie.MovieDetails;


public class MovieDetailsList {

	ArrayList<MovieDetails> al;
	
	public MovieDetailsList() {
		al = new ArrayList<>(); 
	}
	
	public void addMovie(MovieDetails mv) {
		al.add(mv);
		
	}
	public String removeMovie(String mv) {
		
		for(MovieDetails MD:al)
    	{
    		if(MD.getMovieName().equals(mv))
    		{
    			al.remove(MD);
    			System.out.println("-----------------------------------------");
    			return ("Movie Removed.\n");
    		}
    	}
    	return ("Movie not Available.");
	}
	public void Display()
    {
    	for(MovieDetails MD:al)
    		System.out.println(MD);
    }
	public void removeAllMovie() {
		al.removeAll(al);
	}
	public void findMovieByMovieName(MovieDetails mv) {
    	for(MovieDetails MD:al)
    	{
    		if(MD.getMovieName().equals(mv))
    			System.out.println("Movie Name : "+MD.getMovieName()+"Movie Actor : "+MD.getLeadActor()+"Movie Actories : "+MD.getLeadActories()+"Movie Genre : "+MD.getGenre());
    	}
    	System.out.println("Movie not Available.");
	}
	public void  findMovieByGenre(MovieDetails mv) {
		for(MovieDetails MD:al)
    	{
    		if(MD.getGenre().equals(mv))
    			System.out.println("Movie Name : "+MD.getMovieName()+"Movie Actor : "+MD.getLeadActor()+"Movie Actories : "+MD.getLeadActories()+"Movie Genre : "+MD.getGenre());
    	}
    	System.out.println("Movie not Available.");
	}
	public ArrayList<MovieDetails> Sort(String Type)
    {
    	if(Type=="MovieName")
    	{
    		Collections.sort(al,new Comparator<MovieDetails>() {
    			@Override
    			public int compare(MovieDetails o1,MovieDetails o2) {
    				return o1.getMovieName().compareTo(o2.getMovieName());
    			}
    		});
    	}
    	else if(Type=="LeadActor")
    	{
    		Collections.sort(al,new Comparator<MovieDetails>() {
    			@Override
    			public int compare(MovieDetails o1,MovieDetails o2) {
    				return o1.getLeadActor().compareTo(o2.getLeadActor());
    			}
    		});
    	}
    	else if(Type=="LeadActories")
    	{
    		Collections.sort(al,new Comparator<MovieDetails>() {
    			@Override
    			public int compare(MovieDetails o1,MovieDetails o2) {
    				return o1.getLeadActories().compareTo(o2.getLeadActories());
    			}
    		});
    	}
    	else if(Type=="Gener")
    	{
    		Collections.sort(al,new Comparator<MovieDetails>() {
    			@Override
    			public int compare(MovieDetails o1,MovieDetails o2) {
    				return o1.getGenre().compareTo(o2.getGenre());
    			}
    		});
    	}
    	return al;
    	
    }

}
