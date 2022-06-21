class Microwave
{
	static String Brand = "Godrej";
	static String color = "White";
	static double price = 8000;
	static boolean isMicrowaveOn;
	static int maxHeat=5;
	static int minHeat;
	static int currentHeat;

	public static void onOrOff(){
	System.out.println("invoking onOrOff()");
	if(isMicrowaveOn == false)
	{
	System.out.println("The Microwave is turned off need to SwitchOn");
	isMicrowaveOn = true ;
	System.out.println("Microwave is turned onn...available for heat the food");
	}
	else if(isMicrowaveOn == true)
	{
	System.out.println("The Microwave is SwitchOn need to turned off");
	isMicrowaveOn = false;
	System.out.println("Microwave is turned off...");
	}
	}
	public static void main(String a[])
	{
	onOrOff();
	onOrOff();
	onOrOff();
	increaseHeat();
	increaseHeat();
	increaseHeat();
	increaseHeat();
	increaseHeat();
	deceraseHeat();
	deceraseHeat();
	deceraseHeat();
	
	}
	
	public static void increaseHeat(){
		
	System.out.println("increaseheat method started");
	if(isMicrowaveOn == true){
	System.out.println("Microwave is turned onn");
	if(currentHeat<maxHeat){
		currentHeat=currentHeat + 1;
		System.out.println("The current  volume  is: "+ currentHeat);
	}

	else
	{
		System.out.println("Max heat is reached");
	}
	System.out.println("increaseHeat method ended");
	}
	else
	{
	System.out.println("Microwave on madu");
	}
	System.out.println("increaseHeat method ended");	
	}
	
	public static void deceraseHeat(){
		System.out.println("deceraseHeat method started");
		if(isMicrowaveOn == true){
			System.out.println("Grinder is turned onn");
			if(currentHeat>minHeat){
			currentHeat=currentHeat - 1;
			System.out.println("The current is: "+ currentHeat);
			}
			else
			{
				System.out.println("Min Heat is reached");
			}
			System.out.println("deceraseVolume method ended");
			}
			else
			{
			System.out.println("Microwave on madu");
			}
			System.out.println("deceraseHeat method ended");
		}
	}
		
		





