

class Solution_14 {
    public int solution(int n) {
    	
    	int sum = 0;
    	for(int i=1; i<=n; i++) {
    		
    		if(n%i == 0) {
    			sum = sum + i;
    		}
    	}
    	
    	
    	
        int answer = sum;
        return answer;
    }
}


public class coding_14 {
	public static void main(String[] args) {
		int n = 5;
//		int budget = 9;
		
		
		Solution_14 sol = new Solution_14();
		System.out.println(sol.solution(n));
		
	}
}