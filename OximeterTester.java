class OximeterTester{
	public static void main(String a[]){
		
		Oximeter oxi = new Oximeter();
		oxi.setName("Zebronics");
		oxi.setType("Pulse oximeter");
		oxi.setDevelopedIn(1935);
		oxi.setPrice(800);
		
		
		System.out.println(oxi.getName()+"  "+oxi.getType()+"  "+oxi.getDevelopedIn()+"  "+oxi.getPrice());
		oxi.toCheckPluse();
	}
	
	
}