package recursion;

public class Factorial {

	public static void main(String[] args) {
		
		int result=1;
		
		for (int i=1;i<=5;i++) {
			
			result=result*i;
		}
		
		System.out.println(factorial(5));

	}
	
	public static int factorial(int a)
	{
	
		if (a!=1) {
			return a*factorial(a-1);
		}
		else {
			return a;
		}
		
		
	}
}

