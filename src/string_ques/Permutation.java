package string_ques;

public class Permutation {

	public static void main(String[] args) {

		String a ="ABC";

		int n= a.length()-1;

		permute(a,0,n);


	}
	public static void permute(String input ,int start,int end ) {

		if ( start== end ) {
			System.out.println(input);
		}
		else {

			for (int i=start;i<=end;i++ ) {
				input=swap(input,start,i);
				permute(input,start+1,end);
				input =swap(input,start,i);
			}
		}

	}

	public static String swap(String str,int i,int j) {
		char temp;

		char[] charArray=str.toCharArray();
		temp=charArray[i];

		charArray[i]=charArray[j];
		charArray[j]=temp;



		return String.valueOf(charArray);
	}

}
