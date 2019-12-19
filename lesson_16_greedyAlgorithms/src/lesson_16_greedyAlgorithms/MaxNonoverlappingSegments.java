package lesson_16_greedyAlgorithms;

public class MaxNonoverlappingSegments {
	public int solution(int A[], int B[]) {
		
        if (A.length <= 1) {
            return A.length;
        }
        int result = 1;
        int prevEnd = B[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] > B[i-1] || A[i] > prevEnd) {
                result++;
                prevEnd = B[i];
            }
        }
        return result;
	}
}
