package interviewBasic;

public final class MutableClass {

	private final String name;
	
	private final int id;

	private final Age age;
	
	public MutableClass(String name, int id) {
		
		this.name = name;
		this.id = id;
		Age cloneage = new Age();
		cloneage.setMonth(123);
		cloneage.setYear(123);
		this.age= cloneage;
	}


	public String getName() {
		return name;
	}


	public int getId() {
		return id;
	}

	
	
	
}
