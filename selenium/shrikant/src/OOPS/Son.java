package OOPS;

public class Son extends father
{
	public static void method05()
	{
		System.out.println("i am from son");
	}
	
	public void method06()
	{
		System.out.println("i am also from son");
	}
	
	public static void main(String[] args) 
	{
		Son obj = new Son();
		method01();
		obj.method02();
		method03();
		obj.method04();
		method05();
		obj.method06();
		
	}

}
