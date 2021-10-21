package InterviewQuestuon;

import java.util.Arrays;

public class Largest_And_SmallestNumbers_In_Array {
	// Largest and smallest elements 
	public static void main(String[] args) {
		int number[] = {12,45,32,6};
		
		int largest = number [0];
		int smalest = number [0];
		
		for(int i = 1; i <number.length;i++) {
			if(number[i]>largest) {
				largest = number[i];
			}else if (number[i]<smalest) {
				smalest = number[i];
				
			}
		}
			System.out.println("Gaven Number:" +Arrays.toString(number));
			System.out.println("The Lasrgest Number: "+largest);
			System.out.println("The Smalest Number: "+smalest);
		}
				

	}


