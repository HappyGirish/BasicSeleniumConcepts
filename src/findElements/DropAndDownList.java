package findElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropAndDownList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GIRISH\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement all=driver.findElement(By.xpath("//select[@class='nav-search-dropdown searchSelect']"));
		Actions act = new Actions (driver);
		act.moveToElement(all).click().perform();
		Select allcategory = new Select(all);
		allcategory.selectByVisibleText("Electronics");
		System.out.println("Target is Achieved");
	}

}

