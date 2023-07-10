package OOPS;

public class Con1 extends abc

{
	public void check02()
	{
		System.out.println(a);
		System.out.println("i am from concete class");
	}
	
	 void abc()
	 {
		 System.out.println("i am constructor");
	 }
	
	public static void main(String[] args) 
	{
		Con1 obj = new Con1();
		obj.check02();
		obj.check01();
		check01();
		
	}

}
