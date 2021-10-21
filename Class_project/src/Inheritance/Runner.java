package Inheritance;

public class Runner {
	public static void main(String[] args) {
		B b =new B();
		b.setName("Ahmad");
		b.setAge(25);
		b.setId(1);
		b.setAddress("1051 clark ave ");
		b.setPhone(2022341232);
		b.setGender('M');
		b.setEmail("ahmad@gmail.com");
		
		
		System.out.println(b.getName());
		System.out.println(b.getAge());
		System.out.println(b.getId());
		System.out.println(b.getAddress());
		System.out.println(b.getPhone());
		System.out.println(b.getGender());
		System.out.println(b.getEmail());
		
		
		
		
		
	}
	
}
