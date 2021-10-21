package HashMap;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Different_Ways_Creating_HashMap {

	public static HashMap<String, Integer> markMap;

	static {
		markMap = new HashMap<>(); // initialization of Object
		markMap.put("A", 100);
		markMap.put("B", 200);

	}

	public static void main(String[] args) {
		// 1. using HashMap Class
		HashMap<String, Integer> map1 = new HashMap<>();
		Map<String, String> map2 = new HashMap<>();
		// 2.static way , static HashMap
		System.out.println(Different_Ways_Creating_HashMap.markMap.get("A"));

		System.out.println("=========================");
		// Immutable map with only one single entry
		Map<String, Integer> map3 = Collections.singletonMap("kamal", 100);
		System.out.println(map3.get("kamal"));
		// map3.put("wais", 200); // we can't add more element in immutable map
		// will get this exception : UnsupportedOperationException

		// 4. creating one 2D array of String using Stream and collection in the form
		// map
		Map<String, String> map4 = Stream.of(new String[][] { { "wais", "A grade" }, { "kamal", "A+ grade" } })
				.collect(Collectors.toMap(data -> data[0], data -> data[1]));
		System.out.println(map4.get("wais"));

		// Using simpleEntry

		Map<String, String> map5 = Stream.of(

				new AbstractMap.SimpleEntry<>("wais", "java"), new AbstractMap.SimpleEntry<>("kamal", "python"))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(map5.get("wais"));
		System.out.println("====================");
		// Multi Values Map: Max pairs can be stored:
		Map<String, String> multiMap = Map.of("k1", "v1", "k2", "v2", "k3", "v3", "k4", "v4");
		System.out.println(multiMap.get("k3"));

		
		System.out.println("==================");
		// ofEntrys method: no limitation on pairs (key, values)
		Map<String, Integer> map6 = Map.ofEntries(new AbstractMap.SimpleEntry<>("A", 100),
				new AbstractMap.SimpleEntry<>("B", 100), new AbstractMap.SimpleEntry<>("C", 100));

		System.out.println(map6.get("B"));

	}

}
