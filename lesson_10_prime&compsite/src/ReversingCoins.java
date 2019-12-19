import java.util.Arrays;

public class ReversingCoins {

	public int solution(int n) {

		int result = 0;
		int[] coins = new int[n + 1];
		Arrays.fill(coins, 0);
		for (int i = 1; i < n + 1; i++) {
			int k = i;
			while (k <= n) {
				coins[k] = (coins[k] + 1) % 2;
				k += i;
			}
			result += coins[i];
		}

		return result;
	}
}
