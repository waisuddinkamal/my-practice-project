package Array_Vs_ArrayList;

import java.util.ArrayList;

public class VirtualCapacity {

	public static void main(String[] args) {

		ArrayList<Object> ar = new ArrayList<Object>();
		
		System.out.println(ar.size()); // the fiscally size of this array is 0 and the virtual size of this array is 10
		ar.add(100);
		
		System.out.println(ar.size()); // now the size is 1 baste of adding the data 
		
		ar.add(200);
		ar.add(300);
		ar.add(500);
		ar.add(600);
		ar.add(700);
		ar.add(800);
		ar.add(900);
		ar.add(100);
		ar.add(300);
		ar.add("test");
		
		System.out.println(ar.size());

	}

}
