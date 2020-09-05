package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\GIRISH\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement logo = driver.findElement(By.xpath("//a[@class='nav-logo-link']"));
	if (logo.isDisplayed())
		{
			System.out.println("Logo is present and Visible ");
		}
		else
		{
			System.out.println("Logo is not present and Invisible ");
		}
		
	}

}
