

class Solution_16 {
    public int solution(String s) {
        
    	int shot_len = 0;
    	
    	for(int i = 1; i<=s.length()/2; i++) {
    		
    		if(i == 1) {
    			shot_len = shotText(i,s).length();
    		}else {
    			if(shot_len > shotText(i,s).length()) {
    				shot_len = shotText(i,s).length();
    			}
    		}
    	}
//    	
//    	System.out.println(s.length());
    	
//    	for(int i = 1; i< s.length()/2; i++) {
//    		System.out.println(i);	
//    		System.out.println(shotText(i,s));
//    		System.out.println(shotText(i,s).length());
    	
//    	}
    	
//    	System.out.println(shotText(8,s));
//    	String result = shotText(1, s); 
        
//    	System.out.println(result);
      
        
        int answer = shot_len;
        return answer;
    }
    
	public String shotText(int n, String s) {
		
		String ss = s;
		int num_cnt = 1;
        String pre_Text = ss.substring(0,n);
        String this_Text = ss.substring(n,n*2);
        String result = "";
        
        
        int len_cnt = ss.length();
        for(int i =1; i<len_cnt/n; i++){
        	

        	
//	        	System.out.println(i);
        	if (i > 1) {
        		pre_Text = this_Text;
        	}
        	
        	this_Text = ss.substring(n,n*2);
        	ss = ss.substring(n);
        	
//        	
//	        	System.out.println("pre : " + pre_Text);
//	        	System.out.println("this : " + this_Text);
//	        	System.out.println(s);
//        	
        	if (pre_Text.equals(this_Text)) {
        		num_cnt += 1;
        		
        	}else {
        		result = result + Integer.toString(num_cnt) + pre_Text;
        		num_cnt = 1;
        	}
        	
            
        }
        result = result + Integer.toString(num_cnt) + pre_Text;
        
        return result.replace("1", "");
	
		
		
	}
}



public class coding_16{
	public static void main(String[] args) {
		String s = "xababcdcdababcdcd";
		
		
		Solution_16 sol = new Solution_16();
		System.out.println(sol.solution(s));
		
	}
}