package findElements;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PopupMessage {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIRISH\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.samsung.com/in/smartphones/all-smartphones//");
		Thread.sleep(5000);
		/*Alert al=driver.switchTo().alert();
		al.accept();*/
		Robot robot = new Robot();
		robot.delay(5000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_ENTER);
		/*WebElement submit = driver.findElement(By.xpath("\\button[text()='ACCEPT']"));*/
		WebElement submit = driver.findElement(By.xpath("\\button[@data-omni='cookie bar:accept']"));
		driver.switchTo().frame(submit);	
		
		Actions act =new Actions(driver);
		act.moveToElement(submit).click().perform();
		
		System.out.println("Target is achieved");
	}

}
