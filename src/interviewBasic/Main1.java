package interviewBasic;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main1 {

	public static void main(String[] args) {
		
		//Map<Employee, Integer> hm = new HashMap<Employee, Integer>();
		
		Map<Employee, Integer> hm = new TreeMap<Employee, Integer>();
		
		Employee e1= new Employee("rajat", 1);
		Employee e2= new Employee("raajat", 1);
		Employee e3= new Employee("rajat", 1);
		
		hm.put(e1, 100);
		
		hm.put(e2, 101);
		
		System.out.println(hm.size());
		System.out.println(hm);
		
		System.out.println(hm.get(e3));
		

	}

}
