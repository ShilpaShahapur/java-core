class TubeLight2Tester{

	public static void main(String a[]){
	ElectronicDevice electro = new ElectronicDevice();
	
	electro.price=500.00;
	electro.brandName="Philips";
	electro.wattage= "20 Watts";
	electro.toGetLighting();
	System.out.println(electro.price +" "+ electro.brandName +" "+ electro.wattage);
	}

}