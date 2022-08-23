
//import java.util.HashSet;
class Solution_123 {
    public int solution(int[] nums) {
        
        
        int sum = 0;
        int answer = 0;
        
        for(int i=0; i < nums.length-2; i++){
        	for(int j=i+1; j < nums.length-1; j++){
        		for(int k=j+1; k < nums.length; k++){
        			sum = nums[i] + nums[j] + nums[k]; 
        			
        			if(isPrime(sum)) {
        				answer += 1;
        			}
        		}
        	}
        }
        
        return answer;
    
    }
    
    public boolean isPrime(int num) {
		
    	for(int i=2; i*i<=num; i++) {
    		if(num%i ==0) {
    			return false;
    		}
    	}
    	return true;
		
	}
}



public class coding_123 {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
//		int[] nums = {1,2,7,6,4};
//		int[] nums = {1,2,7,6,4,10,12,41}; 
		
		Solution_123 sol = new Solution_123();
		System.out.println(sol.solution(nums));
	}
}