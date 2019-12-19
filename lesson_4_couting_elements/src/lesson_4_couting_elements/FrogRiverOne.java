package lesson_4_couting_elements;

import java.util.HashMap;

public class FrogRiverOne {
    public int solution(int X, int[] A) {
    	
    	HashMap<Integer, Boolean> m = new HashMap<>();
    	int count = 0;

    	for (int i = 0; i < A.length; i++) {
    	if (m.get(A[i]) == null) {
    	m.put(A[i], true);
    	count++;
    	}

    	if (count == X) return i;
    	}

    	return -1;
    }
}
