class PetrolBunk2
{

	
	static String petrolBunkName="Indian";
	static int gst;
	String type;
	static String location = "Bangalore";
	long contectNo;
	

	public PetrolBunk2(int gt, String tp, long cNo){
	System.out.println("PetrolBunk Object is Created");
	this.gst = gt;
	this.type = tp ;
	this.contectNo = cNo;
	
	}
	
	public static void main(String a[])
	{
	PetrolBunk2 petrol = new  PetrolBunk2(59,"Disel",9886643256L );
	System.out.println(petrol.gst +" " +petrol.type +"  " +petrol.contectNo);
	System.out.println(PetrolBunk2.petrolBunkName  +" " +PetrolBunk2.location);
	PetrolBunk2 petrol1 = new  PetrolBunk2(2,"Petrol",9866544286L );
	System.out.println(petrol1.gst +" " +petrol1.type +"  " +petrol1.contectNo);
	System.out.println(PetrolBunk2.petrolBunkName  +" " +PetrolBunk2.location);
	}
}