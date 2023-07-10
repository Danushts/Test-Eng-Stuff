package Tester;

public class defaultconstructor 
{
	int a = 12;
	defaultconstructor()
	{
		System.out.println("zero argument constructor");
		
	}
	
	public void test01() 
	{
		System.out.println(a);
		System.out.println("i am a default constructor");
		System.out.print(a);
		System.out.println(a);
		System.out.println(a);
		
	}
	
	public static void main(String[] args) 
	{
		defaultconstructor eclipse = new defaultconstructor();//zero argument constructor
		eclipse.test01();
		System.out.println(eclipse.a);
		
		
	}

}
