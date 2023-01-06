package w1CLISourceControlVariables;

public class W1Labs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a variable to hold the quantity of available plane seats left on a flight
		int availablePlaneSeats = 6;
		
		//create a variable to hold the cost of groceries at checkout
		double costOfGroceries = 23.64;
		
		//create a variable to hold a person's middle initial
		char middleInitial ='G';
		
		//create a variable to hold true if it's hot outside and false if it's cold outside
		boolean isHotOutside = false;
		
		//create a variable to hold a customer's first name
		String customerFirstName = "Lili";
		
		//create a variable to hold a street address
		String streetAddress = "333 W Easy St";
		
		//print all variables to the console
		System.out.println(availablePlaneSeats + " Available seats left.");
		System.out.println("Groceries cost:$" + costOfGroceries );
		System.out.println("The person's middle initial is " + middleInitial);
		System.out.println("It is hot outside-" + isHotOutside);
		System.out.println("First Name:" + customerFirstName);
		System.out.println("Person's Address:" + streetAddress);
		
		
		
		//a customer booked 2 place seats, remove 2 seats from the available seats variable
		availablePlaneSeats -= 2;
		System.out.println(availablePlaneSeats);
		
		//impulse candy purchase, add 2.15 to grocery total
		costOfGroceries += 2.15;
		System.out.println(costOfGroceries);
		
		//birth certificate was printed wrong, change middle initial
		middleInitial = 'R';
		System.out.println(middleInitial);
		
		//the season has changed, update the hot outside variable to be opposite from before
		isHotOutside = !isHotOutside;
		System.out.println(isHotOutside);
	
		//create a new variable called full name using the customer's first name, middle initial, and last name
		String fullName = customerFirstName + " " + middleInitial + " Krzycki";
		System.out.println(fullName);
		
		//print a line to the console that introduces the customer and says they live at the address variable
		//System.out.println("About " + fullName + "- " + "Spent:$" + costOfGroceries + " at the store today." + " Place of residence:" + streetAddress);
		System.out.println("Hi my name is " + fullName + ", and I live at " + streetAddress + "." );
		
				
		
				
	}

}
