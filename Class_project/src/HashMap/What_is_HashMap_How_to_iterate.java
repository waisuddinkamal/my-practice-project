package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class What_is_HashMap_How_to_iterate {

	public static void main(String[] args) {
		HashMap<String, String> country = new HashMap<String, String>();

		// no order - no indexing
		// store values -- key and value <k,v>
		// key can not be duplicate
		// we can store n number of null values but only one null key
		// Hash Map is not thread-safe unsynchronized

		country.put("Afg", "kabul");
		country.put("UK", "London");
		country.put("US", "Washigton");
		country.put(null, "YubaCity");
		country.put("France", null);
		country.remove("UK"); // the method is removing the element

		System.out.println(country.get("UK"));
		System.out.println(country.get(null));
		System.out.println(country.get("France"));

		// Iterating the all key and value of HashMap by using iterate
		System.out.println("================");
		Iterator<String> it = country.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			String value = country.get(key);
			System.out.println("key: = " + key + "\n" + "Value: = " + value);
		}
		System.out.println("========================");
		// iterator over the set (pair): by using entry set
		Iterator<Entry<String, String>> it1 = country.entrySet().iterator();
		while (it1.hasNext()) {
			Entry<String, String> entry = it1.next();
			System.out.println("Key: = " + entry.getKey() + " the Value: " + entry.getValue());
		}
		System.out.println("================Lombda==============");
		// iterate hashmap using java 8 for each and lombda:
		country.forEach((k, v) -> System.out.println("key: " + k + "Value is: " + v));
	}

}
