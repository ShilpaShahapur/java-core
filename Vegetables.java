class Vegetables
{
	static String Vegetables[] = {"Carrot", "Cabbage", "Beetroot","Bean", "Cucumber"};

	public static void main(String a[])
	{
		String value = getVegetables("Coconut");
		System.out.println("Come lets Cut the Vegetables "+ value);
	}

	public static String getVegetables(String Vegetable)
	{
	String VegetableName = null;
	for(int i=0;i<Vegetables.length;i++){
	if(Vegetables[i] == Vegetable){
	VegetableName	= Vegetables[i];
	}
	else{
		System.out.println(Vegetable +" is not present in the list");
		
	}

}
return Vegetable;
}
}

	