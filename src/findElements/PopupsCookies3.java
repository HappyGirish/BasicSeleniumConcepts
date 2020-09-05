package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PopupsCookies3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIRISH\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nokia.com//");
		driver.findElement(By.xpath("//*[@class='cookie_dismiss btn btn-transparent-white']")).click();
		/*WebElement cookies = driver.findElement(By.xpath("//a[@class='cookie_dismiss btn btn-transparent-white']"));
		Actions act = new Actions(driver);
		act.moveToElement(cross).click().perform();
		act.moveToElement(cookies).click().perform();*/
		System.out.println("Work is done");
	}

}
