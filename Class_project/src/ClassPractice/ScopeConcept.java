package ClassPractice;

public class ScopeConcept {

	public static void main(String[] args) {
		int x = 10;
		int y = 15;
		if (true) {
			int z = 17;
			System.out.println(x + y + z);
		}
		System.out.println(x + y);

	}

}
