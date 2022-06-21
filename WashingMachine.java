class WashingMachine
{
	static String Brand = "Samsung";
	static String color = "Grey";
	static double price = 30000;
	static boolean isWashingMachineOn;
	static int maxSpeed=5;
	static int mimSpeed;
	static int currentSpeed;

	public static void onOrOff(){
	System.out.println("invoking onOrOff()");
	if(isWashingMachineOn == false)
	{
	System.out.println("The WashingMachine is turned off need to SwitchOn");
	isWashingMachineOn = true ;
	System.out.println("WashingMachine is turned onn...available for washing the cloths");
	}
	else if(isWashingMachineOn == true)
	{
	System.out.println("The WashingMachine is SwitchOn need to turned off");
	isWashingMachineOn = false;
	System.out.println("WashingMachine is turned off...");
	}
	}
	public static void main(String a[])
	{
	onOrOff();
	onOrOff();
	onOrOff();
	increaseSpeed();
	increaseSpeed();
	increaseSpeed();
	increaseSpeed();
	increaseSpeed();
	deceraseSpeed();
	deceraseSpeed();
	
	
	}
	
	public static void increaseSpeed(){
		
	System.out.println("increaseSpeed method started");
	if(isWashingMachineOn == true){
	System.out.println("WashingMachine is turned onn");
	if(currentSpeed<maxSpeed){
		currentSpeed=currentSpeed + 1;
		System.out.println("The current  volume  is: "+ currentSpeed);
	}

	else
	{
		System.out.println("Max Speed is reached");
	}
	System.out.println("increaseSpeed method ended");
	}
	else
	{
	System.out.println("WashingMachine on madu");
	}
	System.out.println("increaseSpeed method ended");	
	}
	
	public static void deceraseSpeed(){
		System.out.println("deceraseSpeed method started");
		if(isWashingMachineOn == true){
			System.out.println("WashingMachine is turned onn");
			if(currentSpeed>mimSpeed){
			currentSpeed=currentSpeed - 1;
			System.out.println("The current is: "+ currentSpeed);
			}
			else
			{
				System.out.println("Mim Speed is reached");
			}
			System.out.println("deceraseSpeed method ended");
			}
			else
			{
			System.out.println("WashingMachine on madu");
			}
			System.out.println("deceraseSpeed method ended");
		}
	}
		
		




