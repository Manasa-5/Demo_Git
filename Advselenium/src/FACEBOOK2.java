import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FACEBOOK2 {

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.Facebook.com");
			Thread.sleep(1000);
			String title = driver.getTitle();
	        System.out.println(title);
			Thread.sleep(1000);
			String Url=driver .getCurrentUrl();
			System.out.println(Url);
	
		}

	}