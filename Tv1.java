class Tv1
{
	static String Brand = "Sony";
	static String color = "Black";
	static double price = 60000;
	static boolean isTvOn;
	static int maxVolume =6;
	static int mimVolume;
	static int currentVolume;

	public static void onOrOff(){
	System.out.println("invoking onOrOff()");
	if(isTvOn == false)
	{
	System.out.println("The Tv is turned off need to SwitchOn");
	isTvOn = true ;
	System.out.println("The Tv is turned onn...Available to Watch");
	}
	else if(isTvOn == true)
	{
	System.out.println("The Tv is SwitchOn  has to be turned off");
	isTvOn = false;
	System.out.println("Tv is turned off...");
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
	if(isTvOn == true){
	System.out.println("Tv is turned onn");
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
	System.out.println("Channal Change madu");
	}
	System.out.println("increaseVolume method ended");	
	}
	
	public static void deceraseVolume(){
		System.out.println("deceraseVolume method started");
		if(isTvOn == true){
			System.out.println("Tv is turned onn");
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
			System.out.println("Channal Change  madu");
			}
			System.out.println("deceraseVolume method ended");
		}
	}
		
		
	

