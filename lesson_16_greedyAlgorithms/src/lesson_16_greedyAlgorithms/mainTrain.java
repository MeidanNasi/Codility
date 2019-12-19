package lesson_16_greedyAlgorithms;

public class mainTrain {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 1, 1, 3 };
		Ropes r = new Ropes();
		int res = r.solution(4, a);
		System.out.println(res);

		int A[] = { 1, 3, 7, 9, 9 };
		int B[] = { 5, 6, 8, 9, 10 };
		MaxNonoverlappingSegments m = new MaxNonoverlappingSegments();
		int result = m.solution(A, B);
		System.out.println(result);
	}

}
