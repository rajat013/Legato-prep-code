package basics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class EmployeeImpl {

	public static void main(String[] args) {

//		Employee e1= new Employee("rajat", 1);
//
//		Employee e2 = new Employee("amit",2);
		
		ArrayList<Movie> list = new ArrayList<Movie>();
		
		list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));
        list.add(new Movie("new movie with same year", 8.3, 1983));
        
        list.stream()
        .sorted(Comparator.comparing(Movie::getYear).thenComparing(Movie::getRating))
        
//        .sorted((x,y)->{
//        	return x.getYear()-y.getYear();
//        })
        
//        .sorted((x,y)->{
//        	return x.getName().compareTo(y.getName());
//        })
        .forEach(i->System.out.println(i));

//		ArrayList<Employee> al = new ArrayList<Employee>();
//
//		al.add(e1);
//		al.add(e2);

//		System.out.println(al.stream().sorted((x,y)->{
//			return y.getId() - x.getId();
//		})
//				.collect(Collectors.toList()));
			

        HashMap<Movie,Integer> hm = new HashMap<Movie,Integer> ();
        Movie m1= new Movie("start war", 8.37, 2017);
        
        Movie m2= new Movie("start new war", 8.337, 20317);
        Movie  m3=null;
        hm.put(m1, 23);
        hm.put(m2, 324);
        hm.put(m3, 324);
     
        System.out.println(hm.get(m3));
        
}
}