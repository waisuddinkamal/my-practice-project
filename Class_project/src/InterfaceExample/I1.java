package InterfaceExample;

public interface I1 {
	
	public static final int a = 10;
	
	public abstract void show(); // other access modifier is not acceptable 
	
	default void display() {
		
	}
	static void display1() {
		
	}
}

