
class Solution_12 {
	
	static String sb = "";
	
    static void StAdd(int n) {
        if(n == 1) {
        	sb = sb + "1";
        }else if(n == 2) {
        	sb = sb + "2";
        }else if(n == 3 || n == 0) {
        	sb = sb + "4";
        }else {
            StAdd((n-1)/3); 
            StAdd(n%3);
        }
    }

    public String solution(int n) {
    	StAdd(n);
        return sb;
    }
}


public class coding_12 {
	public static void main(String[] args) {
		int n = 21;
		
		Solution_12 sol = new Solution_12();
		System.out.println(sol.solution(n));
		
	}
}