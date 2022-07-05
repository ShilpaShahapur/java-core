class CarryBagTester{

	public static void main(String a[]){
	
	CarryBag carry = new CarryBag();
	//carry.name = "Trends carryBag";
	//carry.price = 5.00;
	carry.setName("Trends CarryBag");
	carry.setPrice(5);
	
	System.out.println(carry.getName()+ " "+ carry.getPrice());
	carry.holdThings();
	
	}

}