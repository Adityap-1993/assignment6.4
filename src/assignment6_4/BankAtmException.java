package assignment6_4;     //package declaration 

public class BankAtmException extends Exception {    //defining exception class by extending exception class 
	double amount;
	
	BankAtmException(double amt)               //parameterized constructor for exception  
	{
		this.amount=amt;
		
		System.out.println("Withdrawl cannot be processed as amount balance in ATM is less than 10000"); //message to be displayed 
		
	}
	
	


}//class ends
