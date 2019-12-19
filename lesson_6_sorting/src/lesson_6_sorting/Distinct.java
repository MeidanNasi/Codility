package lesson_6_sorting;

import java.util.Arrays;
import java.util.HashMap;

public class Distinct {
	public int solution(int[] A) {

		HashMap<Integer, Integer> map = new HashMap<>();
		for(int a: A) {
			map.put(a, 1);
		}
		return map.keySet().size();
	}
}

//int counter = 1;
//Arrays.sort(A);
//
//for(int i=0; i<A.length-1; i++) {
//	if(A[i] != A[i+1]) counter ++;
//}
//return counter;