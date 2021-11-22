package multithreading;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1= new NewThread();
//		t1.run();
		t1.start();
		t1.join();
		
		System.out.println("main class");

	}

}
