package lesson_9_maxSliceProblem;

public class maxSliceExample {
	public int solution(int[] A) {

		
		
		// int[] A = { 5, -7, 3, 5, -2, 4, -1 };
		int max_ending = -1000000;
		int max_slice = -1000000;
		for (int a : A) {
			max_ending = Math.max(a, max_ending + a);
			max_slice = Math.max(max_slice, max_ending);
		}
		return max_slice;
	}
}
