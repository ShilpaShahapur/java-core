class Cosmetics1{

	int id;
	String brand;
	String type;
	int price;
	String color;
	int expiryDate;
	
	public static void main(String a[])
	{
	Cosmetics1 cosmetics = new Cosmetics1();
	cosmetics.id = 1;
	cosmetics.brand = "Lakme";
	cosmetics.type = "Foundation";
	cosmetics.color = "Cream";
	cosmetics.price = 150;
	cosmetics.expiryDate = 2023;
	
		
	System.out.println("The id of the product "+ cosmetics.id);
	System.out.println("The Brand of the Cosmetics is "+ cosmetics.brand);
	System.out.println("The Type of the Cosmetics is "+ cosmetics.type);
	System.out.println("The Color of the Cosmetic is "+ cosmetics.color);
	System.out.println("The Expiry date of the Cosmetic is "+ cosmetics.expiryDate);
	
	
	Cosmetics1 cosmetics1 = new Cosmetics1();
	cosmetics1.id = 2;
	cosmetics1.brand = "Pounds";
	cosmetics1.type = "Primer";
	cosmetics1.color = "White";
	cosmetics1.price = 150;
	cosmetics1.expiryDate = 2024;
	
	System.out.println("The id of the product "+ cosmetics1.id);
	System.out.println("The Brand of the Cosmetics is "+ cosmetics1.brand);
	System.out.println("The Type of the Cosmetics is "+ cosmetics1.type);
	System.out.println("The Color of the Cosmetic is "+ cosmetics1.color);
	System.out.println("The Price of the Cosmetic is "+ cosmetics1.price);
	System.out.println("The Expiry date of the Cosmetic is "+ cosmetics1.expiryDate);
	}
	
}