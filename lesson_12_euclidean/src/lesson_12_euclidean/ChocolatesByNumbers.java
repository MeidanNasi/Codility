package lesson_12_euclidean;

public class ChocolatesByNumbers {
	int counter = 1;
	public int solution(int N, int M) {
			int left = 0;
			while( (left+M)%N !=0 ) {
				counter++;
				left = (left+M)%N;
			}
		return counter;
	}
}


//public int solution(int N, int M) {
//    return (int)(N/gcd(N,M));
//}
//
//private int gcd(int N, int M){
//    if( N%M == 0){
//        return M;
//    }
//    else{
//        return gcd(M, N%M);
//    }
//}