/* Determine Lowercase Vowels,Uppercase Vowels, Lowercase Consonants, 
   Uppercase Consonants */

public class SwitchMultipleCasesVowelsConsonant {
	public static void main(String args[]) {
		
		char ch = 'Z';
		
		switch(ch) {
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Uppercase Vowel is: "+ch);
			break;
			
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			 System.out.println("Lowercase Vowel is: "+ch);
			 break;
			 
	
		default:
			if(ch >= 'A' && ch <= 'Z'){
				System.out.println("Uppercase Consonant is: "+ch);
			}else if(ch >= 'a' && ch <= 'z') {
				System.out.println("Lowercase Consonant is: "+ch);
			}else {
				System.out.println("Invalid Input !!!");
			}
		
		}
	}

}
