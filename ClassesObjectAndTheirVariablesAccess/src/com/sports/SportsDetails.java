/* Create a Sports class with instance variables sportName, teamName, 
 * sportType, coachName, numPlayers, homeCity and championshipsWon. 
 * create at least two objects, assign values, and display their details. */

package com.sports;

public class SportsDetails {
	public static void main(String[] args) {
		Sports s = new Sports();
		s.sportName = "Cricket";
		s.teamName = "India";
		s.sportType = "Type1";
		s.coachName = "abc";
		s.numPlayers = 12;
		s.homeCity = "Pune";
		s.championshipWon = "ICC Champions";
		System.out.println("Sport Name: " + s.sportName);
		System.out.println("Team Name: " + s.teamName);
		System.out.println("Sport Type: " + s.sportType);
		System.out.println("Coach Name: " + s.coachName);
		System.out.println("Number of players: " + s.numPlayers);
		System.out.println("Home City: " + s.homeCity);
		System.out.println("Championship Winner: " + s.championshipWon);

		System.out.println("-----------------------------------");

		Sports s1 = new Sports();
		s1.sportName = "Hockey";
		s1.teamName = "Mumbai";
		s1.sportType = "Type2";
		s1.coachName = "xyz";
		s1.numPlayers = 10;
		s1.homeCity = "Mumbai";
		s1.championshipWon = "Olympic Champions";
		System.out.println("Sport Name: " + s1.sportName);
		System.out.println("Team Name: " + s1.teamName);
		System.out.println("Sport Type: " + s1.sportType);
		System.out.println("Coach Name: " + s1.coachName);
		System.out.println("Number of players: " + s1.numPlayers);
		System.out.println("Home City: " + s1.homeCity);
		System.out.println("Championship Winner: " + s1.championshipWon);

	}
}
