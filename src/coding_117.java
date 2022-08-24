import java.util.Scanner;

public class coding_117 {

	public static void main(String[] args) {
		
		
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
		
//		int a = 5;
//		int b = 3;
		String result = "";

		for(int i=0; i<a; i++) {
			result = result + "*";
		}
		
		for(int j=0; j<b; j++) {
			System.out.println(result); 
		}
	}

}
