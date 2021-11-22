package societyGeneral;

import java.util.HashMap;
import java.util.stream.Collectors;

public class JsonValues {

	public static void main(String[] args) {
		
		HashMap<String,String> hm = new HashMap<String,String>();
		
		hm.put("rajat", "agrawal");
		hm.put("satish", "mishra");
		
		hm.put("anuj", "agrawal");
		StringBuilder a = new StringBuilder();
		
		System.out.println(hm.values().stream().map(n->n).collect(Collectors.joining("_")));
		
		hm.values().stream().forEach(i->{
			a.append(i+"_");
		});
		System.out.println(a);
	}

}
