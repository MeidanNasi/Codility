package lesson_5_prefixSums;

public class CountDiv {

	
	public int solution(int A, int B, int K) {
		if(A == 0 && B==0){
			return 1;
			} else if(A==0){
			return B/K+1;
			}

			return (B/K-(A-1)/K);
			}
	}

