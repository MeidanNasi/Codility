import java.util.ArrayList;


public class Brackets {
	
	public int solution(String S) {
		if (S.length() % 2 != 0) {
			return 0;
		}
		ArrayList<Character> stack = new ArrayList<>();
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == '(' || S.charAt(i) == '[' || S.charAt(i) == '{') {
				stack.add(S.charAt(i));
			} else if (stack.size() == 0) {
				return (0);
			} else if (S.charAt(i) == ')') {
				if (stack.get(stack.size() - 1) != '(') {
					return (0);
				} else {
					stack.remove(stack.size() - 1);
				}
			} else if (S.charAt(i) == ']') {
				if (stack.get(stack.size() - 1) != '[') {
					return (0);
				} else {
					stack.remove(stack.size() - 1);
				}
			} else if (S.charAt(i) == '}') {
				if (stack.get(stack.size() - 1) != '{') {
					return (0);
				} else {
					stack.remove(stack.size() - 1);
				}
			}
		}
		
		if (stack.size() != 0) {
			return (0);
		} else {
			return (1);
		}
	}
}
