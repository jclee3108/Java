// 소수 찾기

import java.util.HashSet;
import java.util.Iterator;


class Solution_5 {
	public boolean isPrime(int num) {
		
		if(num == 0 || num == 1) {
			return false;
		}
		
		
		int lim = (int)Math.sqrt(num);
		
		for (int i=2; i<lim; i++) {
			if (num % i == 0) {
				return false;
			}
				
		}
		
		return true;
		
	}
	
	
	HashSet<Integer> numberSet = new HashSet<>();
	public void recursive(String comb, String others) {
		
		// 1. 현재 조합을 set에 추가
		if (comb != "") {
			numberSet.add(Integer.valueOf(comb));
		}
		
		// 2. 조합 만들기
		
		for(int i=0; i<others.length(); i++) {
			recursive(comb + others.charAt(i), others.substring(0,i) + others.substring(i+1));
		}		
	}
	
    public int solution(String numbers) {
    	int count = 0;
    	// 1. 숫자 조합을 구한다.
    	recursive("", numbers);
    	
    	System.out.println(numberSet);
    	
    	// 2. 소수를 구한다. 
    	Iterator<Integer> it = numberSet.iterator();
    	while(it.hasNext()) {
    		int number = it.next();
    		
    		if(isPrime(number)) {
    			count++;
    		}
    		
    	}
    	
    	
    	
    	// 3. 개수를 리던한다
    	
    	
    	int result = count; 
        return result;
    }
}




public class coding_5 {

	public static void main(String[] args) {
		Solution_5 sol = new Solution_5();	
		System.out.println(sol.solution("17"));

	}

}
