/* 12.Write a program to determine if a character is an 
uppercase vowel, lowercase vowel, 
uppercase consonant, or lowercase consonant.*/ 

public class VowelsConsonantsUpperLower {
	public static void main(String args[])
	{
		char ch='O';
		
		if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
		{
			System.out.println(ch+" is Uppercase Vowels");
		}
		else if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println(ch+" is Lowercase Vowels");
		}
		else if(ch>='A' && ch<='Z')
		{
			System.out.println(ch+" is Uppercase Consonant");
		}
		else if(ch>='a' && ch<='z')
		{
			System.out.println(ch+" is Lowercase Consonant");
		}
		else
		{
			System.out.println(ch+" is Invalid !!");
		}
	}
}
