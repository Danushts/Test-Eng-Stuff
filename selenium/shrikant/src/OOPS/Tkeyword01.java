package OOPS;

public class Tkeyword01 
{
	public static void test01()
	{
		System.out.println("i am from frst class");
		
	}
	
	public void test02() 
	{
		System.out.println("i am also from frst class");
		
	}
	public void test03() 
	{
		System.out.println("even i am also from frst class");
		this.test02();
		test01();
		
	}
	
	Tkeyword01()
	{
		System.out.println("i am a constructor of frst class");
	}
	
	public static void main(String[] args) 
	{
		Tkeyword01 obj = new Tkeyword01();
		obj.test03();
		
	}

}
