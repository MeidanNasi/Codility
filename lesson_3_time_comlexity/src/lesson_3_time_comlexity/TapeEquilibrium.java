package lesson_3_time_comlexity;

public class TapeEquilibrium {
	public int solution(int[] A) {
		
		int min = Integer.MAX_VALUE;
		int leftSum = 0;
		int rightSum = 0;

		for (int a : A) rightSum += a;

		for (int i = 0; i < A.length - 1; i++) {
		leftSum += A[i];
		rightSum -= A[i];

		int sub = Math.abs(leftSum - rightSum);
		if (sub < min) {
		min = sub;
		}
		}

		return min;
	}
}
