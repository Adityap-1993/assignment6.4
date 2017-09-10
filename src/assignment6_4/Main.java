package assignment6_4;

public class Main {        //main class definition 

	public static void main(String[] args) {         //main starts here 
		
		BankAtm atm1=new BankAtm(1001,"ICICI","Pune",50000);     //creating obj1
		
		BankAtm atm2= new BankAtm(2002,"HDFC","Pune",20000);      //creating obj2
		
		BankAtm atm3=new BankAtm(3003,"AXIS","Pune",8000);            //creating obj3
		
		try {                                                      //monitoring for exception 
			System.out.println("Case 1 for ICICI Atm : When balance is greater than 10000 and greater than withdrawl amount.");
			atm1.withdraw(10000);
			System.out.println(" ");
			System.out.println("Case 2  for HDFC Atm : When balance is greater than 10000 and less than withdrawl amount.");
			atm2.withdraw(30000);
			
			System.out.println(" ");
			System.out.println("Case 3 for AXIS Atm : When Atm balance is less than 10000");
			atm3.withdraw(300000);
			
		}
		
		catch(BankAtmException b)       //catching exception 
		{
			System.out.println("Caught : " + b );
		}

	}

} //class ends 
