package Tester;

public class Private01 
{
	float g = 0.04f;
	private void p01() {
		char s = 'd';
		System.out.println("Private access");
		System.out.println(s);
		
		}
	
	public static void main(String [] args) 
	{
		Private01 Ob = new Private01();
		Ob.p01();
		System.out.println(Ob.g);
	}

}
