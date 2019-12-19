
public class Stack {

	// stack's data members
	private int[] arr;
	private int capacity; // max size of stack
	private int top; // represents the index of the last element

	public Stack(int size) {
		arr = new int[size];
		capacity = size;
		top = -1;
	}

	public void push(int x) {
		// if stack is full..
		if (isFull()) {
			System.out.println("Stack is full...");
		} else {
			arr[++top] = x;
		}
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty...");
			return -1;
		} else
			return arr[top--];
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty...");
			return -1;
		} else
			return arr[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == capacity - 1);
	}

	public int size() {
		return top + 1;
	}
}
