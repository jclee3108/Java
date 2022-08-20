

class Solution_2004 {
    public String solution(String phone_number) {
        
    	   
        int num_cnt = phone_number.length();
        
         String Sec = "";
        
        for(int i=0; i<num_cnt-4; i++){
            Sec = Sec + "*";
        }

        String answer = Sec + phone_number.substring(num_cnt-4);
        return answer;
    }
}



public class coding_2004 {
	public static void main(String[] args) {
		String S = "minusplusminus";
		
		
		Solution_2004 sol = new Solution_2004();
		System.out.println(sol.solution(S));
		
	}
}
