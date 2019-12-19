package lesson_2;

import java.util.ArrayList;
class Solution {
	
	
    public int solution(int[] A) {
    	
    	int res = 0;
    	ArrayList<Integer> arr = new ArrayList<>();
    	
    	
    	for(int i=0; i<A.length; i++) {
    		int flag = 0;
    		if(!arr.contains(A[i])) {
    			for(int j=i+1; j<A.length; j++) {
    				if(A[i] == A[j]) {
    					arr.add(A[i]);
    					flag = 1;
    					break;
    				}
    			}
    			if(flag != 1) { res = A[i]; }
    		}
    	}
    	return res;
    }  
}