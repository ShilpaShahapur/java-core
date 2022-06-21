class Grinder
{
	static String Brand = "Godrej";
	static String color = "Blue";
	static double price = 6000;
	static boolean isGrinderOn;
	static int maxSpeed =6;
	static int minSpeed;
	static int currentSpeed;

	public static void onOrOff(){
	System.out.println("invoking onOrOff()");
	if(isGrinderOn == false)
	{
	System.out.println("The Grinder is turned off need to SwitchOn");
	isGrinderOn = true ;
	System.out.println("Grinder is turned onn...available for use");
	}
	
	else if(isGrinderOn == true)
	{
	System.out.println("The Grinder is SwitchOn need to turned off");
	isGrinderOn = false;
	System.out.println("Grinder is turned off...");
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
	increaseSpeed();
	deceraseSpeed();
	deceraseSpeed();
	deceraseSpeed();
	deceraseSpeed();
	deceraseSpeed();
	
	}
	
	public static void increaseSpeed(){
		
	System.out.println("increaseSpeed method started");
	if(isGrinderOn == true){
	System.out.println("Grinder is turned onn");
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
	System.out.println("Grinder on madu");
	}
	System.out.println("increaseSpeed method ended");	
	}
	
	public static void deceraseSpeed(){
		System.out.println("deceraseSpeed method started");
		if(isGrinderOn == true){
			System.out.println("Grinder is turned onn");
			if(currentSpeed>minSpeed){
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
			System.out.println("Grinder on madu");
			}
			System.out.println("deceraseSpeed method ended");
		}
	}
		
		



