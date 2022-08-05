import java.util.Arrays;
import java.util.HashSet;
public class coding_22 {
    
    public static String[] uniqueNames(String[] names1, String[] names2) {
    	
    	
    	HashSet<String> Set = new HashSet<>();
    	
    	for(String s1 : names1) {
    		Set.add(s1);
    	}
    	for(String s2 : names2) {
    		Set.add(s2);
    	}
    	
    	
    	String[] result = new String[Set.size()];
    	
    	int i = 0; 
    	for(String ss : Set) {
    		result[i++] = ss;
    	}
    	
    	Arrays.sort(result);
    
        
        return result;
        
    }
    
    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", coding_22.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
//        System.out.println(coding_22.uniqueNames(names1, names2));
        
    }
}