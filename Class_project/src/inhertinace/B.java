package inhertinace;

public class B {

	public static void main(String[] args) {
		A obj = new A();
		obj.employee(101, "wais", "kamal");
		System.out.println(obj.getId()+" "+obj.getName()+" "+obj.getLastName());
		System.out.println("=================");
		obj.setId(102);
		obj.setName("john");
		obj.setLastName("paul");
		System.out.println(obj.getId());
		System.out.println(obj.getName());
		System.out.println(obj.getLastName());
		
	
	}
}
