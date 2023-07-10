package OOPS;

public class ClassB extends ClassA
{
	public void method02()
	{
		System.out.println("i am also from ClassB");
	}
	
	public static void main(String[] args) 
	{
		ClassB obj = new ClassB();
		obj.method03();
		obj.method02();
		
	}


}
