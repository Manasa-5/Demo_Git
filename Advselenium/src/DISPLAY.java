import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DISPLAY {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Manasa/Desktop/SELENIUM/SOURCE%20CODE/DISPLAY.HTML");
		WebElement ele = driver.findElement(By.id("a1"));
		Thread.sleep(1000);
		boolean b = ele.isDisplayed();
		if(b)
		{
			System.out.println("Element displayed");
		}
		else
		{
			System.out.println("Element not displayed");
		}
	}
}
	
