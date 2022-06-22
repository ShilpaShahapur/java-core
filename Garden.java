class Garden
{

	
	String name;
	String address;
	static String location = "Bangalore";
	static int price =90;
	long contectNo;
	

	public Garden(String nm,  long cNo, String addres){
	System.out.println("Garden Object is Created");
	this.name = nm;
	this.address = addres;
	this.contectNo = cNo;
	
	}
	
	public static void main(String a[])
	{
	Garden garden = new  Garden("Lalbagh", 9988776655L,"Mavalli");
	System.out.println(garden.name +" " +garden.address +" "+garden.contectNo);
	System.out.println(Garden.location +" "+Garden.price);
	Garden garden1 = new  Garden("Bugle Rock Park",9955668877L,"Basavangudi"  );
	System.out.println(garden1.name +" " +garden1.address +" "+garden1.contectNo);
	System.out.println(Garden.location  +" " +Garden.price);
	}
}