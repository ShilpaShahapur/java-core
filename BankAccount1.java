class BankAccount1
{
	static double amount;
	
	//to get totalAmount method
	
	public static void main(String a[])
	{
	System.out.println("main mathod started");
	deposite(20000.00);
	//invoke withdraw()
	withdraw(13000.00);
	deposite(30000);
	withdraw(2000);
	deposite(5000);
	withdraw(4000);
	deposite(12000);
	withdraw(3000);
	deposite(10000);
	withdraw(5000);
	deposite(8000);
	withdraw(4000);
	deposite(9000);
	withdraw(8000);
	deposite(50000);
	withdraw(30000);
	deposite(7000);
	withdraw(6000);
	deposite(9000);
	withdraw(2000);
	totalAmount();
	System.out.println("main method ended");
	}
	
	static void deposite(double amt)
	{
	System.out.println("invoked deposit()");
	System.out.println("Amount to be deposit"+ amt);
	System.out.println("Amount before deposit"+ amount);
	amount = amount + amt;
	System.out.println("Amount after deposit"+ amount);
	System.out.println("end of deposite()");
	}
	
	static void withdraw(double amt)
	{
	System.out.println("invoked withdraw()");
	System.out.println("Amount to be withdraw"+ amt);
	System.out.println("Amount before withdraw"+ amount);
	amount = amount - amt;
	System.out.println("Amount after withdraw"+ amount);
	System.out.println("end of withdraw()");
	}
	
	static void totalAmount(double amt)
	{
	System.out.println("invoked totalAmount()");
	System.out.println("The total amount in BankAccount is "+ amount);
	}
}