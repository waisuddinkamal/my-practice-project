package InterviewQuestuon;

public class RemovejunkFromString {

	public static void main(String[] args) {
		//Regular Expression: [^a-zA-Z0-9]
		String name = "À&*#@$ kamal 12324056";
		name = name.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(name);

	}

}
