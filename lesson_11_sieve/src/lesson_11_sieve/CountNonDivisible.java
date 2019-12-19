package lesson_11_sieve;

import java.util.Arrays;
import java.util.HashMap;

public class CountNonDivisible {
	public int[] solution(int[] A) {
		
		
		HashMap<Integer, Integer> map = new HashMap<>();
		Arrays.sort(A);
		int[] result = new int[A.length];
		// calculating count of occurrence of each element.
		for(int a: A) {
			if(map.containsKey(a)) {
				map.put(a, map.get(a)+1);
			}
			else 
				map.put(a, 1);
		}
		for(int i=A.length-1; i > 0; i--) {
			if(A[i]%A[i-1] == 0) {
				int x = A[i-1];
				int y = A[i]/A[i-1];
				int notDiv = A.length - map.get(x);
				if(map.containsKey(y)) notDiv -= map.get(y);
				result[i] = notDiv-2;
			}
		}
		return result;
	}
}