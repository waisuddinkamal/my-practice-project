package Review;

public class Practice {

	String name;
	int id;
	static String company ;

	public Practice() {
		super();
		name = "";
		id = 0;
		company = "Netzone";

	}

	public Practice(String name, int id) {
		this();
		this.name = name;
		this.id = id;
	

	}

	public String toString() {
		return "Name: " + name + " ID: " + id + " Company: " + company;
	}
	
	public static void main (String []args) {
		Practice p = new Practice ();
		p.name = "kamal";
		p.id = 1;
	
		
		Practice p1 = new Practice();
		p1.name = "Eemran";
		p1.id = 2;
		
		
		System.out.println(p.toString());
		System.out.println(p1.toString());
	
		
		
		
	}
	
	
}
