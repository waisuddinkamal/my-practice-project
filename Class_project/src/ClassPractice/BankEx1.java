package ClassPractice;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class BankEx1 {

	public static void main(String[] args) {
	

		double balance = 100;
		
		double payment1 = 9;
		
		int numOfPayment = 1;
		
		while(balance > 0) {
			
			if(balance - payment1 > 0) {
				// after deducting the payment from the balance - balance is still more than zero
				balance = balance - payment1;
			} else {
				// after deducting the payment from the balance - the balance is negative
				// change the payment amount
				payment1 = balance;
				balance = balance - payment1;
			}
			
			
			numOfPayment++;
			
			System.out.println(numOfPayment + " " + balance);
	
		}
	
		}
				

	}


