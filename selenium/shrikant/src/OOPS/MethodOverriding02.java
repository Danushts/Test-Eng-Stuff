package OOPS;

public class MethodOverriding02 extends MethodOverriding
{
	public void test01()
	{
		System.out.println("i am from childclass");
		super.test01();
	}
	
	public static void test02() 
	{
		System.out.println("i am also from childclass");
		
	}
	
	public static void main(String[] args) 
	{
		
		MethodOverriding02 obj = new MethodOverriding02();
		obj.test01();
		obj.test02();
		test02();
	}
	
	

}
