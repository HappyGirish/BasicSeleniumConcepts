package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropAndDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GIRISH\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com//default.aspx");
		driver.manage().window().maximize();
		WebElement Departure=driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']"));
		WebElement Arrival=driver.findElement(By.xpath("//span[@class='select_CTXT']"));
		WebElement Search =driver.findElement(By.xpath("//span[@type='submit']"));
		Actions act=new Actions(driver);
		act.moveToElement(Departure).click().perform();
		/*act.moveToElement(Arrival).click().perform();
		act.moveToElement(Search).click().perform();
		Select DepartureCity = new Select(Departure);
		DepartureCity.deselectByValue(" Jharsuguda (JRG)");
		Select ArrivalCity = new Select(Arrival);
		ArrivalCity.selectByValue("Hyderabad (HYD)");
		Actions act=new Actions(driver);
		act.moveToElement(Search).click().perform();*/
		System.out.println("Work is Done");
		
	}

}
