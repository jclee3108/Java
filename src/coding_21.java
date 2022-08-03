
class Solution_21 {
	public double solution(int[] arr) {
        
			double int_cnt = arr.length;
			double sum = 0;
			
			for(int i=0; i<int_cnt; i++) {
				sum = sum + arr[i];
			}
			
			
			double answer = sum/int_cnt;
			return answer;
	    }
	}



public class coding_21 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		
		
		Solution_21 sol = new Solution_21();
		System.out.println(sol.solution(arr));
		
	}
}
