package lesson_13_fibonacci;

public class mainTrain {

	public static void main(String[] args) {
		Ladder l = new Ladder();
		
		int[] A = { 4, 4, 5, 5, 1 };
		int[] B = { 3, 2, 4, 3, 1 };
		
		int[] res = l.solution(A, B);
		System.out.println(res);
		
		
		Fibonacci fib = new Fibonacci();
		int[] result = fib.calc(11);
		
		int[] frogArr = { 0,0,0,1,1,0,1,0,0,0,0 };
		FibFrog frog = new FibFrog();
		int ways = frog.solution(frogArr);
		System.out.println(ways);
	}

}
