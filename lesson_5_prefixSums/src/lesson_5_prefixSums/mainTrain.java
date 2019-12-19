package lesson_5_prefixSums;

public class mainTrain {

	public static void main(String[] args) {
		PassingCars p = new PassingCars();
		
		int[] arr = {0,1,0,1,1};
		
		System.out.println(p.solution(arr));
		
		GenomicRangeQuery g = new GenomicRangeQuery();
		
		String s = "CAGCCTA";
		int[] P = {2,5,0};
		int[] Q = {4,5,6};

		int[] res = g.solution(s, P, Q);
		
		for(int a : res) {
			System.out.println(a);
		}
		
		CountDiv c = new CountDiv();
		int result =c.solution(1, 10, 2);
		System.out.println(result);
	}

}