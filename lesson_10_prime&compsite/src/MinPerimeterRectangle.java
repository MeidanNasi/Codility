
public class MinPerimeterRectangle {
	public int solution(int N) {

		int min = Integer.MAX_VALUE;
		int i = 1;
		while (i * i <= N) {
			if (N % i == 0) {
				if (min > (2 * (i + N / i)))
					min = 2 * (i + N / i);
			}
			i++;
		}
		return min;
	}

}
