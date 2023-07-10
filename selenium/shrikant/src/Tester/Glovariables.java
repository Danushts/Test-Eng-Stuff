package Tester;

public class Glovariables 
{
    int a = 10;
	static int b = 23;
	
	public void method01()
	{
		System.out.println(a);
		System.out.println("check01");
		
	}
	
	public Glovariables () {
		System.out.println(a);
		System.out.println("check02");
	}
	
	public static void method02() 
	{
		System.out.println(b);
		
	}
	
	public static  void main(String args []) {
		Glovariables ab = new Glovariables();
		ab.method01();
		method02();
		System.out.println(b);
		
		
		
	
		
	}
	
	
}
