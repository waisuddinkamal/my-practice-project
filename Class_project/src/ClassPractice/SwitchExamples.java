package ClassPractice;

public class SwitchExamples {

	public static void main(String[] args) {
//		 Target
//		 Costco
//		 Whole food
//		 Best buy
		String storeToShop = "Target";
		System.out.println("list from if statement:");
		if (storeToShop.equals("Target")) {
			System.out.println("shoes");
			System.out.println("t-shirt");

		} else if (storeToShop.equals("Costco")) {
			System.out.println("water");
			System.out.println("cake");
			System.out.println("paper towl");
		} else if (storeToShop.equals("Whole food")) {
			System.out.println("fruits");
			System.out.println("cheese");
		} else if (storeToShop.equals("Best buy")) {
			System.out.println("laptop");
			System.out.println("iphone");
		} else {
			System.out.println("nothing to buy from this store has been listed. get out.");
				
		}
		
		
		
		System.out.println("list from switch:");
		switch (storeToShop) {
		case "Target":
			System.out.println("shoes");
			System.out.println("t-shirt");
			break;
		case "Costco":
			System.out.println("water");
			System.out.println("cake");
			System.out.println("paper towl");
			break;
		case "Whole food":
			System.out.println("fruits");
			System.out.println("cheese");
			break;
		case "Best buy":
			System.out.println("laptop");
			System.out.println("iphone");
			break;
		default:
			System.out.println("no store matched");

		}

	}
}
