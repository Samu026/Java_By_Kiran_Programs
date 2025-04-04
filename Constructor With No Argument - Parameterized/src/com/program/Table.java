/*Print Table (Constructor with no Argument /Parameter) */

package com.program;

public class Table {
	int n = 12;

	public Table() {
		for (int i = 1; i <= 10; i++) {
			int result = n * i;
			System.out.println(n + " * " + i + " = " + result);
		}
	}

	public static void main(String[] args) {
		Table t = new Table();
	}
}
