package OOPS;

public class Tkeyword02 extends Tkeyword01
{
	public void test04()
	{
		System.out.println("this is childclass");
		this.test03();
		this.test02();
		this.test01();
	}
	
	public static void main(String[] args) 
	{
		Tkeyword02 obj = new Tkeyword02();
		obj.test04();
		
	}

}
