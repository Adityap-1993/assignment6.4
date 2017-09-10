package assignment6_4;   //package declaration

public class BankAtm {              //class definition
	
	private int  atmId;            //instance variables 
	private String bankName;
	private  String location;
	private double balance;
	
	BankAtm(int id,String name,String loc,double balance)          //parameterized constructor 
	{
		this.atmId=id;                                                 //assigning values
		this.bankName=name;
		this.location=loc;
		this.balance=balance;
	}
	
	//getters and setters for variables 
	
	public int getAtmId() {
		return atmId;
	}



	public void setAtmId(int atmId) {
		this.atmId = atmId;
	}



	public String getBankName() {
		return bankName;
	}



	public void setBankName(String bankName) {
		this.bankName = bankName;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	public double getBalance() {
		return balance;
	}



	public void setBalance(double balance) {
		this.balance = balance;
	}



	public void withdraw(double amount)  throws BankAtmException                 //method that can throw exception 
	{
		
		System.out.println("The Balance in the atm : "  + balance );           //displaying balance 
		System.out.println("The amount to be withdrawn : " +amount );
		
		if(balance<10000)                                                    
			throw new BankAtmException(amount);                                        //throwing exception for condition  is true
		else if(balance < amount)
		{
			System.out.println("Insufficient balance in Atm ");
			
			
		}
		
		else 
			
		{
			balance =balance-amount;                                           
			System.out.println("The remaining balance : " + balance );         //displaying balance after deduction 
		}
			
	}
	
	public void deposit(double amount)                             //deposit method 
	{
		balance=balance+amount;
		System.out.println("The totsl balance after deposit is : " +balance);
	}
	
	
	

}//class ends
