package Array_Vs_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("java");
		ar.add("PHP");
		ar.add("C++");
		ar.add("selyinum");

		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("john");
		ar1.add("james");
		ar1.add("kamal");

		// adding the all element of tow Array List via method
		ar.addAll(ar1);
		System.out.println(ar);

		System.out.println("=============== add the elemetn best of index ==============");
		// add the element best of index
		ar.addAll(2, ar1);
		System.out.println(ar);

		// if we want to clear the array list elements
		ar1.clear();
		System.out.println(ar1);
		System.out.println("=========== Colon List ==============");
		// Creating new array list via colon list and getting the element of other array
		// list

		@SuppressWarnings("unchecked")
		ArrayList<String> CloneList = (ArrayList<String>) ar.clone();
		System.out.println(CloneList);

		System.out.println("============== Contains ===============");
		System.out.println(ar1.contains("john"));
		System.out.println(ar1.contains("wais"));

		System.out.println("=============================");
		// finding the availability of element on the array list
		System.out.println(ar.indexOf("PHP") > 0);

		System.out.println("==============================");
		// founding the last index of element
		ArrayList<String> name = new ArrayList<String>(Arrays.asList("hamad", "mahmod", "kamal", "emran", "wali"));
		int i = name.lastIndexOf("wali");
		System.out.println(i);

		System.out.println("========== remove element from array list ===========");
		// remove element from array list
		name.remove(2);
		System.out.println(name);

		System.out.println("======= removing the specific element from array list ===========");
		// removing the specific element from array list
		name.remove("mahmod");
		System.out.println(name);

		System.out.println("============ removing the integer element by using if method ==========");
		// removing the even integer number element by using if method
		ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
		number.removeIf(num -> num % 2 == 0);
		System.out.println(number);

		System.out.println("============ removing the odd integer number element by using if method ==========");
		// removing the odd integer number element by using if method
		ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
		num.removeIf(n -> n % 2 != 0);
		System.out.println(num);

		System.out.println("=================================");
		// if we want to retrieve the element which is duplicate or not duplicate
		ArrayList<String> name2 = new ArrayList<String>(
				Arrays.asList("hamad", "mahmod", "kamal", "emran", "wali", "kamal"));
		System.out.println(name2);
		name2.retainAll(Collections.singleton("kamal"));
		System.out.println(name2);

		System.out.println("================= Sub List ==================");
		// if want to retrieve the range of element we can you sublist method
		ArrayList<Integer> number2 = new ArrayList<Integer>(
				Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14));
		ArrayList<Integer> sublist = new ArrayList<Integer>(number2.subList(3, 10));
		System.out.println(sublist);

		System.out.println("============= how to convert Array List to Array ==============");
		// how to convert Array List to Array 
		ArrayList<String> name3 = new ArrayList<String>(Arrays.asList("hamad", "mahmod", "kamal", "emran", "wali"));
		Object arr[] = name3.toArray();
		System.out.println(Arrays.toString(arr));
		for(Object o :arr) {
			System.out.println((String)o);
		}
	}

}
