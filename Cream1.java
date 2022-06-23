class Cream1
{
	String name;
	String quantity;
	int price;
	

	public Cream1(){
		this.apply(); 
		System.out.println("The Cream Object is created");
	}
	
	public static  void apply(){ 
	System.out.println("Helps us to look good");
	} 
	
	
	public Cream1(String name ,String quantity, int price){
	this(); 
	this.name = name ; 
	this.quantity = quantity;
	this.price = price ;
	}
	
	public static void main(String a[])
	{
	Cream1 c = new Cream1("Hyjiva", "2g", 200);
	System.out.println(c.name +" " +c.quantity +"" +c.price );
	
	}
}

