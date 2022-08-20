// you can also use imports, for example:

class Solution_1002 {
	public int[] solution(int[] A, int K) {
        
		int len = A.length - K;
		
        int[] arr1 = new int[len];
        int[] arr2 = new int[A.length - len];
        
        
        for(int i=0; i<A.length; i++){
            if(i<len){
                arr1[i] = A[i];
            }else {
                arr2[i-len] = A[i];
            }
            
        }
        int[] answer = new int[A.length];
        
        
        System.arraycopy(arr2, 0, answer, 0, arr2.length);
        System.arraycopy(arr1, 0, answer, arr2.length, arr1.length);
        
        
        
        return answer;
        

        
    }
}



public class coding_1002 {
	public static void main(String[] args) {
		int[] A = {3,8,9,7,6};
		int K = 3;
		
		
		Solution_1002 sol = new Solution_1002();
		System.out.println(sol.solution(A,K));
		
	}
}
