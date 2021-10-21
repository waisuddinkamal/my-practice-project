package Array_Vs_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayAndArrayList {

	public static void main(String[] args) {

		ArrayList <Object> ar = new ArrayList<Object>();
		
		// if we want to change the virtual size of ArrayList 
		
		ArrayList <String> ar1 = new ArrayList<String>(20); // ====> 20 is indicate the virtual capacity of array
		
		ar.add(100);
		ar.add(100);
		ar.add("testing");
		ar.add('c');
		ar.add(12.33);
		ar.add(true);
		
		// using for each loop to go trough the elements of array and print to the console  
		for(Object s :ar) {
			System.out.println(s);
			
		}
		System.out.println("============== for loop ==============");
		// using for loop to go trough the elements of array and print to the console  
		for (int i = 0 ; i <ar.size();i++) {
			System.out.println(ar.get(i));
		}
		System.out.println("============ stream with lambda =============");
		
		// using (stream with lambda) to go trough the elements of array
		ar.stream().forEach(ele -> System.out.println(ele));
		
		System.out.println("================ Iterator ================");
		//  using (Iterator) to go trough the elements of array :
		Iterator<Object>it = ar.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("==========================================");
		System.out.println(ar); // print the array list in a raw (kham) format 
		System.out.println(ar.get(3)); // gating the values baste of index number
		System.out.println(ar.size()); // total size of index
		System.out.println("LI = " +0); // lowest index
		System.out.println("Hi = "+(ar.size()-1)); // highest index
		// System.out.println(ar.get(6)); // Index Out Of Bounds Exception:
		ar.add(400); // adding the value in to array list 
		ar.add(500);
		System.out.println(ar.size());
		
		System.out.println("================================");
		// list with other collection .
		ArrayList <String> name = new ArrayList<String>(Arrays.asList("kamal","wais","emaran","fatima"));
		System.out.println(name);
		System.out.println(name.size());
		for(int i = 0; i <name.size();i++) {
			System.out.println(name.get(i));
			
		}
		System.out.println("====================================");
		
		
	}

}
