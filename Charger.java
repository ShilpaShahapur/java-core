class MobileCharger
{
	String brandName;
	int price;
	String color
	

	public MobileCharger (){
		this.helpToChargeMobile(); 
		System.out.println("The Charger Object is created");
	}
	
	public static  void helpToChargeMobile(){ 
	System.out.println("Helps us to Cahrge the Mobile");
	} 
	
	
	public MobileCharger(String name ,int price, String color){
	this(); 
	this.name = name ; 
	this.price = price ;
	this.color = color;
	}
	
	public static void main(String a[])
	{
	MobileCharger m = new MobileCharger("Samsung",1000, "White");
	System.out.println(m.name +" " +m.price +" "+m.color);
	
	}
}

