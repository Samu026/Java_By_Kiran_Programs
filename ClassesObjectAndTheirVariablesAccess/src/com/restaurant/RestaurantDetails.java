/* Create a restaurant class with instance variables restaurantName, location, 
 * cuisineType, rating, numTables, ownerName, and onlineRating, create at least 
 * two objects, assign values and display */

package com.restaurant;

public class RestaurantDetails {
	public static void main(String[] args) {
		Restaurant r=new Restaurant();
		System.out.println("------- First restaurant details -------");
		System.out.println("Restaurant Name: "+r.restaurantName );
		System.out.println("Location: "+r.location );
		System.out.println("Cuisine Type: "+r.cuisineType);
		System.out.println("Rating: "+r.rating);
		System.out.println("tables Number: "+r.numTables);
		System.out.println("Owner Name: "+r.ownerName);
		System.out.println("Online rating: "+r.onlineRating);
		
		Restaurant r1=new Restaurant();
		r1.restaurantName="abc";
		r1.location="Mumbai";
		r1.cuisineType="Sweets";
		r1.rating="*****";
		r1.numTables=20;
		r1.ownerName="pqr";
		r1.onlineRating="****";
		System.out.println();
		System.out.println("------- First restaurant details -------");
		System.out.println("Restaurant Name: "+r1.restaurantName );
		System.out.println("Location: "+r1.location );
		System.out.println("Cuisine Type: "+r1.cuisineType);
		System.out.println("Rating: "+r.rating);
		System.out.println("tables Number: "+r.numTables);
		System.out.println("Owner Name: "+r.ownerName);
		System.out.println("Online rating: "+r.onlineRating);
	}
}
