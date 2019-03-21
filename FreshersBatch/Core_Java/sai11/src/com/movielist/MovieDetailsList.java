package com.movielist;

import java.util.ArrayList;
import java.util.Comparator;

import com.movie.MovieDetails;


public class MovieDetailsList implements Comparator<MovieDetails> {

	ArrayList<MovieDetails> al;
	
	public MovieDetailsList() {
		al = new ArrayList<>(); 
	}
	
	public void addMovie(MovieDetails mv) {
		al.add(mv);
	}
	public void removeMovie(MovieDetails mv) {
		al.remove(mv);
	}
	public void removeAllMovie(MovieDetails mv) {
		al.clear();
	}
	public void findMovieByMovieName(MovieDetails mv) {
		int index = al.indexOf(mv.getMovieName());
		System.out.println(al.get(index));
	}
	public void  findMovieByGenre(MovieDetails mv) {
		int index = al.indexOf(mv.getGenre());
		System.out.println(al.get(index));
	}
	public ArrayList<MovieDetails> getMovieDetails(){
		return al;
	}
	
	public void sort(String srt) {
		if(srt.contentEquals("movieName")) {}
		
	}

	@Override
	public int compare(MovieDetails o1, MovieDetails o2) {
		
		return 0;
	}
}
