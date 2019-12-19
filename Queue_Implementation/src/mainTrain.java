
public class mainTrain {

	public static void main(String[] args) {
		Queue myQueue = new Queue(5);
		
		
		
		// { 5,6,3,9,1 }
		myQueue.enqueue(5);
		myQueue.enqueue(6);
		myQueue.enqueue(3);
		myQueue.enqueue(9);
		myQueue.enqueue(1);
		
		System.out.println(myQueue.isFull()); // true
		System.out.println(myQueue.isEmpty()); // false
	}

}
