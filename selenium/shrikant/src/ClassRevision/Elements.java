package ClassRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements 
{
	public static void main(String[] args) {
		
	
	System.setProperty("Webdriver.chrome.driver",
			"C:\\Users\\Access\\Documents\\Testing\\chromedriver.exe");
	
	WebDriver call = new ChromeDriver();
	
	call.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
	
	call.manage().window().maximize();
	
	WebElement radio01 = call.findElement(By.xpath("(//input[@type=\"radio\"])[1]"));
	radio01.click();
	
	boolean s = radio01.isSelected();
	System.out.println(s);
	
	WebElement hide = call.findElement(By.xpath("//input[@id = \"hide-textbox\"]"));
	hide.click();
	
	WebElement text = call.findElement(By.xpath("//input[@id = \"displayed-text\"]"));
	
	boolean b = text.isDisplayed();
	
	System.out.println(b);//false
	
	if(b == true) {
	 text.sendKeys("displayed");
	}
	else {
		System.out.println("not displayed");
	}
	
	WebElement show = call.findElement(By.xpath("//input[@id = \"show-textbox\"]"));
	show.click();
	
	WebElement text1 = call.findElement(By.xpath("//input[@id = \"displayed-text\"]"));
	
    boolean bs = text.isDisplayed();
	
	System.out.println(bs);
	
	if(b == true) {
	 text1.sendKeys("displayed");
	}
	else {
		System.out.println("not displayed");
	}
	
	WebElement home = call.findElement(By.linkText("Home"));
	
	String sd = home.getText();
	System.out.println(sd);
	}
}
