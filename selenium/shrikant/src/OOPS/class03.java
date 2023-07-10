package OOPS;

public class class03 implements class01
{

	public void test01() 
	{
		System.out.println("i am from class02");
		
	}

	public void test02() {
		System.out.println("i am from class02");
		
	}

	public void test03() {
		System.out.println("i am from class02");
		
	}
	public void test04() {
		System.out.println("i am from class01");
		
	}
	public void test05() {
		System.out.println("i am from class01");
		
	}
	public static void main(String[] args) 
	{
		class03 obj = new class03();
		obj.test01();
		obj.test02();
		obj.test03();
		obj.test04();
		obj.test05();
	
		
		System.out.println(obj.a);
		
		
	}
	

}
