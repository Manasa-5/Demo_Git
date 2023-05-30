import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PASS_DISABLE {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Manasa/Desktop/SELENIUM/SOURCE%20CODE/disabled%20txtfield.html");
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('lname').value='MANDEEP'");
		Thread.sleep(1000);
		js.executeScript("document.getElementById('lname').value=''");
		

	}

}
