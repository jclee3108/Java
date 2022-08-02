

class Solution_16 {
    public int solution(String s) {
        
    	int shot_len = 0;
    	
    	for(int i = 1; i< s.length(); i++) {
    		
    		if(i == 1) {
    			shot_len = shotText(i,s).length();
    		}else {
    			if(shot_len > shotText(i,s).length()) {
    				shot_len = shotText(i,s).length();
    			}
    		}
    	}
    	
    	System.out.println(shot_len);
    	
//    	String result = shotText(1, s); 
        
//    	System.out.println(result);
      
        
        int answer = shot_len;
        return answer;
    }
    
	public String shotText(int n, String s) {
		
		int num_cnt = 1;
        String pre_Text = s.substring(0,n);
        String this_Text = s.substring(n,n*2);
        String result = "";
        
        int len_cnt = s.length();
        for(int i =1; i<len_cnt/n; i++){
        	

        	
//	        	System.out.println(i);
        	if (i > 0) {
        		pre_Text = this_Text;
        	}else {
        		pre_Text = s.substring(0,n);	
        	}
        	
        	this_Text = s.substring(n,n*2);
        	s = s.substring(n);
        	
        	
	        	System.out.println("pre : " + pre_Text);
	        	System.out.println("this : " + this_Text);
	        	System.out.println(s);
        	
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
		String s = "aabbaccc";
		
		
		Solution_16 sol = new Solution_16();
		System.out.println(sol.solution(s));
		
	}
}