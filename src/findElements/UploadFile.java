package findElements;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFile {

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\GIRISH\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.freeconvert.com//video-compressor");
	driver.manage().window().maximize();
	WebElement uploadElement=driver.findElement(By.xpath("//*[@class='caret-holder hidden-xs']"));
	WebElement device = driver.findElement(By.xpath("//*[@class='fa fa-folder-open-o']"));
	Actions act = new Actions (driver);
	act.moveToElement(uploadElement).build().perform();
	act.moveToElement(device).click().perform();
	StringSelection sel= new StringSelection("C:\\Users\\GIRISH\\Desktop\\Part-2");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
	Robot robo= new Robot();
	robo.keyPress(KeyEvent.VK_CONTROL);
	robo.keyPress(KeyEvent.VK_V);
	robo.keyPress(KeyEvent.VK_ENTER);
	robo.keyRelease(KeyEvent.VK_V);
	robo.keyRelease(KeyEvent.VK_ENTER);
	robo.keyRelease(KeyEvent.VK_CONTROL);
	
	System.out.println("File is uploaded");
	}

}
