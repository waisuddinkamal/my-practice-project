package Array_Vs_ArrayList;
import java.util.ArrayList;
import java.util.List;
public class ListExamples {

	public static void main(String[] args) {
		
	
		
				// Generic
				// ctrl = shift + o ==== manages imports
				List<Integer> data = new ArrayList<Integer>();
				// data-type identifier
				data.add(15);
				data.add(11);
				data.add(12);
				data.add(11);
				data.add(155);
				data.add(158);
				data.add(159);
				data.add(141);
				data.add(148);
				data.add(184);
				data.add(986);
				data.add(5);
				System.out.println(data);
				System.out.println(data.contains(188));
				System.out.println(data.indexOf(148));
				
				for (int i = 0; i < data.size(); i++) {
					
					System.out.println(data.get(i));
				}
			}

	}


