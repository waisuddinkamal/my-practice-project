package ClassPractice;

public class WhileLoopPractice {

	public static void main(String[] args) {

		String text1 = "radar";
		int i1 = 4;
	
		while (i1 >0){
			System.out.println("this is when "+i1+text1.charAt(i1--));
	}
				
		String text2 = "testing";
		int i2 = text2.length() -1;
		while (i2 >=0){
			System.out.print(text2.charAt(i2--));
		}
		System.out.println();
		
		
		String text = "testing"; // this is our string value
		int i = text.length() - 1; // this is when we get the length - 1 which will give us the last index
		while (i >= 0) { // run for as long as i >= 0, which is the last index we want to visit
			System.out.print(text.charAt(i--)); // print the char at that index and then reduce i by 1

		}
	}
}
