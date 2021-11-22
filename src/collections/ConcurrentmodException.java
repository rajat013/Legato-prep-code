package collections;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentmodException {

	public static void main(String[] args) {
		
		ConcurrentHashMap<String, String> chm= new ConcurrentHashMap<String,String>();
		
		chm.put("rajat", "java");
		chm.put("anuj", "react");
		
		chm.put("akash", "ca");
		
		
		
	}

}
