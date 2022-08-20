

class Solution_1001 {
	 public int solution(int N) {
		// write your code in Java SE 8
        int answer = 0;
        String binaryString = Integer.toBinaryString(N);


        int result = 0; 
        int ing_result = 0;

        for(int i=0; i<binaryString.length(); i++){
            //System.out.println(binaryString.substring(i, i+1));
            //System.out.println(ing_result);
            if(binaryString.substring(i, i+1).equals("1")){
                if(ing_result > result){
                    result = ing_result;
                }
                ing_result = 0;
            }else {
                ing_result += 1;
            }
        }
        answer = result;
        return answer;
    }
}



public class coding_1001 {
	public static void main(String[] args) {
		int N = 1041;
		
		
		Solution_1001 sol = new Solution_1001();
		System.out.println(sol.solution(N));
		
	}
}
