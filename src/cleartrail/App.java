package cleartrail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
	
		List<String> ar= new ArrayList<String>();
		ar.add("rajat");
		ar.add("anuj");
		ar.add("akash");
		ar.add("satish");
		removefromArray(ar);
		
		
		int arr []= {1,2,3,4,5};
		
		maxvalue(arr);
		

	}
	
	public static void removefromArray(List<String> ar) {
		
		ar.removeIf(i->i.equals("anuj"));
		
		System.out.println(ar);
}
	
	public static int maxvalue(int [] ar) {
		
		return Arrays.stream(ar).max().getAsInt();
	}

}