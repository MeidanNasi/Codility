
public class mainTrain {

	public static void main(String[] args) {
		Stack myStack = new Stack(3);
		
		myStack.push(5); // 5 at the bottom
		myStack.push(10);
		myStack.push(3); // 3 on top

		System.out.println(myStack.peek()); // 3
		
		int elementOnTop = myStack.pop();
		System.out.println(elementOnTop); // 3
		elementOnTop = myStack.pop();
		System.out.println(elementOnTop); // 10
		elementOnTop = myStack.pop();
		System.out.println(elementOnTop); // 5
		elementOnTop = myStack.pop();
		System.out.println(elementOnTop); // -1
		
		System.out.println(myStack.isEmpty()); // true
		
		myStack.push(5); // 5 at the bottom
		myStack.push(10);
		myStack.push(3); // 3 on top
		
		System.out.println(myStack.isFull()); // true
		System.out.println(myStack.isEmpty()); // false
		
		int size = myStack.size();
		System.out.println(size); // 3
		
	}

}
