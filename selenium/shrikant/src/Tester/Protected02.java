package Tester;

public class Protected02 
{
	int m = 5;
	 public void check01() {
		 System.out.println("protected method02");
	 }
	 
	 public static void main (String []args) 
	 {
		 Protected01 ad = new Protected01();
		 ad.P01();
		 System.out.println(ad.a);
		 
	 }

}
