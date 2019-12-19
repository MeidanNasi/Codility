
public class mainTrain {

	public static void main(String[] args) {

		Factors f = new Factors();
		System.out.println(f.solution(7));
		
		MinPerimeterRectangle m = new MinPerimeterRectangle();
		int res = m.solution(30);
		System.out.println(res);
		
		
		int[] arr = {1,5,3,4,3,4,1,2,3,4,6,2};
		FlagPeaks peaks = new FlagPeaks();
		int result = peaks.solution(arr);
		System.out.println(result);
	}

}
