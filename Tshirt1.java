class Tshirt1
{
	String name;
	String color;
	int price;
	String size;
	

	public Tshirt1(){
		this.toWear(); 
		System.out.println("The Tshirt Object is created");
	}
	
	public static  void toWear(){ 
	System.out.println("Comforatble to wear");
	} 
	
	
	public Tshirt1(String name ,String color, int price, String size){
	this(); 
	this.name = name ; 
	this.color = color;
	this.price = price; ;
	this.size = size;
	}
	
	public static void main(String a[])
	{
	Tshirt1 t = new Tshirt1("Hyjiva", "black", 500, "XS");
	System.out.println(t.name +" " +t.color +" " +t.price +" "+t.size );
	
	}
}

