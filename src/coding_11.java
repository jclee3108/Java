

class Solution_11 {
	public int solution(int[] a, int[] b) {
        
		
		int max_length = 0;
		
		if (a.length > b.length) {
			max_length = a.length;
		}else {
			max_length = b.length;
		}
		
		int sum = 0 ;
		
		for (int i = 0; i < a.length; i++) {
			sum = sum + ( a[i] * b[i] );
		}
		
		
		
        int answer = sum;
        return answer;
	}
}

public class coding_11 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int[] b = {-3,-1,0,2};
		
//		int[] a = {-1,0,1};
//		int[] b = {1,0,-1};
		
		Solution_11 sol = new Solution_11();
		System.out.println(sol.solution(a,b));
		
	}
}