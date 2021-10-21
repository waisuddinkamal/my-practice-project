package InheritanceCarProject;

public class CarRunner {
public static void main(String[] args) {
		
		Car obj = new Car("asd442as54d25a4sd", "Toyota", "4Runner");
		
		Toyota obj2 = new Toyota();
		obj2.setHasFiveStarSafety(true);
		obj2.setColor("White");
		obj2.setModel("Camary");
		System.out.println(obj);
		System.out.println(obj2);
		
	}
}
