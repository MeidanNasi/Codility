package lesson_6_sorting;

public class mainTrain {

	public static void main(String[] args) {
		MaxProductOfThree m = new MaxProductOfThree();
		int[] A = { -3,1,2,-2,0,6 };
		int res = m.solution(A);
		System.out.println(res);
		
		int[] B = { 2,1,1,2,3,1 };
		Distinct d = new Distinct();
		int res2= d.solution(B);
		
		System.out.println(res2);
	}

}
