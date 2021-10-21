package Review;

public class Runner {

	public static void main(String[] args) {
		
		ClassReview cr = new ClassReview();
		cr.getFirstName();
		cr.setFirstName("Ahamd");
		cr.getlastName();
		cr.setLastName("kamal");
		cr.getAge();
		cr.setAge(26);
		System.out.println(cr);
		cr.toString();
		

	}

}
