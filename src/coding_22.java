
import java.util.ArrayList;
import java.util.Collections;

class Solution_22 {
    public int[] solution(int[] arr) {
        
    	
    	ArrayList<Integer> IntArrayList = new ArrayList<>();

    	for(int i=0; i<arr.length; i++) {
    		IntArrayList.add(arr[i]);
    	}
    	
    	int int_min = Collections.min(IntArrayList);
    
    	IntArrayList.remove(Integer.valueOf(int_min));
    	
    	
    	int[] value = new int[arr.length-1];
    	
    	
    	for(int i=0; i<IntArrayList.size(); i++){
    		value[i] = IntArrayList.get(i);
    	}
    	
    	
    	if(IntArrayList.size() == 0) {
    		value = new int[1];
    		value[0] = -1;
    	}
    	
    	return value; 
    }
}



public class coding_22 {
	public static void main(String[] args) {
		int[] arr = {10};
		
		
		Solution_22 sol = new Solution_22();
		System.out.println(sol.solution(arr));
		
	}
}