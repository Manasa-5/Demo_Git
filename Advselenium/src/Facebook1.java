import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.Facebook.com");
		driver.findElement(By.xpath("//input[@ id='email']")).sendKeys("8197101258");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@ name='pass']")).sendKeys("ajjayya@145");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@ name='login']")).click();
		
	}

}
