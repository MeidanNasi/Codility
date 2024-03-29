
public class Solution {
	public String solution(String message, int K) {
		String[] words = message.split(" ");
		StringBuilder sb = new StringBuilder();
		for (String word : words) {
			if (sb.length() + word.length() <= K) {
				sb.append(word);
				sb.append(" ");
			} else
				break;
		}

		if (sb.length() != 0) {
			if (sb.charAt(sb.length() - 1) == ' ') {
				sb.delete(sb.length() - 1, sb.length());
			}
		}
		return sb.toString();
		
		
	}
}
