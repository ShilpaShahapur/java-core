class BigBasketTester{
	public static void main(String a[]){
		
		BigBasket big = new BigBasket();
		big.setOwnedBy("Vaishnavi");
		big.setType("Online and offline");
		big.setLocation("Bengaluru");
		
		
		System.out.println(big.getOwnedBy()+" "+big.getType() +" "+ big.getLocation());
		big.toBuy();
	}
	
	
}