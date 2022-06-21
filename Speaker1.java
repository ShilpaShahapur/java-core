class Speaker1
{
	static String Brand = "Phillips";
	static String color = "Black";
	static double price = 2000;
	static boolean isConnected;
	static int maxVolume=6; 
	static int mimVolume; 
	static int currentVolume;

	public static void onOrOff(){
	System.out.println("invoking onOrOff()");
	if(isConnected == false)
	{
	System.out.println("Speaker is turned off need to on connect");
	isConnected = true ;
	System.out.println("Speaker is turned onn...Available for  Connect");
	}
	else if(isConnected == true)
	{
	System.out.println("Speaker are connected has to be turned off");
	isConnected = false;
	System.out.println("Speaker is turned off...");
	}
	}
	public static void main(String a[])
	{
	onOrOff();
	onOrOff();
	onOrOff();
	increaseVolume();
	increaseVolume();
	increaseVolume();
	increaseVolume();
	increaseVolume();
	increaseVolume();
	deceraseVolume();
	deceraseVolume();
	deceraseVolume();
	deceraseVolume();
	deceraseVolume();
	deceraseVolume();
	
	}
	
	public static void increaseVolume(){
		
	System.out.println("increaseVolume method started");
	if(isConnected == true){
	System.out.println("Speaker is turned onn");
	if(currentVolume<maxVolume){
		currentVolume=currentVolume + 1;
		System.out.println("The current  volume  is: "+ currentVolume);
	}

	else
	{
		System.out.println("Max volume is reached");
	}
	System.out.println("increaseVolume method ended");
	}
	else
	{
	System.out.println("Gube.. Speaker on madu");
	}
	System.out.println("increaseVolume method ended");	
	}
	
	public static void deceraseVolume(){
		System.out.println("deceraseVolume method started");
		if(isConnected == true){
			System.out.println("Speaker is turned onn");
			if(currentVolume>mimVolume){
			currentVolume=currentVolume - 1;
			System.out.println("The current is: "+ currentVolume);
			}
			else
			{
				System.out.println("Mim Volume is reached");
			}
			System.out.println("deceraseVolume method ended");
			}
			else
			{
			System.out.println("Gube.. Speaker on madu");
			}
			System.out.println("deceraseVolume method ended");
		}
	}
		
		

