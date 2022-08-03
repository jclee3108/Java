

class Solution_18 {

    public int[][] solution(int[][] arr1, int[][] arr2) {
        
        
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        for(int i=0; i<arr1[0].length; i++){
            for(int j=0; j<arr1.length; j++){
                answer[j][i] = arr1[j][i] + arr2[j][i] ;     
            }
            
        } 
        
        return answer;
    }

}



public class coding_18 {
	public static void main(String[] args) {
		int[][] arr1 = {{1,2},{2,3}} ;
		int[][] arr2 = {{3,4},{5,6}} ;
		
		
		Solution_18 sol = new Solution_18();
		System.out.println(sol.solution(arr1, arr2));
		
	}
}
