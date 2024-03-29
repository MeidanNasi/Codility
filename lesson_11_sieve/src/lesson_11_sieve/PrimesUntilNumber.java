package lesson_11_sieve;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimesUntilNumber {
	
		public int[] primesUntilN(int N) {
			
			
			boolean[] sieve = new boolean[N+1];
			Arrays.fill(sieve, Boolean.TRUE);
			sieve[0] = false;
			sieve[1] = false;
			for(int i=2; i<(int)(Math.sqrt(N)+1); i++) {
				if(sieve[i]) {
					for(int j=i+i; j<N; j+=i) {
						sieve[j] = false;
					}
				}
			}
			ArrayList<Integer> primes = new ArrayList<Integer>();
			for(int i=0; i<sieve.length-1; i++) {
				if(sieve[i]) {
					primes.add(i);
				}
			}
			int res[] = primes.stream().mapToInt(i->i).toArray();
			return  res;
		} 
	}

