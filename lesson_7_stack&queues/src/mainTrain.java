
public class mainTrain {

	public static void main(String[] args) {
		String should_return_1 = "{[()()]}";
		String should_return_0 = "([)()]"; 
		Brackets b = new Brackets();
		int res = b.solution(should_return_1);
		System.out.println(res);
		
		int[] A = { 4,3,2,1,5 };
		int[] B = { 0,1,0,0,0 };
		
		Fish f = new Fish();
		
		int alives = f.solution(A, B);
		System.out.println(alives);
		
		
		String S1 = "(()(())())";
		String S2 = "))))(((((";
		Nesting n = new Nesting();
		int nested = n.solution(S2);
		System.out.println(nested);
	}

}
