public class SumDigits {
	public static void main(String args[]) {
		int num=1234;
		int sum=0;
		while(num!=0) {
			int rem=num%10;
			num=num/10;
			sum=sum+rem;
		}
		System.out.println(sum);
	}
}
