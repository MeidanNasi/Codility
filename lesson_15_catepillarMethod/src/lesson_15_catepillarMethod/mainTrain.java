package lesson_15_catepillarMethod;

public class mainTrain {

	public static void main(String[] args) {

		int[] A = { 3, 4, 5, 5, 2 };
		int M = 6;
		CountDistinctSlices c = new CountDistinctSlices();
		int res = c.solution(M, A);
		System.out.println(res);

		CountTriangles c2 = new CountTriangles();
		int[] arr = { 10, 2, 5, 1, 8, 12 };
		int num = c2.solution(arr);
		System.out.println(num);

		AbsDistinct a = new AbsDistinct();
		int[] array = { -5, -3, -1, 0, 6 };
		int r = a.solution(array);
		System.out.println(r);

	}
}
