package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\GIRISH\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.spicejet.com//default.aspx");
	driver.manage().window().maximize();
	WebElement roundTrtp = driver.findElement(By.xpath("//label[text()='Round Trip']"));
	Actions act=new Actions(driver);
	act.moveToElement(roundTrtp).click().perform();
	System.out.println("Work is Done");
	
	}

}
