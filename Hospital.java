class Hospitals{

	String name;
	String address;
	long contectNo;
	int noOfBeds; 
	int noOfDoctors;
	String[] noOfDepartmentInBLDE={"Medical Department", "Nursing Department", "Radiology Department","Opertion Theatre Complex"};	
	String[] noOfDepartmentInESI={"Outpatient Department", "Surgical Department", "Non Professional Services","Medical Department"};	
	String[] noOfDepartmentInApollo={"Radiology Department", "Medical Department", "Dietary Department", "Paramedical Department", "Outpatient Department"};
	
	public static void main(String a[])
	{
	Hospitals hospitals = new Hospitals();
		hospitals.name = "BLDE";
		hospitals.address = "Adhrash Nagar";
		hospitals.contectNo = 7766558976L;
		hospitals.noOfBeds = 300;
		hospitals.noOfDoctors = 70;
	
		
	System.out.println("The Name of the Hospital "+ hospitals.name);
	System.out.println("The Address of the Hospital "+ hospitals.address);
	System.out.println("The contectNo of the Hospitals "+ hospitals.contectNo);
	System.out.println("The noOfBeds in the Hospitals "+ hospitals.noOfBeds);
	System.out.println("The noOfDoctors in the Hospitals "+ hospitals.noOfDoctors);
	hospitals.getNoOfDepartmentInBLDE();
	
	Hospitals hospitals1 = new Hospitals();
		hospitals1.name = "ESI";
		hospitals1.address = "Rajaji Nagar";
		hospitals1.contectNo = 8987554325L;
		hospitals1.noOfBeds = 70;
		hospitals1.noOfDoctors = 40;
		
	System.out.println("The Name of the hospitals "+ hospitals1.name);
	System.out.println("The Address of the hospitals "+ hospitals1.address);
	System.out.println("The contectNo of the hospitals "+ hospitals1.contectNo);
	System.out.println("The noOfBeds in the hospitals "+ hospitals1.noOfBeds);
	System.out.println("The noOfDoctors in the hospitals "+ hospitals1.noOfDoctors);
	hospitals1.getNoOfDepartmentInESI();
	
	Hospitals hospitals2 = new Hospitals();
		hospitals2.name = "Apollo";
		hospitals2.address = "Jay Nagar";
		hospitals2.contectNo = 8987634005L;
		hospitals2.noOfBeds = 60;
		hospitals2.noOfDoctors = 30;
		
	System.out.println("The Name of the hospitals "+ hospitals2.name);
	System.out.println("The Address of the hospitals "+ hospitals2.address);
	System.out.println("The contectNo of the hospitals "+ hospitals2.contectNo);
	System.out.println("The noOfBeds in the hospitals "+ hospitals2.noOfBeds);
	System.out.println("The noOfDoctors in the hospitals "+ hospitals2.noOfDoctors);
	hospitals2.getNoOfDepartmentInApollo();
		
	}
	public void getNoOfDepartmentInBLDE()
	{
		for(int z=0; z< noOfDepartmentInBLDE.length;z++)
		{
			System.out.println("The Variety product of pen is"+ noOfDepartmentInBLDE[z]);
		}
	}
	public void getNoOfDepartmentInESI()
	{
		
		for(int z=0; z< noOfDepartmentInESI.length;z++)
		{
			System.out.println("The Variety product are "+ noOfDepartmentInESI[z]);
		}
}
	public void getNoOfDepartmentInApollo()
	{
		for(int z=0; z< noOfDepartmentInApollo.length;z++)
		{
			System.out.println("The Variety product of Beauty "+ noOfDepartmentInApollo[z]);
		}
		
		
	}
	
}