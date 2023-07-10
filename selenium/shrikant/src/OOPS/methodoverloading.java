package OOPS;

public class methodoverloading 
{
	void methodoverloading ()
	{
		System.out.println("i am default");
	}
	
	public void methodoverloading (int a) 
	{
		System.out.println("i am a public");
	}
	
	private static void methodoverloading (char c)
	{
		System.out.println("i am a private");
	}
	
	protected static void methodoverloading (String d)
	{
		System.out.println("i am a protected");
	}
	
	public static void main(String[] args) 
	{
    methodoverloading testing = new methodoverloading();
    
    testing.methodoverloading();
    methodoverloading('c');
		
	}
}
