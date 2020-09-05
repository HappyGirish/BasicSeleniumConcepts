package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementPresenceEnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GIRISH\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbox.clear();
		searchbox.sendKeys("Samsung Mobiles");
		boolean searchIconPresence = driver.findElement(By.xpath("//input[@type='submit']")).isDisplayed();
		boolean searchIconEnable =driver.findElement(By.xpath("//input[@class='nav-input']")).isEnabled();
		if (searchIconPresence == true && searchIconEnable == true)
		{	
			WebElement searchIcon = driver.findElement(By.xpath("//input[@tabindex='10']"));
			searchIcon.click();
			System.out.println("SearchIcon is present and enabled");
		}
		else
			{
				System.out.println("SearchIcon is not present and not enabled");
			}
	
	}

}
