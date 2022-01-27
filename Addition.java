class Addition
{
	  static int res1,res2,res3,res4;
	static public  int add1(int a1,int b1)
	{
		 res1= a1+b1;
		return res1;
	}
	static public int add2(int a2,int b2,int c2)
	{
		res2=a2+b2+c2;
		return res2;
	}
	static public  int add3(int a3,int b3,int c3,int d3)
	{
		res3=a3+b3+c3+d3;
		return res3;
	}
	static public int add4(int a4,int b4,int c4,int d4,int e4)
	{
		res4=a4+b4+c4+d4+e4;
		return res4;
	}
	public static void main(String[] args) 
	{
		
		System.out.println("Addition of Two number"+ ":" +add1(80,20));
		
		System.out.println("Addition of Three number"+ ":" +add2(60,20,20));

		System.out.println("Addition of Four number"+ ":" +add3(25,25,25,25));
		
		System.out.println("Addition of Five number"+ ":" +add4(20,20,20,20,20));
		
	}
}
