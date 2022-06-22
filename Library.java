class Library
{

	int id;
	static String name="BLDE Library";
	static int openingTime = 10;
	static int closingTime = 9;
	String type;
	String location;
	long contectNo;
	

	public Library(int clgId, String tp, long cNo, String loc){
	System.out.println("Library Object is Created");
	this.id = clgId;
	this.type = tp ;
	this.contectNo = cNo;
	this.location = loc;
	
	}
	
	public static void main(String a[])
	{
	Library lib = new  Library(1,"School Library",9886643356L, "Vijayapur");
	System.out.println(lib.id +" " +lib.type +"  " +lib.contectNo +" " +lib.location);
	System.out.println(Library.name +" " + Library.openingTime + " "+ Library.closingTime);
	Library lib1 = new  Library(2,"College Library",9866544276L, "Gagag");
	System.out.println(lib1.id +" " +lib1.type +"  " +lib1.contectNo +" " +lib.location);
	System.out.println(Library.name +" " + Library.openingTime + " "+ Library.closingTime);
	}
}