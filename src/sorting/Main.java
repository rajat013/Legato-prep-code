package sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		Student s = new Student("rajat",1);
		Student s1 = new Student("rajat",1);
		Student s2 = new Student("anuj",2);
		Student s3 = new Student("akash",3);
		Student s4 = new Student("satish",4);
		Student s5 = new Student("harsh",4);
		
		
		
		//System.out.println(s1.equals(s2));
		
		ArrayList<Student> star= new ArrayList<Student>();
		star.add(s1);
		star.add(s2);
		star.add(s3);
		star.add(s4);
		star.add(s5);
		
		//System.out.println(star);
		
		star.stream().sorted((a,b)->{
			if(a.getId()==b.getId()) {
				return a.getName().compareTo(b.getName());
			}
			else {
				return b.getId()-a.getId();
			}
			
			}).forEach(i->System.out.println(i));
		
//		star.stream().sorted((a,b)->{
//			
//			
//			
//		});
		
		
		}
	
	
		
	}

