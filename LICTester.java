class LICTester{

	public static void main(String a[]){
	LIC lic = new LIC();
	lic.name = "LIC";
	lic.policyValidity = "2 years";
	lic.toGetMoney();
	
	System.out.println(lic.name +" "+ lic.policyValidity);
	
	}

}