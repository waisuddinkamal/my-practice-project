package Bank;

import BankProject.Address;

public class CustomerAddress {

	String addLineOne;
	String addLineTwo;
	String city;
	String state;
	String zipCode;

	public CustomerAddress() {
		addLineOne = "";
		addLineTwo = "";
		city = "";
		state = "";
		zipCode = "";
	}

	public CustomerAddress(String addL1, String addL2, String c, String s, String z) {

		addLineOne = addL1;
		addLineTwo = addL2;
		city = c;
		state = s;
		zipCode = z;
	}

	public String toString() {
		return "Address" + addLineOne + ", " + addLineTwo + ", " + city + ", " + ", " + state + ", " + zipCode;
	
		public boolean equals(Address newAddress) {
			if(addLineOne.equals(newAddress.addLineOne)) {
				
			}
			return true;
			
		}
	}

}
