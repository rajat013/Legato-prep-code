package inheritance;

@FunctionalInterface
public interface NewParent {

	public void m1();
	
	public static void display() {
		System.out.println("static method in new parent");
	}
	
	public default void display2() {
		System.out.println("default method in new parent");
	}
}
