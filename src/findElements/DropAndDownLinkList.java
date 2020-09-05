package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropAndDownLinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\GIRISH\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	WebElement category = driver.findElement(By.xpath("//*[@id='nav-hamburger-menu']"));
	WebElement moco= driver.findElement(By.xpath("//*[@class='nav-sprite hmenu-arrow-next']"));
	Actions act = new Actions(driver);
	act.moveToElement(category).click().perform();
	act.moveToElement(moco).click().perform();
	System.out.println("Work is Done");
	}
}
