

class Solution_111 {
	public int solution(int[] a, int[] b) {
        
		
		int sum = 0 ;
		
		for (int i = 0; i < a.length; i++) {
			sum = sum + ( a[i] * b[i] );
		}
		
		
		
        int answer = sum;
        return answer;
	}
}

public class coding_111 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int[] b = {-3,-1,0,2};
		
//		int[] a = {-1,0,1};
//		int[] b = {1,0,-1};
		
		Solution_111 sol = new Solution_111();
		System.out.println(sol.solution(a,b));
		
	}
}