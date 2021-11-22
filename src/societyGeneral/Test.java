package societyGeneral;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub

		
	HashMap<String,Integer> hm= new HashMap<String,Integer>();
	
	hm.put("rajat", 1);
	hm.put("anuj", 2);
	hm.put("akash", 3);
	hm.put("satish", 4);
	
	System.out.println(hm);
	
	TreeMap<String,Integer> tm= new TreeMap<String,Integer>(hm);
	System.out.println(tm);
	
	
	LinkedList<String> list= new LinkedList<String>();
	list.add("rajat");
	list.add("mohit");
	list.addFirst("pratik");
	}

}
