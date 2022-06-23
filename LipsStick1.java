class LipStick1
{
	String name;
	int price;
	

	public LipStick1 (){
		this.apply(); 
		System.out.println("The Fruit Object is created");
	}
	
	public static  void apply(){ 
	System.out.println("Helps us to look beautiful");
	} 
	
	
	public LipStick1(String name ,int price){
	this(); 
	this.name = name ; 
	this.price = price ;
	}
	
	public static void main(String a[])
	{
	LipStick1 l = new LipStick1("Lakme",1000);
	System.out.println(l.name +" " +l.price);
	
	}
}

