package GroupPractice;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapAnd_How_Iterate {

	public static void main(String[] args) {
		// nor order
		// store by key and value k,v
	HashMap<Integer,String> country = new HashMap<Integer,String>();
	country.put(1, "london");
	country.put(2, "LA");
	country.put(3, "kabul");
	country.put(4, "Sanfransico");
	country.put(5, null);
	
	System.out.println(country.get("UK"));
	System.out.println(country.get(null));
	System.out.println(country.keySet());
	country.remove(1);
	country.remove(2, "LA");
	
	System.out.println("==========");
	System.out.println(country);
	System.out.println("===============");
	
	Iterator<Integer> it = country.keySet().iterator();
	while(it.hasNext()) {
		Integer key = it.next();
		String value = country.get(key);
		System.out.println("key: "+key+ " value: "+value);
		
	}
	System.out.println("=================");
	// for each lambda angel bracket
	country.forEach((k,v)->System.out.println("key: "+k+"value: "+v));
	
	
	}
	

}
