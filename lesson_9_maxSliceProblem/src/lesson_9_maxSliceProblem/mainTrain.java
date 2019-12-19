package lesson_9_maxSliceProblem;

public class mainTrain {

	public static void main(String[] args) {
		int[] A = { 5, 7, 3, 5, 2, 4, 1 };
		maxSliceExample m = new maxSliceExample();
		int res = m.solution(A);
		System.out.println(res);

		A[0] = 23171;
		A[1] = 21011;
		A[2] = 21123;
		A[3] = 21366;
		A[4] = 21013;
		A[5] = 21367;

		maxProfit p = new maxProfit();
		System.out.println(p.solution(A));
		
		
		maxDoubleSlice mds = new maxDoubleSlice();
		int[] arr = { 3,2,6,-1,4,5,-1,2 };
		System.out.println(mds.solution(arr));

	}
}
