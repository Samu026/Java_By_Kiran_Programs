/* 2.Write a program to check whether a person is eligible to vote (age >= 18).*/

public class VotingEligibility {
	public static void main(String args[]){
		int age= 21;
		if(age>=18 && age<=100) {
			System.out.println("You are Eligible!!");
		}
		else {
			System.out.println("You are not Eigible!!");
		}
	}

}
