/* Write a program where you initialize a String to null and try to call.
 * .lenght() on it. Handle the exception using a try-catch-finally block.
 * Excepted: Catch NullPointerException
 */

public class NullPointerExceptionHandling {
	public static void main(String[] args) {
		String s = null;
		try {
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Done.....");
		}
	}
}
