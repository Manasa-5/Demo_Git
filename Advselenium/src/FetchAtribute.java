import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchAtribute {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		WebElement ele = driver.findElement(By.xpath("//input[@ aria-label='Phone number, username, or email']"));
		Thread.sleep(1000);
		String att = ele.getAttribute("class");
		System.out.println(att);
		
	}

}
