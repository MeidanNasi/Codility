import java.util.Stack;

public class decorating {
	public int solution(int[] A) {

		int counter = 0;
		Stack<Integer> stack = new Stack<>();

		if (A.length == 1)
			return 1;
		if (A.length == 0)
			return 0;

		for (int i = 0; i < A.length; i++) {
			while (!stack.isEmpty() && stack.peek() > A[i]) {
				stack.pop();
			}
			if (stack.isEmpty()) {
				stack.push(A[i]);
				counter++;
			} else if (!stack.isEmpty() && stack.peek() != A[i]) {
				stack.push(A[i]);
				counter++;
			}
		}

		return counter;
	}
}
