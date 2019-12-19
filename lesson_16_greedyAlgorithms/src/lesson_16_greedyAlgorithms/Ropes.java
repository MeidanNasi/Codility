package lesson_16_greedyAlgorithms;

public class Ropes {
	public int solution(int K, int[] A) {
		
		if( A.length == 1 && A[0] < K) {
			return 0;
		}

		int counter = 0 ;
		int sum = 0;
		
		for(int a : A) {
			sum += a;
			if(sum >= K) {
				counter++;
				sum = 0;
			}
		}

		return counter;
	}
}
