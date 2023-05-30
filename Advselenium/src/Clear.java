import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Manasa/Desktop/SELENIUM/SOURCE%20CODE/clear%20data.html");
		Thread.sleep(1000);
		driver.findElement(By.tagName("input")).clear();
		

	}

}
