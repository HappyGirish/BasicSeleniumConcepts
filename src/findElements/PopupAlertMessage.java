package findElements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupAlertMessage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GIRISH\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(5000);
		Alert al = driver.switchTo().alert();
		String Alertmessage=driver.switchTo().alert().getText();
		System.out.println(Alertmessage);
		al.accept();
		System.out.println("Work is done");	
	}

}
