package ClassReview_9_2_2021;

public class WalmartEmployeeDB {
	// how many employees we have in total in all of Walmarts
	// we keep track employees of each branch
	// we also keep a list all of the employees of all of the branches
	// this is a dynamic list that will be initialized for each branch / object of
	// this class
	private Employee[] employees;
	// this is a count of all of the employees of the branch
	private int localCount;
	// this is a static count of all of the branches employees
	private static int globalCount = 0;
	// this is a list of all of the employees of all of the branches
	private static Employee[] allEmployees = new Employee[1000];
	// branch name
	private final String branchName;

	public WalmartEmployeeDB(String branchName) {
		super();
		this.employees = new Employee[100];
		this.localCount = 0;
		this.branchName = branchName;
	}

	public WalmartEmployeeDB(int branchSize, String branchName) {
		super();
		this.employees = new Employee[branchSize];
		this.localCount = 0;
		this.branchName = branchName;
	}

	public boolean addEmployee(Employee emp) {
		// check to see if the system can accept more employees
		if (localCount > employees.length - 1) {
			// system is full
			System.out.println("Error: the system is full and can NOT accept new Employees!");
			return false;
		}
		if (globalCount > allEmployees.length - 1) {
			// system is full
			System.out.println("Error: the Global System is full and can NOT accept new Employees!");
			return false;
		}
		// add the employee to the local list / and increase the count
		employees[localCount++] = emp;
		// add the employee to the global list / and increase the global count
		allEmployees[globalCount++] = emp;
		System.out.println("Employee ADDED to (" + branchName + "): " + emp);
		return true;
	}

	// get method for the count
	public int getBranchCount() {
		return localCount;
	}

	public static int getAllEmployeesCount() {
		return globalCount;
	}

	// print list local branch employees
	@Override
	public String toString() {
		String temp = "********** START of " + branchName + " Employees **********\n";
		for (int i = 0; i < localCount; i++) {
			temp += (i + 1) + ". " + employees[i] + "\n";
		}
		temp += "*********** END of " + branchName + " Employees ***********\n";
		return temp;
	}

	public static void printGlobalListOfEmployees() {
		System.out.println("********** START of Global Employees List **********");
		for (int i = 0; i < globalCount; i++) {
			System.out.println((i + 1) + ". " + allEmployees[i]);
		}
		System.out.println("*********** END of Global Employees List ***********");
	}
}
