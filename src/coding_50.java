import java.util.HashMap;
import java.util.Iterator;

class Solution_50 {
    public int solution(String[][] clothes) {
    	int answer = 0;
    	
    	// 1.HashMap 만들어준다 
    	HashMap<String, Integer> map = new HashMap<>();
    	
    	
    	for(int i=0; i<clothes.length; i++) {
    		// getOrDefault 넣을 때 Key 로 넣어주기
    		map.put(clothes[i][1],  map.getOrDefault(clothes[i][1], 0)+1);
    	}
    	
    	
    	int sum = 1;
    	Iterator<String> keys = map.keySet().iterator();
    	while (keys.hasNext()) {
    		//map.get(key);
    		String key = keys.next();
    		sum = sum * (map.get(key)+1);
    	}
    	
    	
    	answer = sum - 1 ;
    	
        return answer;
    }
}





public class coding_50 {
	public static void main(String[] args) {
		String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
		Solution_50 sol = new Solution_50();
		System.out.println(sol.solution(clothes));
	}
}
