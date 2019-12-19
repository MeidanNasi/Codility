package strings;

public class Solution {
	public String solution(String s, int K) {
		
		String[] words = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for(String word : words) {
			if( sb.length() + word.length() <= K) {
				sb.append(word);
				sb.append(" ");
			}
			else break;
		}
		
		if(sb.charAt(sb.length()-1) == ' ') {
			sb.delete(sb.length()-1,sb.length());
		}
		
		return sb.toString();
	}
}
