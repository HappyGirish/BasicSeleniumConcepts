package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIRISH\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in//");
	WebElement element = driver.findElement(By.linkText("Customer Service"));
	WebElement Cart = driver.findElement(By.xpath("//a[@id='nav-cart']"));
	Actions act = new Actions(driver);
	act.moveToElement(element).click().perform();
	act.moveToElement(Cart).click().perform();
	System.out.println("Target is Achieved");
	}

}
