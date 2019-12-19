package lesson_15_catepillarMethod;

import java.util.HashMap;

public class AbsDistinct {
	public int solution(int[] A) {
		
		HashMap<Integer, Boolean> map = new HashMap<>();
		
		int counter = 0;
		
		for(int a : A) {
			
			if(!map.containsKey(Math.abs(a))) {
				map.put(Math.abs(a), true);
			}
			else counter++;
		}
		
		return A.length-counter;
	}
}
