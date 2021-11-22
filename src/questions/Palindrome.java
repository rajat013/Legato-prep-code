package questions;

public class Palindrome {

	public static void main(String[] args) {


		System.out.println("following number is palindrome --> " +checkpalindrome(12455421));

	}
	
	public static boolean checkpalindrome(int num) {
		
		
		boolean ispalindrome=true;
		
		StringBuilder sb = new StringBuilder(Integer.toString(num));
		
		System.out.println(sb);
		
		System.out.println(sb.reverse());
		
		if(sb.toString().equals(sb.reverse().toString())) {
			
			return ispalindrome;
		}
		
		return !ispalindrome;
	}

}
