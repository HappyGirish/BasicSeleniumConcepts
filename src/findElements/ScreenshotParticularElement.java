package findElements;

import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotParticularElement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIRISH\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in//");
		driver.manage().window().maximize();
		WebElement logo = driver.findElement(By.xpath("//a[@class='nav-logo-link']"));
		TakesScreenshot ts=(TakesScreenshot)logo;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String timestamp = new SimpleDateFormat("dd_MM_yyyy__hh_mm_ss").format(new Date());
		File dest = new File("./Screenshots/amazonlogo"+timestamp+".png");
		FileUtils.copyFile(src, dest);	
		System.out.println("Particular element Screenshot is taken");
		
	}
		
}
