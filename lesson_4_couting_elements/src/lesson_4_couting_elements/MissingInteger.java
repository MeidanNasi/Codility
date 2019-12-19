package lesson_4_couting_elements;

import java.util.ArrayList;
import java.util.Collections;

public class MissingInteger {

	public int solution(int[] A) {
		
		ArrayList<Integer> list = new ArrayList<>();
		int smallest = 1;
		for(int a : A) {
			if(a > 0) {
				list.add(a);
			}
		}
		if(list.isEmpty()) return smallest;
		
		Collections.sort(list);
		
		if (list.get(0) > smallest) return smallest;
		
		
		for(int i=0; i<list.size()-1; i++) {
			if(Math.abs(list.get(i)- list.get(i+1)) >=2 ) {
				smallest = list.get(i) +1;
				break;
			}
		}
		if(smallest == 1) {
			smallest = list.get(list.size() -1) +1;
		}
		return smallest;
	}
}