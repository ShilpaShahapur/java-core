class Mobile1{
			
	int id;
	String brand;
	String modelNo;
	int price;
	String color; 
	String type;
			
			
			
	public static void main(String a[])
	{
		Mobile1 mobile = new Mobile1();
		mobile.id = 1;
		mobile.brand = "Vivo";
		mobile.modelNo = "Y27";
		mobile.price= 20000;
		mobile.color ="Black";
		mobile.type = "Android";
			
		System.out.println("The ID Number is "+ mobile.id);		
		System.out.println("The Name of the Brand is "+ mobile.brand);
		System.out.println("The Model of the Mobile is "+ mobile.modelNo);
		System.out.println("The Price of the of the Mobile "+ mobile.price);
		System.out.println("The Mobile Color is  "+ mobile.color);
		System.out.println("The Mobile Type is  "+ mobile.type);
		
		Mobile1 mobile1 = new Mobile1();
		mobile1.id = 2;
		mobile1.brand = "Honor";
		mobile1.modelNo = "9Lite";
		mobile1.price= 10000;
		mobile1.color ="Blue";
		mobile1.type = "Android";
		
		System.out.println("The ID Number is "+ mobile1.id);		
		System.out.println("The Name of the Brand is "+ mobile1.brand);
		System.out.println("The Model of the Mobile is "+ mobile1.modelNo);
		System.out.println("The Price of the of the Mobile "+ mobile1.price);
		System.out.println("The Mobile Color is  "+ mobile1.color);
		System.out.println("The Mobile Type is  "+ mobile1.type);
		
		}
		
			
	}