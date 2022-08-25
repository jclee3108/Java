

class Solution_2006 {
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



public class coding_2006 {
	public static void main(String[] args) {
		String S = "minusplusminus";
		
		
		Solution_2006 sol = new Solution_2006();
		System.out.println(sol.solution(S));
		
	}
}
