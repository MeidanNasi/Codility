	
import java.util.Stack;

public class Fish {

	public int solution(int[] A, int[] B) {

        Stack<Integer> fishSizes = new Stack<>();
        int eatenNumber = 0;
        for(int i = 0; i < A.length ; i++){
            if(!fishSizes.isEmpty() && B[i] == 0){
                if (fishSizes.peek() > A[i]) {
                        eatenNumber++;
                } else {
                    while(!fishSizes.isEmpty() && fishSizes.peek() < A[i]){
                        fishSizes.pop();
                        eatenNumber++;
                    }
                    if(!fishSizes.isEmpty()){
                        eatenNumber ++;
                    }
                }
            } else if(B[i] == 1){
                fishSizes.push(A[i]);

            }
        }
        return(A.length - eatenNumber);
	}
}
