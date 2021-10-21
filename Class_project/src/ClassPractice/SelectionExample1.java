package ClassPractice;

public class SelectionExample1 {

	public static void main(String[] args) {
		// double item1
		// double item2
		// double item3
		// double taxRate
		// all of the variables that we need for this?
		double item1 = 100.99;
		double item2 = 50.99;
		double item3 = 209.87;
		double sum = item1 + item2 + item3;
		double taxRate = 2.5 / 100;
		double taxAmount = sum * taxRate;
		double shipment = sum * 10 / 100;
		double discount = sum * 3.8 / 100;

		// shipment
		// if total > 500 = shipment is free
		// if total > 300 and less than 500 = shipment is 5% of the total
		// if total < 100 = shipment 15% of total
		if (sum > 500) {
			shipment = 0;
		} else if (sum > 300) {
			shipment = sum * 5 / 100;
		} else if (sum < 100) {
			shipment = sum * 15 / 100;
		}

		double grandTotal = sum + taxAmount + shipment - discount;
		System.out.println("*** Store Receipt ***");
		System.out.println();
		System.out.println("Items:");
		System.out.println("Item1 . . . . $" + item1);
		System.out.println("Item2 . . . . $" + item2);
		System.out.println("Item3 . . . . $" + item3);
		System.out.println();
		System.out.println("Total\t\t . . . $" + sum);
		System.out.println("Tax (%2.5)\t . . . $" + taxAmount);
		System.out.println("Shipment\t . . . $" + shipment);
		System.out.println("Discount\t . . . $" + discount);
		System.out.println(" . . . . . . . . . . . . . . . . . . . . . ");
		System.out.println("Grand Total\t . . . $" + grandTotal);

		// Store Receipt
		//
		// Items:
		// Item 1 ..... $amount
		// Item 2 ..... $amount
		// Item 3 ..... $amount
		//
		// Total ...... $the sum
		// TaxRate (%2.5)... $tax amount
		// Shipment ..... $ is 10% total
		// discount ..... 3.8%
		// Grand total ..... $ the sum after tax and shipment

	}

}
