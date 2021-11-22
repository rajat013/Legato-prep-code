package inheritance;

public class Child extends Parent {
	public Child() {
		System.out.println("from child constructor");
	}

	public void display() {
		System.out.println("child");	
	}

	String a="abc";

	public void display2() {
		System.out.println("other child method");
	}

}
