package HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapStringOfArray {

	public static void main(String[] args) {

		HashMap<String, String> temp = new HashMap<String, String>();

		temp.put("FirstName", "Jack");
		temp.put("LastName", "Daniel");
		temp.put("Age", "21");
		temp.put("Address", "6201 Leesburg, FallsChurch");

		System.out.println(temp.get("Address"));
		System.out.println(temp.get("Age"));

		System.out.println(temp);

		System.out.println(temp.values());
		System.out.println(temp.keySet());

		HashMap<String, ArrayList<String>> data = new HashMap<String, ArrayList<String>>();

		data.put("names", new ArrayList<String>());
		data.put("majors", new ArrayList<String>());

		data.get("names").add("Jack");
		data.get("names").add("David");
		data.get("names").add("Ana");
		data.get("names").add("Cris");

		data.get("majors").add("CS");
		data.get("majors").add("BA");
		data.get("majors").add("EN");

		System.out.println("-------------------------------");
		System.out.println(data);

		System.out.println(data.get("names").get(0) + " " + data.get("majors").get(0));

	}

}
