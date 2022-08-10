
class Solution_121 {
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



public class coding_121 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		
		
		Solution_121 sol = new Solution_121();
		System.out.println(sol.solution(arr));
		
	}
}
