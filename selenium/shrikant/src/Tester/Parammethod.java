package Tester;

public class Parammethod 
{
//	public static void method01(int a) 
//	{
//		for(int b = 1;b<=a;b++)
//		{
//	    for (int c = 1;c<=b;c++)
//	    {
//		System.out.print('*');
//		
//	    }
//	    System.out.println();
//		}
//	}
//	
//	public static void main(String []args) {
//		
//       method01(10);
//		
//	}
	
	public void method01(int a, int f) 
	{
		for(int b = 1;b<=a;b++)
		{
	    for (int c = 1;c<=b;c++)
	    {
		System.out.print('*');
		
	    }
	    System.out.println();
		}
	}
	
	public static void main(String []args) {
		Parammethod ad = new Parammethod();
          ad.method01(5,4);
		
	}

};
