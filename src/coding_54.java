
import java.util.PriorityQueue;



class Solution_54 {
	public int solution(int[] scoville, int K) {
        int answer = 0;
        
        

        PriorityQueue<Integer> pers = new PriorityQueue<>();
//        PriorityQueue<Integer> priorityQueue2 = new PriorityQueue<>(Collections.reverseOrder());
        
        
        for(int i : scoville) {
        	pers.offer(i);
        }
        
        while(pers.peek() < K) {
        	
        	if(pers.size() < 2) {
        		return -1;
        	}
        	int f1 = pers.poll();
        	int f2 = pers.poll();
        	
        	int newFood = f1 + ( f2 * 2 );
        	
        	pers.offer(newFood);
        	answer++;
        }
        
        return answer;
    }
    	
}



public class coding_54 {
	public static void main(String[] args) {
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int K = 7;
		Solution_54 sol = new Solution_54();
		System.out.println(sol.solution(scoville,K));
	}
}
