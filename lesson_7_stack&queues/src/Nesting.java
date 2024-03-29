import java.util.Stack;

public class Nesting {

	public int solution(String S) {

		Stack<Character> stack = new Stack<>();
		if(S.length() == 0) return 1; 
		
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == '(')
				stack.add('(');
			else if (stack.isEmpty())
				return 0;
			else {
				if (stack.isEmpty())
					return 0;
				else
					stack.pop();
			}
		}
		if(!stack.isEmpty()) return 0;
		return 1;

	}
}
