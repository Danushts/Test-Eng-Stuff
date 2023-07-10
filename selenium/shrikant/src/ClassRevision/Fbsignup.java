package ClassRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fbsignup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\Access\\Documents\\Testing\\chromedriver.exe");
		
		WebDriver call = new ChromeDriver();
		
		call.navigate().to("https://www.facebook.com/signup");
		
		call.manage().window().maximize();
		
		call.findElement(By.xpath("//input[contains(@data-type,\"text\")]")).sendKeys("john");;
	
		call.findElement(By.name("lastname")).sendKeys("carry");

		WebElement mobilenumber = call.findElement(By.xpath("(//input[@type='text'])[3]"));
		mobilenumber.sendKeys("7856465");
		Thread.sleep(3000);
		mobilenumber.clear();
		Thread.sleep(3000);
		mobilenumber.sendKeys("shri.patil35@gmail.com");
		
		call.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("shri.patil35@gmail.com");;
		
		call.findElement(By.id("password_step_input")).sendKeys("234rt5667");
		

		WebElement day = call.findElement(By.xpath("//select[@name = \"birthday_day\"]"));
		day.click();
		
		Select obj01 = new Select(day);
		obj01.selectByIndex(0);
		
		WebElement month = call.findElement(By.xpath("//select[@id = \"month\"]"));
		month.click();
		
		Select obj02 = new Select(month);
		obj02.selectByVisibleText("Jan");
		
		WebElement year = call.findElement(By.xpath("//select[@name = \"birthday_year\"]"));
		year.click();
		
		Select obj03 = new Select(year);
		obj03.selectByValue("1995");
		
		WebElement male = call.findElement(By.xpath("(//input[@type = \"radio\"])[2]"));
		male.click();
		
		WebElement signup = call.findElement(By.cssSelector("button[type = \"submit\"]"));
		signup.click();
		
}

}
