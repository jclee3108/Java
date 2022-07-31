
public class test {

	public static int fibonacci(int numbers) {

		if(numbers == 1) {
			return 1;
		}else if (numbers == 2) {
			return 1;
		}else{
			return fibonacci(numbers - 1) + fibonacci(numbers - 2);
		}			
	}
	
	
	public static void main(String[] args) {
	
		System.out.println(fibonacci(30));
	}

}
