package Tester;

public class conOverloading 
{
	conOverloading()
	{
		System.out.println("i am default constructor");
		
	}
	
	conOverloading(int a)
	{
		System.out.println("i am int para constructor");
	}
	
	conOverloading(char a)
	{
		System.out.println("i am char para constructor");
	}
	
	 conOverloading(String a)
	 {
		 System.out.println("i am string para constructor");
	 }
	 
	 public static void main(String[] args) 
	 {
		 conOverloading object = new  conOverloading();
		 conOverloading object1 = new  conOverloading(3);
		 conOverloading object2 = new  conOverloading("d");
		 conOverloading object3 = new  conOverloading('d');
		
	}
}
