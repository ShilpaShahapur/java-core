class Addition
{
	public static void main(String a[])
	{
		//int finalVlaue //System.out.println(add(67,45))
		int addtionWithTwoNumbers = add(67,45);
		System.out.println(addtionWithTwoNumbers);
		int addtionWithTwoNumbers1 = add(89,90);
		System.out.println(addtionWithTwoNumbers1);
		int addtionWithTwoNumbers2 = add(115,125);
		System.out.println(addtionWithTwoNumbers2);
		int add = add(99,77,88);
	
	}
		public static int add(int a, int b)
		{
		return a+b;      //int c = a+b;
						//return c;
		}

	 static void add(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
}