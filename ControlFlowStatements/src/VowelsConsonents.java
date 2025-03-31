/* 4.Write a program to check whether a character is a vowel or consonant. */

public class VowelsConsonents {
	public static void main(String args[]){
		
		char alphabet ='v';
		
		if (alphabet=='A'||alphabet=='a'||alphabet=='E'||alphabet=='e'||alphabet=='I'||alphabet=='i'||alphabet=='O'|| 
				alphabet=='o'||alphabet=='U'||alphabet=='u') {
			System.out.println("Alphabet is Vowel");
		}else {
			System.out.println("Alphabet is Consonent");
		}
	}

}
