class Bar {
	
		int id;
		String barName;
		String price;
		String ownerName; 
		long contactNo;
		
		
		
		public static void main(String a[])
		{
		Bar bar = new Bar();
			int id =1;
			bar.barName = "Preeti";
			bar.price="200";
			bar.ownerName="Ravi";
		
		System.out.println("The id number is "+ bar.id);	
		System.out.println("The Name Of The Drinks "+ bar.barName);
		System.out.println("The price of the Drinks"+ bar.price);
		System.out.println("The Bar ownerName  "+ bar.ownerName);
		
		Bar bar1 = new Bar();
			int i = 2;
			bar1.barName = "Le grand";
			bar1.contactNo = 8987654325L;
			bar1.ownerName = "sachin";
		
		System.out.println("The id number is "+ bar.id);
		System.out.println("The Name of the Bar "+ bar1.barName);
		System.out.println("The contactNo of the Bar "+ bar1.contactNo);
		System.out.println("The ownerName of the Bar "+ bar1.ownerName);
			
		}
		
		
	}