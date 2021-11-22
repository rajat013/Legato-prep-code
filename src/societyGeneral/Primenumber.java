package societyGeneral;

import java.util.stream.IntStream;

public class Primenumber {

	public static void main(String[] args) {
		
		
		IntStream.range(1, 100).forEach(i->{
			
			if (checkprime(i)) {
				System.out.print(i+" ");
			}
		});
		System.out.println(Boolean.TRUE);
		
		
//		for (int i=2;i<=100;i++) {
//			
//			for (int j=2;j<=i/2;j++) {
//				
//				if(i%j==0) {
//					System.out.print(i+" ");
//				}
//				
//			}
//		}

	}
	
	
	public static boolean checkprime(int n) {
		
		if (n<=1) {
			return false;
		}
		for (int i=2;i<=n/2;i++) {
			if (n%i==0) {
				return false;
			}
		}
		return true;
	}

}
