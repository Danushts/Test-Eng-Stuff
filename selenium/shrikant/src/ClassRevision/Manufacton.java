package ClassRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manufacton 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("Webdriver.chrome.driver", 
				"C:\\Users\\Access\\Documents\\Testing\\chromedriver.exe");
		
		WebDriver demo = new ChromeDriver();
		
		demo.manage().window().maximize();
		
		Thread.sleep(3000);
		demo.navigate().to("https://app.manufacton.com/");
		
		Thread.sleep(3000);
		
		WebElement email = demo.findElement(By.xpath("//input[@type = \"email\"]"));
		email.sendKeys("qa@shrikant.comp");
		
		WebElement pwd = demo.findElement(By.xpath("(//input[@class=\"input has-text-dark\"])[2]"));
		pwd.sendKeys("12345678");
		
		Thread.sleep(3000);
		
		WebElement login = demo.findElement(By.xpath("//button[text() = \"log in\"]"));
		login.click();
		
		Thread.sleep(3000);
		
		WebElement expandicon = demo.findElement(By.xpath("//i[@class=\"fas fa-angle-right\"]"));
		expandicon.click();
		
		
		
		
	}

}
