package HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class ConceptOfHashing {

	public static void main(String[] args) {
		HashMap<String, Integer> names = new HashMap<String, Integer>();
		names.put("kamal", 100);
		names.put("wais", 200);
		names.put("john", 300);
		names.put("bob", 400);

		System.out.println(names.get("kamal"));
		System.out.println(names.values());
		System.out.println(names.keySet());

		// fetch to all value of HashMap using the iterator
		Iterator<String> it = names.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			Integer value = names.get(key);
			System.out.println("key: " + key + "values: " + value);
		}
		// for fetch to all value key and value we can use lambda method
		System.out.println("=======================");
		names.forEach((k, v) -> System.out.println("key: " + k + "value: " + v));

	}

}
