package lesson_3;

public class mainTrain {
	public static void main(String[] args) {
	 int[] A = {3, 8, 9, 7, 6};
	 int K = 3;
	 
	 Solution s = new Solution();
	 int[] res = s.solution(A, K);
	 for(int i=0; i< res.length; i++) {
		 System.out.println(res[i]);
	 }
 }
}
