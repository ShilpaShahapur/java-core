class Stand2{
	
	double price;
	

	public Stand2(){
		System.out.println("Stand Object Created");
		
	}

	public static void main(String a[])

	{
	Stand2 std = new Stand2();
	std.price = 900.00;
    }
	
	public void price(){
		System.out.println("Tv price is "+ price);
	
	}

}