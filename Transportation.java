class Transportation
{

	int id;
	static String name="VRL";
	static int noOfSeat=28;
	String type;
	static String location = "Bangalore";
	long contectNo;
	

	public Transportation(int busId, String tp, long cNo){
	System.out.println("Transportation Object is Created");
	this.id = busId;
	this.type = tp ;
	this.contectNo = cNo;
	
	}
	
	public static void main(String a[])
	{
	Transportation trans = new  Transportation(1,"Bus",9886643256L );
	System.out.println(trans.id +" " +trans.type +"  " +trans.contectNo);
	System.out.println(Transportation.name +" " + Transportation.noOfSeat +" " +Transportation.location);
	Transportation trans1 = new  Transportation(2,"Bus",9866544286L );
	System.out.println(trans1.id +" " +trans1.type +"  " +trans1.contectNo);
	System.out.println(Transportation.name +" " + Transportation.noOfSeat +" " +Transportation.location);
	}
}