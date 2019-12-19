package lesson_5_prefixSums;

import java.util.ArrayList;

public class PassingCars {
    public int solution(int[] A) {
    	int count = 0;
    	int pairs = 0;
    	
    	for(int i=0; i<A.length; i++) {
    		if(A[i] == 0) {
    			count++;
    		}
    		else pairs +=count;
    	}
    	
    	if (pairs > Math.pow(10, 9)) return - 1;
    	return pairs;
    }
}
