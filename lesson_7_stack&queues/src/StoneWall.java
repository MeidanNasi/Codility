import java.util.Stack;

public class StoneWall {
	public int solution(int[] H) {
		
		int counter = 0;
		Stack<Integer> stack = new Stack<>();
		
		if(H.length == 1) return 1;
		if(H.length == 0) return 0;
		
		for(int i=0; i<H.length; i++) {
			while( !stack.isEmpty() && stack.peek() > H[i]) {
				stack.pop();
			}
			if(stack.isEmpty()) {
				stack.push(H[i]);
				counter++;
			}
			else if( !stack.isEmpty() && stack.peek() != H[i]) {
				stack.push(H[i]);
				counter++;
			}
		}
		
		
		return counter;
	}
}
