class BusTester{

	public static void main(String a[]){
	Bus2 bus = new Bus2();
	
	bus.ticketPrice=50.00;
	bus.color="Green";
	bus.type="Government Bus";
	bus.toJourney();
	System.out.println(bus.ticketPrice +" "+ bus.color +" "+ bus.type);
	}

}