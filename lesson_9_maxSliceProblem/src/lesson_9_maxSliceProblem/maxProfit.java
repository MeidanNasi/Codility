package lesson_9_maxSliceProblem;

public class maxProfit {
	public int solution(int[] A) {

        int min = Integer.MAX_VALUE;
        int max = 0;
        
        for(int a : A) {
        	min = Math.min(min, a);
        	max = Math.max(max, a-min);
        }
        return max;
	}
}

//            min = A[i] < min ? A[i]:min;
//            max = A[i] - min > max ? A[i] - min : max;