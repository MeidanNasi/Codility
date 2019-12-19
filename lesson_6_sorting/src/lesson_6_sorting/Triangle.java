package lesson_6_sorting;

import java.util.Arrays;

public class Triangle {
	public int solution(int[] A) {
		
		Arrays.sort(A);
		for(int i=0; i<A.length;i++) {
			if(A[i]+A[i+1]> A[i+2]) return 1;
		}	
		return 0;
	}
}
