class Atm {
				
		
			String name;
			String address;
			int noOfMachine;
			String type;
			
			//String[] nameOfTheSbiCard={"Debit card", "credit card"};
					
				
				
			public static void main(String a[])
			{
	
			Atm atm = new Atm();
			atm.branch = "SBI";
			atm.address = "Rajajinagar";
			atm.noOfMachine = 2;
			atm.type = "Debit";
			
					
			System.out.println("The  Branch Name of the ATM is "+ atm.branch);
			System.out.println("The balance of the ATM Is "+ atm.balance);
			System.out.println("The Address  of the ATM Is "+ atm.address);
			System.out.println("The Number of ATM Machine Is "+ atm.noOfMachine);
			System.out.println("ATM type is  "+ atm.type);
			
				
			Atm atm1 = new Atm();
			atm1.branch = "Kotak";
			atm1.address = "Jayanagar";
			atm.noOfMachine = 2;
			atm1.atmOwnerName = "Ruchita";
			atm.type = "Credit";
					
			System.out.println("The Branch Name of the ATM is "+ atm1.branch);
			System.out.println("The balance of the ATM Is "+ atm1.balance);
			System.out.println("The Address  of the ATM Is "+ atm1.address);
			System.out.println("The Number of ATM Machine Is "+ atm1.noOfMachine);
			System.out.println("ATM type is  "+ atm1.type);
			
					
			}
			
				
}