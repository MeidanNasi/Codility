package lesson_3;

public class Solution {
	
	public int[] solution(int[] A, int K) {
		
		if(A.length == 0) return A;
		int tmp;
		
		
		for(int i=0; i<K; i++) {
			tmp = A[A.length-1];
			for(int j=A.length-1; j>0; j--) {
				A[j] = A[j-1];
			}
			A[0] = tmp;
		}
		return A;	
	}
}