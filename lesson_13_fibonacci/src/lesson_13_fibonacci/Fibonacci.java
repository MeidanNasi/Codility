package lesson_13_fibonacci;

public class Fibonacci {
	
	// dynamic programming
	public int[] calc(int n) {
		
		int[] fibonacci = new int[n + 1]; // plus one for "0"

		fibonacci[0] = 1;
		fibonacci[1] = 1;

		for (int i = 2; i <= n; i++) {
			fibonacci[i] = (fibonacci[i - 1] + fibonacci[i - 2]);
		}
		return fibonacci;
	}
}
