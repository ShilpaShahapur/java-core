class Mask1
{
	String name;
	int price;
	

	public Mask1(){
		this.wear(); 
		System.out.println("The Mask Object is created");
	}
	
	public static  void wear(){ 
	System.out.println("Helps us to cover Nose and Mouth");
	} 
	
	
	public Mask1(String name ,int price){
	this(); 
	this.name = name ; 
	this.price = price ;
	}
	
	public static void main(String a[])
	{
	Mask1 m = new Mask1("Hyjiva",100);
	System.out.println(m.name +" " +m.price);
	
	}
}

