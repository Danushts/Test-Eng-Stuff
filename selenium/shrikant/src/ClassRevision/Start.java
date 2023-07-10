package ClassRevision;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Start 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\Access\\Documents\\Testing\\chromedriver.exe");// browser intialisation (key,value)
		
		WebDriver call = new ChromeDriver();//upcasting process.
		
//		call.navigate().to("https://app.manufacton.com/");
//		
//		Thread.sleep(3000);
		call.navigate().to("https://en-gb.facebook.com/reg/");
//		
//		String s = call.getTitle();
//		
//		System.out.println(s);
		
//		String d  = call.getCurrentUrl();
//		
//		System.out.println(d);
//		
//		String exptitle = "https://www.amazon.in/";
//		
//		 if(d.equalsIgnoreCase(exptitle))
//		 {
//			 System.out.println("Navigate to correct page");
//		 }
//		 else {
//			 System.out.println("wrong page");
//		 };
//		
//		call.navigate().refresh();
//		
//		call.navigate().forward();
//		
//		call.navigate().back();
//		
//		call.manage().window().maximize();
//		
//		call.manage().window().minimize();
		
		Dimension A = new Dimension(200,300);
		
		call.manage().window().setSize(A);
		
       Point p = new Point(200,300);
		
		call.manage().window().setPosition(p);
		
		
	}
	
	

}
