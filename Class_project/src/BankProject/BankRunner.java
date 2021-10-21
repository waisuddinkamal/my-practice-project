package BankProject;

public class BankRunner {
	public static void main(String[] args) {

		Address add1 = new Address("6201 Leesburg Pike", "Ste 216", "Falls Church", "VA", "22044");
		Address sample2 = new Address("6202 Leesburg Pike", "Ste 216", "Falls Church", "VA", "22044");
		System.out.println(add1);
		System.out.println(sample2);
		System.out.println(add1.equals(sample2));
		Customer x = new Customer("Jack", "David", 52, 101224444, "12/12/1969", 2027546585, "somethingdavid@gmail.com",
				add1, "Password123", 10103201);

		System.out.println(x);

		x.deposit(159.99, "Password123");
		System.out.println(x);

		x.withdraw(55.99, "Password123");
		System.out.println(x);

	}
}
