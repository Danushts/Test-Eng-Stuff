package OOPS;

public class child extends Parent
{
	char ch = 's';
	String f = "d";
	
	public void method03()
	{
		int c = 40;
		System.out.println("i am from child class");
	}
	
	public static void method04()
	{
		System.out.println("i am sttaic methd of class");
	}
	
	child()
	{
		System.out.println("child constuctor");
	}
	
	public void duplicate()
	{
		System.out.println("i am child");
	}
	
	public void D01()
	{
		super.duplicate();
	}

	
	public static void main(String[] args) 
	{
		child obj = new child();
		obj.method01();
		obj.method02();
		obj.method03();
		obj.method04();
		method02();
		method04();
		obj.D01();
		obj.duplicate();
		
		
		
	}
	
	

}
