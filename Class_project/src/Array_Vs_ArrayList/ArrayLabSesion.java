package Array_Vs_ArrayList;

import java.util.ArrayList;

public class ArrayLabSesion {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();

		names.add("Jack");
		names.add("Jack");
		names.add("Jack");
		names.add("Jack");
		names.add("Jack");

		System.out.println(names);

		ArrayList<ArrayList<String>> nameOfObj = new ArrayList<ArrayList<String>>();

		nameOfObj.add(new ArrayList<String>());
		nameOfObj.add(new ArrayList<String>());
		nameOfObj.add(new ArrayList<String>());
		nameOfObj.add(new ArrayList<String>());
		nameOfObj.get(2).add("David");
		nameOfObj.get(2).add("Jack");

		nameOfObj.get(0).add("Ana");

		System.out.println(nameOfObj);

	}
}
