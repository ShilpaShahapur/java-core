class UserDetails
{
	static String name[] = {"Baba", "Babi", "Chacha","Chachi"};
	static int age[] = {34,56,67,89};
	static long contactNo = 890890890L;
	static boolean isAlive = true;
	static char character = 'J' + '0';
	
	public static void main(String a[])
	{
		System.out.println("User Name is "+ name);
		System.out.println("User age "+ age);
		System.out.println("User contactNo is "+ contactNo);
		System.out.println("User isAlive "+ isAlive);
		System.out.println(character);
	}
	
}