
public class inserting {

	int solution(int N) {

		Integer num = N;
		String s = num.toString();
		StringBuilder sb = new StringBuilder();
		if(N > 0) {
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) < '5') {
				sb.append('5');
				sb.append(s.substring(i, s.length()));
				
			}
			else sb.append(s.charAt(i));
		}
		}
		if (N < 0) {
			
			for(int i=0; i<s.length(); i++) {
				if(s.charAt(i) > '5') {
					sb.append('5');
					sb.append(s.substring(i, s.length()));
					
				}
				else sb.append(s.charAt(i));
			}
		}
		return Integer.parseInt(sb.toString());
	}
}
