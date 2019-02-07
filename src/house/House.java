package house;

public class House {
	// variables
	int houseAddress;
	String houseName;
	 
	// methods
	public void watchGame( ) {    											 	//non return type ; void
		System.out.println("This is our house, we are watching soccer");
	}
	public int addition (int number1, int number2) { 		 // return type ; int . n1 n2 are local variables just for this method
	int total = number1 + number2;
	
	return total;
	}


}
