public class ImageVerification {
      Public static void main(String[]args)
      {
        System.setProperty("webdriver.chrome.driver","")    
        WebDriver driver = new ChromeDriver();
        driver.manage().windows().maximize();
        driver.manage().deleteAllcookies();
        driver.get("https://www.amazon.in/");
        WebElements logo = driver.findElement(By.xpath("//a[@class='nav-logo-link']"));
        boolean amazonLogo= logo.isDisplayed();
        Assert.assertTrue(logo);
      }
