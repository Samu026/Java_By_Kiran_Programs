/* Create a Flight Class with instance variables flightNumbers, airLine, 
 * departureCity, destinationCity, departureTime, and ticketPrice.Create at least
 * two objects, assign values, and display their details */

package com.flight;

public class FlightDetails {
	public static void main(String[] args) {
		Flight f = new Flight();
		Flight f1 = new Flight();

		f.flightNumber = 6;
		f.airLine = "Pune";
		f.departureCity = "Mumbai";
		f.destinationCity = "Pune";
		f.departureTime = "5 PM";
		f.ticketPrice = 1000;

		f1.departureCity = "USA";

		System.out.println("Flight number: " + f.flightNumber);
		System.out.println("Air-Line Name: " + f.airLine);
		System.out.println("Departure City: " + f.departureCity);
		System.out.println("Destination City: " + f.destinationCity);
		System.out.println("Departure Time: " + f.departureTime);
		System.out.println("Ticket Price: " + f.ticketPrice);
		System.out.println("Other Flight Departure City: " + f1.departureCity);

	}
}
