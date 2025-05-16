/* Write a program that converts a string (e.g., "abc123") to an integer 
 * using Integer.parseInt(). Handle any exception that may occur.
 * Catch : NumberFormatException and print “Invalid number format”.
 */

import java.util.Scanner;

import javax.swing.text.NumberFormatter;
public class Demo {
    public static void main(String[] args) {
    	
        String str = "abc123";
        
        try {
        	int num = Integer.parseInt(str);
        }catch(NumberFormatter e) {
        	System.out.println("Not Convertable");
        }
        
    }
}

