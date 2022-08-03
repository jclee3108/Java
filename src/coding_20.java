
import java.util.HashSet;
import java.util.Collections;
import java.util.ArrayList;

class Solution_20 {
    public int[] solution (int[] numbers) {
        
        
        int num_lens = numbers.length;
        int index_1 = 0;
        int index_2 = 1;
        int loop = 0;
        
       HashSet<Integer> set = new HashSet<>();
        
        for(int i=0; i<num_lens; i++){
            loop = loop + i;
        }
        
        
        for(int j=0; j<loop; j++){
            set.add(numbers[index_1] + numbers[index_2]);
            
            
            
            
            if (index_2 + 1 == num_lens ){
                index_1 += 1;
                index_2 = index_1 +1;
            } else {
                index_2 += 1;
            }
            
            
            
            
        }
        int[] answer = {};
        
        ArrayList<Integer> list = new ArrayList<>(set);
        
        Collections.sort(list);

        answer = new int[list.size()];
        
        for(int ii=0; ii<list.size(); ii++) {
        	answer[ii] = list.get(ii);
        }
        

        return answer;
    }
}



public class coding_20 {
	public static void main(String[] args) {
		int[] numbers = {2,1,3,4,1};
		
		
		Solution_20 sol = new Solution_20();
		System.out.println(sol.solution(numbers));
		
	}
}
