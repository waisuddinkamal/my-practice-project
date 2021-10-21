package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class How_to_convert_HashMap_to_ArrayList {

	
	public static void main(String[] args) {
		HashMap<String, Integer> compList = new HashMap<String, Integer>();
		compList.put("google", 10000);
		compList.put("facebook", 20000);
		compList.put("amazon", 50000);
		compList.put("youtube", 60000);

		Iterator<Entry<String, Integer>> it1 = compList.entrySet().iterator();
		while (it1.hasNext()) {
			Map.Entry pairs = (Map.Entry) it1.next();
			System.out.println(pairs.getKey() + " " + pairs.getValue());
		}
		System.out.println("===============");
		// convert HasMap keys into ArrayList:
		List<String> compNameList = new ArrayList<String>(compList.keySet());
		System.out.println("Total Company count = " + compList.size());
		for (String t : compNameList) {
			System.out.println(t);
		}
		// convert HashMap Values into ArrayList:
		System.out.println("==================");
		System.out.println("Total Company Values Count = " + compList.size());
		List<Integer> compValueList = new ArrayList<Integer>(compList.values());
		for (Integer t1 : compValueList) {
			System.out.println(t1);

		}
		System.out.println("============");
		// we can print the key and values by using the Lambda method:
		compList.forEach((k, v) -> System.out.println(k + " " + v));
	}

}
