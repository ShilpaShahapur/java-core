class Restaurant{
	
	int id;
	String name;
	String address;
	long contectNo;
	int noofEmployees;
	String ownerName;
	String type;
	
	
	public static void main(String a[])
	{
	//className refvariable =  new ClassName();
	Restaurant restaurant = new Restaurant();
		restaurant.id =1;
		restaurant.name = "Sagar";
		restaurant.address = "Rajajinagar";
		restaurant.contectNo = 7766448886L;
		restaurant.noofEmployees = 10;
		restaurant.ownerName = "Ajay";
		restaurant.type = "Veg";
	
	System.out.println("The id number is "+ restaurant.id);;	
	System.out.println("The Name of the Restaurant "+ restaurant.name);
	System.out.println("The Address of the Restaurant "+ restaurant.address);
	System.out.println("The contectNo of the Restaurant "+ restaurant.contectNo);
	System.out.println("The ownerName of the Restaurant "+ restaurant.ownerName);
	System.out.println("The noofEmployees in the Restaurant "+ restaurant.noofEmployees);
	System.out.println("The Type of the Restaurant is "+ restaurant.type);

	
	Restaurant restaurant1 = new Restaurant();
		restaurant1.id =2;
		restaurant1.name = "Padmavati";
		restaurant1.address = "Kalikanagar";
		restaurant1.contectNo = 9036000680L;
		restaurant1.noofEmployees = 15;
		restaurant1.ownerName = "Vijay";
		restaurant.type = "NonVeg";
		
	System.out.println("The id number is "+ restaurant1.id);
	System.out.println("The Name of the Restaurant "+ restaurant1.name);
	System.out.println("The Address of the Restaurant "+ restaurant1.address);
	System.out.println("The contectNo of the Restaurant "+ restaurant1.contectNo);
	System.out.println("The ownerName of the Restaurant "+ restaurant1.ownerName);
	System.out.println("The noofEmployees in the Restaurant "+ restaurant1.noofEmployees);
	System.out.println("The Type of the Restaurant is "+ restaurant.type);
	
	
	Restaurant restaurant2 = new Restaurant();
		restaurant2.id =3;
		restaurant2.name = "Laxmi";
		restaurant2.address = "Kalyan Nagar";
		restaurant2.contectNo = 8448488279L;
		restaurant2.noofEmployees = 12;
		restaurant2.ownerName = "Ranjay";
		restaurant.type = "Veg";
		
	System.out.println("The id number is "+ restaurant2.id);	
	System.out.println("The Name of the Restaurant "+ restaurant2.name);
	System.out.println("The Address of the Restaurant "+ restaurant2.address);
	System.out.println("The contectNo of the Restaurant "+ restaurant2.contectNo);
	System.out.println("The ownerName of the Restaurant "+ restaurant2.ownerName);
	System.out.println("The noofEmployees in the Restaurant "+ restaurant2.noofEmployees);
	System.out.println("The Type of the Restaurant is "+ restaurant.type);
	
	
	}
	
}
	

	