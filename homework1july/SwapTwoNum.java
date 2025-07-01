package jbk.homework1july;

public class SwapTwoNum {
	public static void main(String args[]) {
		int temp = 0;

		int arr[] = { 3, 2, 1, 6, 3, 5, 8, 9, 0, 4 };

		for (int i = 0; i < arr.length - 1; i += 2) {
			temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
