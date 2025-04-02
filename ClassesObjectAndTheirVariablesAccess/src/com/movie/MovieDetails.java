/* Create a Movie Class with instance variables title, director, 
 * releaseYear, leadActor, leadActress,duration, genre and rating.
 * Create at least two objects, assign values, and display their details */

package com.movie;

public class MovieDetails {
	public static void main(String[] args) {
		Movie m = new Movie();
		Movie m1 = new Movie();
		m.title = "Jawan";
		m.director = "Atlee Kumar";
		m.releaseYear = 2023;
		m.leadActor = "Shah Rukh Khan";
		m.leadActress = "Nayanthara";
		m.duration = "169 Minutes";
		m.genre = "Action, Thriller";
		m.rating = "*****";
		m1.title = "War 2";
		m1.rating = "***";

		System.out.println("Movie Title: " + m.title);
		System.out.println("Movie Director: " + m.director);
		System.out.println("Movie Release Year: " + m.releaseYear);
		System.out.println("Lead Actor: " + m.leadActor);
		System.out.println("Lead Actress: " + m.leadActress);
		System.out.println("Duration: " + m.duration);
		System.out.println("Genre: " + m.genre);
		System.out.println("Rating: " + m.rating);

		System.out.println("-----------------------");
		System.out.println("Movie Title: " + m1.title);
		System.out.println("Rating: " + m1.rating);

	}
}
