package InterviewQuestuon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class How_to_Remove_Duplicate_Elements_from_ArrayList {
	// 2 way to remove the duplicate elements form Array list
	// using HashMap
	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(1, 3, 4, 5, 6, 3, 4, 2, 7, 8, 1, 2));

		HashSet<Integer> HashSetList = new HashSet<Integer>(number);
		ArrayList<Integer> NumberListwhitoutDuplicate = new ArrayList<Integer>(HashSetList);
		System.out.println(NumberListwhitoutDuplicate);

		// 2 way to remove the duplicate elements form Array list
		// using JDK 8 Stream
		System.out.println("=========================");
		ArrayList<Integer> marks = new ArrayList<Integer>(Arrays.asList(1, 3, 4, 5, 6, 3, 4, 2, 7, 8, 1, 2));
		List<Integer> marksListUnique = marks.stream().distinct().collect(Collectors.toList());
		System.out.println(marksListUnique);

		// we can remove all data type duplicate elements with this method
	}

}
