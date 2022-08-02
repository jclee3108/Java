import java.util.Arrays;

class Solution_13 {
	public int solution(int[] d, int budget) {
        
		
		Arrays.sort(d);
		
		
		int sum = 0;
		int dept_cnt = 0;
		for(int i : d) {
			
			sum = sum + i;
			dept_cnt += 1;
			
			if(sum > budget) {
				dept_cnt = dept_cnt - 1;
			}
		}

        int answer = dept_cnt;
        return answer;
	}
}

public class coding_13 {
	public static void main(String[] args) {
		int[] d = {1,3,2,5,4};
		int budget = 9;
		
		
		Solution_13 sol = new Solution_13();
		System.out.println(sol.solution(d, budget));
		
	}
}