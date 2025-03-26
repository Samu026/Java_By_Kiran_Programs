/* Write a method that takes a character and prints whether it is a 
 * Vowel or Consonant. Call the method using the class name
 */

package com.method_with_return_type;

public class VowelConsonant {
	public static void main(String args[]) {
		check('s');
	}

	public static char check(char alphabet) {
		if (alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U') {
			System.out.println("Uppercase Vowel: " + alphabet);
		} else if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u') {
			System.out.println("Lowercase Vowel: " + alphabet);
		} else if (alphabet > 'A' && alphabet < 'Z') {
			System.out.println("Uppercase Consonant: " + alphabet);
		} else if (alphabet > 'a' && alphabet < 'z') {
			System.out.println("Lowercase Consonant: " + alphabet);
		} else {
			System.out.println("Invalid");
		}
		return alphabet;
	}
}
