package ClassPractice;

public class ForLoopNamConversion {

	public static void main(String[] args) {

		// Name convention by for loop
		
		String name = "kamal";
		System.out.println(name.length()); // Total length of name "kamal"
		System.out.println(name.charAt(4)); // The Last later value of the name which is L
		for (int i = 4; i >= 0;) {
			System.out.print(name.charAt(i--));

		}
		
		for(int i=1;i<=100;i++) {
			if(i%3 == 0 && i%5 == 0) {
				System.out.println("The number is: "+ i +" and the value is "+ "TEKSchool");
			}else if(i%3 == 0) {
				System.out.println("The number is: "+ i +" and the value is "+ "Tek");
			}else if(i%5 == 0) {
				System.out.println("The number is: "+ i +" and the value is "+ "School");
			}else if(i%3!=0 || i%5!=0)
				System.out.println("The number is :" + i);

	}
}
}
