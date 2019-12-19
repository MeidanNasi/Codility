package lesson_11_sieve;

public class mainTrain {

	public static void main(String[] args) {

		PrimesUntilNumber f = new PrimesUntilNumber();

		int[] primesUntilN = f.primesUntilN(26);

		for (int i = 0; i < primesUntilN.length; i++)
			System.out.println(primesUntilN[i]);

		int[] P = { 1, 4, 16 };
		int[] Q = { 26, 10, 20 };
		int N = 26;

		CountSemiprimes c = new CountSemiprimes();
		int[] res = c.solution(N, P, Q);

		for (int i = 0; i < res.length; i++)
			System.out.println(i + " : " + res[i]);
		
		int[] A = {3,1,2,3,6};
		CountNonDivisible cnd = new CountNonDivisible();
		int notDivs[] = cnd.solution(A);
		
		for (int i = 0; i < notDivs.length; i++)
			System.out.println("->" + notDivs[i]);

	}

}
