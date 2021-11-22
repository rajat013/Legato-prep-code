package recursion;

public class A {

	public static void main(String[] args) {


		System.out.println(factorial(4));
		System.out.println(splitnum(2327211));
	}

	public static int factorial(int a) {

		if(a==1) {
			return 1;
		}
		else {

			return a*factorial(a-1);
		}
	}
	
	public static double splitnum(double param) {
		
		
		return 3;
	}
}

