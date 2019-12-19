package lesson_6_sorting;

import java.util.Arrays;

public class MaxProductOfThree {
	public int solution(int[] A) {
		
		int max =0;
		Arrays.sort(A);
		
		max = A[A.length-1]*A[A.length-2]*A[A.length-3];
		if(A[0]<0 && A[1]<0) {
			max = A[A.length-1]*A[0]*A[1] > max ? A[A.length-1]*A[0]*A[1] : max;
		}
		return max;
	}
}
