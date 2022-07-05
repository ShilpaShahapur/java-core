public class CarryBag{
	
	
	public CarryBag(){
	}
	
	// To achieve Encapsulation
	private String name;
	private double price;
	
	//diffrence btw to variable we declare this.
	
	//getter and setter
	public String getName(){
		return name ;
	}
	public void setName(String name){
		this.name = name;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(double price){
		this.price = price;
	}
	
	public void holdThings()
	{
		System.out.println("To Carry Dresses");
	}
 
}