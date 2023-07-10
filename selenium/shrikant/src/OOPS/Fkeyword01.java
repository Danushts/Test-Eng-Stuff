package OOPS;

public class Fkeyword01 
{
	final int a = 10;
	int b = 0;
	
	public final void method01() 
	{
		System.out.println("i am from final class");
	}
	
	public final void method01(int a) 
	{
		System.out.println("even i am also from final class");
	}
	
	public static void main(String[] args) 
	{
		Fkeyword01 obj = new Fkeyword01();
		obj.method01();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.b = 30);
	
		
	}

}
