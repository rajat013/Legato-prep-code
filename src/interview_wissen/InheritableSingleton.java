package interview_wissen;

import java.util.HashMap;
import java.util.Map;

import recursion.A;

public class InheritableSingleton {
	
	
	

//	public InheritableSingleton() throws Exception {
//		if(count>=1) {
//			throw new Exception("more than one object cannot be created");
//		}
//		count++;
//		System.out.println("object created ");
//		
//	}
	
	 private static Map<Class<? extends InheritableSingleton>, InheritableSingleton> instances = new HashMap<>();

	    public InheritableSingleton() {
	    	
	        synchronized (InheritableSingleton.class) {
	            if (instances.containsKey(this.getClass())) {
	            	
	                throw new IllegalStateException();
	            }
	            
	            instances.put(getClass(), this);
	            System.out.println(instances);
	        }
	    }

}
