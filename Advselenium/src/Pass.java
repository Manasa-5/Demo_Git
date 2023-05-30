import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Manasa/Desktop/SELENIUM/SOURCE%20CODE/pass%20data.html");
		Thread.sleep(2000);
		//driver.findElement(By.tagName("input")).sendKeys("manasa");
		//driver.findElement(By.id("a1")).sendKeys("deepak");
		//driver.findElement(By.className("c1")).sendKeys("hgahcia");
		driver.findElement(By.name("n1")).sendKeys("santhu");
		

	}

}
