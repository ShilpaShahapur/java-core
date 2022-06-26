class SonyTester{

	public static void main(String a[]){
	Sony sony = new Sony();
	
	sony.price=15000.00;
	sony.color="Black";
	sony.name="Samsung";
	sony.type="Android";
	sony.toContect();
	
	System.out.println(sony.price +" "+sony.color+ " "+ sony.name +"  "+ sony.type);
	}
}