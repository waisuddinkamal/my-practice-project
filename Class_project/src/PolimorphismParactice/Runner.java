package PolimorphismParactice;

public class Runner {

	public static void main(String[] args) {
	
		A obj = new A("wais","kamal",25);
		B Bobj = new B(1,'M');
		A obj1 = new B();
		obj1.toString();
		Bobj.toString();
		System.out.println(Bobj);
		obj.toString();
		
		System.out.println(obj);
		
		System.out.println("==================");
		
		obj.setFirstName("john");
		System.out.println(obj.getFirstName());
		Bobj.setId(1);
		System.out.println(Bobj.getId());
		
		

	}

}
