package OOPS;

public class Parent 
{
       int a = 10;
	
	public void method01()
	{
		int b = 20;
		System.out.println("i am from class one");
		System.out.println(b);
	}
	
	public static void method02()
	{
		System.out.println("i am static method from class parent");
	}
	
	Parent()
	{
		System.out.println("i am from parent class constructor");
	}
	
	public void duplicate()
	{
		System.out.println("i am duplicate");
	}


}
