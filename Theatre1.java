class Theatre1{

	String name;
	String address;
	long contectNo;
	String ownerName; 
	String[] runningMoviesInVeeresh={"Charlie 777", "Vikram"};	
	String[] runningMoviesInUravashi={"KGF 1", "KGF 2"};	
	
	
	public static void main(String a[])
	{
	//className refvariable =  new ClassName();
	Theatre1 theatre = new Theatre1();
		theatre.name = "Veeresh";
		theatre.address = "Magadi Road";
		theatre.contectNo = 7766448976L;
		theatre.ownerName = "Vaishnavi";
	
		
	System.out.println("The Name of the Theatre "+ theatre.name);
	System.out.println("The Address of the Theatre "+ theatre.address);
	System.out.println("The contectNo of the Theatre "+ theatre.contectNo);
	System.out.println("The ownerName of the Theatre "+ theatre.ownerName);
	theatre.getRunningMovies();
	
	Theatre1 theatre1 = new Theatre1();
		theatre1.name = "Uravashi";
		theatre1.address = "Sudhama Nagar";
		theatre1.contectNo = 8987654325L;
		theatre1.ownerName = "Naresh";
		
	System.out.println("The Name of the Theatre "+ theatre1.name);
	System.out.println("The Address of the Theatre "+ theatre1.address);
	System.out.println("The contectNo of the Theatre "+ theatre1.contectNo);
	System.out.println("The ownerName of the Theatre "+ theatre1.ownerName);
	theatre1.getRunningMovies();
		
	}
	public void getRunningMovies()//Instance Method
	{
		for(int z=0; z< runningMoviesInVeeresh.length;z++)
		{
			System.out.println("The movies running in theatre are "+ runningMoviesInVeeresh[z]);
		}
		for(int z=0; z< runningMoviesInUravashi.length;z++)
		{
			System.out.println("The movies running in theatre are "+ runningMoviesInUravashi[z]);
		}
		
		
	}
	
}