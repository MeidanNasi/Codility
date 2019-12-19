package lesson_11_sieve;

import java.util.ArrayList;
import java.util.Arrays;

public class CountSemiprimes {
	public int[] solution(int N, int[] P, int[] Q) {

		// first, we check all the primes until N , primes contains all primes until N
		boolean[] sieve = new boolean[N + 1];
		Arrays.fill(sieve, Boolean.TRUE);
		sieve[0] = false;
		sieve[1] = false;
		for (int i = 2; i < (int) (Math.sqrt(N) + 1); i++) {
			if (sieve[i]) {
				for (int j = i + i; j < N; j += i) {
					sieve[j] = false;
				}
			}
		}
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for (int i = 0; i < sieve.length; i++) {
			if (sieve[i]) {
				primes.add(i);
			}
		}

		// next we build an array that will hold all possible multiples between all the prime numbers (until N!)
		int[] semiprimes = new int[N + 1];
		int[] sp = new int[N + 1];
		long semiprime = 0;
		for (int i = 0; i < primes.size(); i++) {
			for (int j = i; j < primes.size(); j++) {
				semiprime = (long) primes.get(i) * (long) primes.get(j);
				if (semiprime > N) {
					break;
				}
				semiprimes[(int) semiprime] = 1;
				sp[(int) semiprime] = 1;
			}
		}
		
		// this loop will indicate how many prime i had till a specific index.
		for (int i = 1; i < semiprimes.length; i++) {
			semiprimes[i] += semiprimes[i - 1];
		}
		int[] count = new int[Q.length];
		for (int i = 0; i < Q.length; i++) {
			count[i] = semiprimes[Q[i]] - semiprimes[P[i]] + sp[P[i]];
		}
		return count;
	}
}
