package ClassReview_9_2_2021;

public class Runner {

	public static void main(String[] args) {

		WalmartEmployeeDB alexandriaBranch = new WalmartEmployeeDB(5, "Alexandria Branch");
		WalmartEmployeeDB arlingtonBranch = new WalmartEmployeeDB(5, "Arlington Branch");
		alexandriaBranch.addEmployee(new Employee("Jack", "something", "jSOmething", "test123", "1/1/1990"));
		alexandriaBranch.addEmployee(new Employee("David", "something", "jSasdhing", "tewervc3", "4/4/1965"));
		arlingtonBranch.addEmployee(new Employee("emp1", "emp1 Lastname", "emp.user", "emp1.pass", "1/1/1950"));
		arlingtonBranch.addEmployee(new Employee("emp2", "emp1 Lastname", "emp.user", "emp1.pass", "1/1/1950"));
		arlingtonBranch.addEmployee(new Employee("emp3", "emp1 Lastname", "emp.user", "emp1.pass", "1/1/1950"));
		arlingtonBranch.addEmployee(new Employee("emp4", "emp1 Lastname", "emp.user", "emp1.pass", "1/1/1950"));
		arlingtonBranch.addEmployee(new Employee("emp5", "emp1 Lastname", "emp.user", "emp1.pass", "1/1/1950"));
		arlingtonBranch.addEmployee(new Employee("emp6", "emp1 Lastname", "emp.user", "emp1.pass", "1/1/1950"));
		System.out.println("alexandriaBranch Count: " + alexandriaBranch.getBranchCount());
		System.out.println("arlingtonBranch Count: " + arlingtonBranch.getBranchCount());
		System.out.println("Global WalmartEmployeeDB Count: " + WalmartEmployeeDB.getAllEmployeesCount());
		System.out.println(alexandriaBranch);
		System.out.println(arlingtonBranch);

		WalmartEmployeeDB.printGlobalListOfEmployees();

	}

}
