
public class Factors {
	public int solution(int N) {

		int counter = 0;
		int i = 1;
		while (i * i <= N) {
			if (N % i == 0) {
				if (i * i == N)
					counter++;
				else
					counter += 2;
			}
			i++;
		}
		return counter;
	}
}
