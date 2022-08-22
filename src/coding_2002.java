

class Solution_2002 {
	public String solution(String S) {
        
		String answer = "";
		
		
		S = S.replace("minus", "-");
		S = S.replace("plus", "+" );
		
		answer = S;
		
        return answer;
    }
}




public class coding_2002 {
	public static void main(String[] args) {
		String S = "plusminusminusplusminusminusplus";
		
		Solution_2002 sol = new Solution_2002();
		System.out.println(sol.solution(S));
		
	}
}
