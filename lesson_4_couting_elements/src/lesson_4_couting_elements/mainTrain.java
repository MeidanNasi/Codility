package lesson_4_couting_elements;

public class mainTrain {

	public static void main(String[] args) {

		PermCheck p = new PermCheck();
		
		int[] arr1 = { 4,1,2,3 };
		int[] arr2 = { 4,1,3 };
			
		int x = p.solution(arr1);
		int y = p.solution(arr2);
		
		System.out.println(x+","+y);
		
		
		MissingInteger m = new MissingInteger();
		
		int[] A = { 1, 3, 6, 4, 1, 2 }; 
		
		int res = m.solution(A);
		
		System.out.println(res);
	}

}
