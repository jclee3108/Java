

class Solution_2001 {
	public String solution(String S) {
        
		String answer = "";
		
		
		S = S.replace("minus", "-");
		S = S.replace("plus", "+" );
		
		answer = S;
		
        return answer;
    }
}




public class coding_2001 {
	public static void main(String[] args) {
		String S = "plusminusminusplusminusminusplus";
		
		Solution_2001 sol = new Solution_2001();
		System.out.println(sol.solution(S));
		
	}
}
