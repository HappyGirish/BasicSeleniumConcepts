package varietyofXpathWays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class XpathFollowing {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\GIRISH\\geckodriver_win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.samsung.com/in/smartphones/all-smartphones");
		WebElement accept = driver.findElement(By.xpath("//button[@class='cm-cookie-geo__cta-encased js-cookie-accept']"));
		Actions act =new Actions(driver);
		act.moveToElement(accept).click().perform();
		Thread.sleep(3000);
		/*driver.switchTo().alert().accept();*/
		System.out.println("We achieved the destination");
	}
	

}
