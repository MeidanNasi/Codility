package lesson_12_euclidean;

public class mainTrain {

	public static void main(String[] args) {
		ChocolatesByNumbers c = new ChocolatesByNumbers();
		System.out.println(c.solution(10, 25));

		GCDcalculation gcd = new GCDcalculation();
		System.out.println(gcd.gcd(9, 5));

		int A[] = { 15, 10, 3 };
		int B[] = { 75, 30, 5 };
		CommonPrimeDivisors cpd = new CommonPrimeDivisors();
		int res = cpd.solution(A, B);
		System.out.println(res);

	}

}
