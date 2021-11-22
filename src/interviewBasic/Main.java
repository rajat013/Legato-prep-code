package interviewBasic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class Main {

	public static void main(String[] args) {
		
		List list = new ArrayList<>(); 
		
		
		for (int i =1;i<=5;i++) {
			list.add(getemployee("employee"+i,i));
		}

		System.out.println(list);
		
		ConcurrentHashMap<String,String> mapImmutableLogin = new ConcurrentHashMap<String,String>();
		
		
		HashMap<String,String> Login = new HashMap<String,String>();
		
		
	}

	
	
	public static Employee getemployee(String a, int b) {
		
		return new Employee(a,b);
		
	}
}
