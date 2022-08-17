

class Solution_201 {

    public int solution(int[][] sizes) {
        
    	int answer = 0;
    	
    	int[][] sizes_replace = new int[sizes.length][sizes[0].length];
        
        for (int i = 0; i<sizes.length; i++)
        {
            if (sizes[i][1] > sizes[i][0]){
                sizes_replace[i][0] = sizes[i][1];
                sizes_replace[i][1] = sizes[i][0];
            }else{
                sizes_replace[i][0] = sizes[i][0];
                sizes_replace[i][1] = sizes[i][1];
            }
        }
        
        int maxsizes0 = 0;
        int maxsizes1 = 0;
        for (int i=0; i<sizes_replace.length; i++) {
        	
        	if (maxsizes0 < sizes_replace[i][0]) {
        		maxsizes0 = sizes_replace[i][0];
        	}
        	
        	if (maxsizes1 < sizes_replace[i][1]) {
        		maxsizes1 = sizes_replace[i][1];
        	}
        	
        }
        
        answer = maxsizes0 * maxsizes1;
        
        return answer;
    }

}



public class coding_201 {
	public static void main(String[] args) {
		int[][] sizes ={{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
		
		
		Solution_201 sol = new Solution_201();
		System.out.println(sol.solution(sizes));
		
	}
}
