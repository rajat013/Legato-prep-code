package basics;

import java.util.Arrays;
import java.util.List;

public class Main implements MyInterface,MyInterface2 {

	@Override
	public void display() {
		
		
	}

	public static void main(String[] args) throws ClassNotFoundException {
		
		List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(4,5,6);
        List<Integer> list3 = Arrays.asList(7,8,9);
        List<Integer> list4	 = null;
        
        List<List<Integer>> listOfLists = Arrays.asList(list1, list2, list3,list4);
        
//        System.out.println(listOfLists);
//        int a=0;int b=0; int c=1;
//        for (int i=0; i<10; i++) {
//            a = b;
//            b = c;
//            c = a+b;
//            System.out.println(a + "");    //if you want to print on the same line, use print()
//            
//            
//            
//            
//        } 
        
     
	}
	
	

}
