package OOPS;

public class ClassC extends ClassA
{
	public void method04()
	{
		System.out.println("i am also from ClassC");
	}
	
	public static void main(String[] args) 
	{
		ClassC obj = new ClassC();
		obj.method03();
		obj.method04();
		
	}


}
