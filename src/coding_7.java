import java.util.*; 

class Solution_7 {
	public int solution(int n, int[] lost, int[] reserve) {

		
		HashMap<Integer, Integer> StudentMap = new HashMap<>();
		
		for(int i=0; i<n+2; i++) {
			// 1. HashMap 만들기 
			StudentMap.put(i, 0);
			// 2. lost 배열은 (-) 넣어주기
			for(int l : lost) {
				if(l == i) {
					StudentMap.put(i, StudentMap.get(i) - 1);
				}
			}
			// 3. reserve 배역은 (+) 넣어주기 
			for(int r : reserve) {
				if(r == i) {
					StudentMap.put(i, StudentMap.get(i) + 1);
				}
			}
			
		}
		
		// 4. 앞뒤 (-)일 경우 reserver 에서 넘겨주기
		for(int i=1; i<StudentMap.size()-1; i++) {
			
			if (StudentMap.get(i) == 1) {
				if(StudentMap.get(i-1) < 0 ) {
					StudentMap.put(i-1, StudentMap.get(i-1) + 1);
					StudentMap.put(i, StudentMap.get(i) - 1);
				}else if (StudentMap.get(i+1) < 0) {
						StudentMap.put(i+1, StudentMap.get(i+1) + 1);
						StudentMap.put(i, StudentMap.get(i) - 1);
					}
				}
			}
		
		
		// 5. 0이상인 값 찾기 
		int result = 0;
		for(int i=1; i<StudentMap.size()-1; i++) {
			if(StudentMap.get(i) >= 0) {
				result += 1 ;
			}
		}
		
        return result;
    }
}



public class coding_7 {

	public static void main(String[] args) {
		Solution_7 sol = new Solution_7();
		int n = 3;
		int[] lost = {3};
		int[] reserve = {1};
		
		
		System.out.println(sol.solution(n, lost, reserve));

	}

}
