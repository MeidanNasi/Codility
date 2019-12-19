package lesson_4_couting_elements;

import java.util.ArrayList;
import java.util.HashMap;


public class PermCheck {
	public int solution(int[] A) {
		
		int n = A.length;
		
		HashMap<Integer, Integer> m = new HashMap<>();

		for (int a: A) {
		if (a > n) return 0;

		if (m.get(a) == null) {
		m.put(a, a);
		} else {
		return 0;
		}
		}

		return 1;
		}
}
