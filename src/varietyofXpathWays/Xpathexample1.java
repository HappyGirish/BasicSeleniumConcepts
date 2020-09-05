package varietyofXpathWays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Xpathexample1 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.gecko.driver","C:\\Users\\GIRISH\\geckodriver_win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.spicejet.com/default.aspx");
	WebElement depature = driver.findElement(By.xpath("//*[@value='Departure City']"));
	Actions act = new Actions(driver);
	act.moveToElement(depature).click().perform();
	WebElement odisha = driver.findElement(By.xpath("//*[@text ='Jharsuguda (JRG)']"));
	act.moveToElement(odisha ).click().perform();
	
	/*Select departure = new Select(driver.findElement(By.xpath("//*[@value='Departure City']")));
	departure.selectByVisibleText("Jharsuguda (JRG)");*/
	System.out.println("Target Achieved");
	}
	
}

