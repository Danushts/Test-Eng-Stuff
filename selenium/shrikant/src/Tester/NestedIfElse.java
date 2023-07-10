package Tester;

public class NestedIfElse 
{
	public static void main(String []args) {
	int age =24;
	int weight = 80;
	
	if(age<30) {
		if(weight<70) {
			System.out.println("he can donate the blood");
		}else {
			System.out.println("he cant donate blood");
		}
		
	}
	else if(age==34 && weight ==800) {
	System.out.println("he can do whatevr he want");
	}
	else {
		System.out.println("xyz");
	}
	}
	

};
	

