package basics;

public class Singleton {

	
	private static Singleton singletonInstance;
	
	private Singleton() {
		
	}
	
	public static  Singleton newInstance() {
		if (null == singletonInstance) {
			singletonInstance= new Singleton();
			
			
		}
		return singletonInstance;
	}
	
	 public void printSingleton(){
	        System.out.println("Inside print Singleton");
	    }
}
