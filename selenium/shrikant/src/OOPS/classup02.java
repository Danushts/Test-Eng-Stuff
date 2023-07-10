package OOPS;

public class classup02 extends Classup01 
{
	public void check01()
	{
		System.out.println("i am from subclass");
		super.check02();
		}
	public static void main(String[] args) 
	{
		Classup01 ab = new 	classup02();
		ab.check01();
		check02();
		System.out.println(ab.a);
		
	}

}
