package InterviewQuestuon;

public class Swap_two_Strings_without_using_third_variable {

	public static void main(String[] args) {
		String a = "wais";
		String b = "kamal";
		System.out.println("the valsue of A before swaping is :"+ a);
		System.out.println("the valuse of B before swaping is :"+b);
		a = a+b;
		b = a.substring(0,a.length()-b.length());
		
		a = a.substring(b.length());
		System.out.println("========================================");
		System.out.println("the valsue of A after swaping is :"+ a);
		System.out.println("the valuse of B after swaping is :"+b);
	}
	

}
