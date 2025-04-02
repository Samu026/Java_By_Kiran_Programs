/* Create a IVShow class with instance variables showName, genre, 
director, seasons, IMDBRating, and releaseYear. 
Create at least two objects, assign values, and print their details.*/

package com.tvshow;

public class DisplayTvshow {
	public static void main(String[] args) {
		Tvshow t=new Tvshow();
		t.showName="abc";
		t.genre="3";
		t.director="xyz";
		t.seasons="pqr";
		t.IMDBRating=3;
		t.releaseYear=2024;
		System.out.println("-------First Show Details-------");
		System.out.println("Name: "+t.showName);
		System.out.println("Genre: "+t.genre);
		System.out.println("Director: "+t.director);
		System.out.println("Seasons: "+t.seasons);
		System.out.println("IMDB Rating: "+t.IMDBRating);
		System.out.println("Release Year: "+t.releaseYear);
		System.out.println();
		
		Tvshow t1=new Tvshow();
		t1.showName="efg";
		t1.genre="2";
		t1.director="opq";
		t1.seasons="gfh";
		t1.IMDBRating=4;
		t1.releaseYear=2020;
		System.out.println("-------Second Show Details-------");
		System.out.println("Name: "+t1.showName);
		System.out.println("Genre: "+t1.genre);
		System.out.println("Director: "+t1.director);
		System.out.println("Seasons: "+t1.seasons);
		System.out.println("IMDB Rating: "+t1.IMDBRating);
		System.out.println("Release Year: "+t1.releaseYear);
	
	
	}
}
