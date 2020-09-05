package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PopupsPermission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIRISH\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		/*WebElement cross = driver.findElement(By.xpath("//span[text()='x']"));*/
		WebElement cross = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		Actions act = new Actions(driver);
		act.moveToElement(cross).click().perform();
		System.out.println("Work is done");
	}

}
