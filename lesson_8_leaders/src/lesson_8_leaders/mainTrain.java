package lesson_8_leaders;

public class mainTrain {

	public static void main(String[] args) {
		Dominator d = new Dominator();
		int[] A = { 3, 4, 3, 2, 3, -1, 3, 3 };
		int res = d.solution(A);
		System.out.println(res);
	}

}
