package com.movie;

public class MovieDetails {
	public String movieName;
	String leadActor;
	String leadActories;
	public String genre;

	public MovieDetails(String movieName, String leadActor, String leadActories, String genre) {
		super();
		this.movieName = movieName;
		this.leadActor = leadActor;
		this.leadActories = leadActories;
		this.genre = genre;
	}	

	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getLeadActor() {
		return leadActor;
	}
	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}
	public String getLeadActories() {
		return leadActories;
	}
	public void setLeadActories(String leadActories) {
		this.leadActories = leadActories;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "MovieDetails [movieName = " + movieName + ", leadActor = " + leadActor + ", leadActories = " + leadActories
				+ ", genre = " + genre + "]";
	}


}
