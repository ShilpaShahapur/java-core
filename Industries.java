class Industries
{
	static String name = "IndianCo";
	static String type =  "Major Industry";
	String location;
	int noOfWorkers;
	long contactNo;

	public Industries (String loc, int worker, long cNo) {
	System.out.println("Industries object is created");
	this.location = loc;
	this.noOfWorkers = worker;
	this.contactNo = cNo;
	}
	public static void main (String a[]) 
	{
	Industries indus = new Industries("Vijayapur", 300, 9900887766L);
	System.out.println(indus.location + " "+ indus.noOfWorkers +" " + indus.contactNo);
	System.out.println(Industries.name + " "+ Industries.type);
	Industries indus1 = new Industries("Bangalore", 150, 8899007766L);
	System.out.println(indus1.location + " "+ indus1.noOfWorkers +" " + indus1.contactNo);
	System.out.println(Industries.name + " "+ Industries.type);
	}
}
	