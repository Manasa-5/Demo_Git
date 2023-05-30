
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fbrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./sw/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
	ChromeDriver driver1 =new ChromeDriver();
	driver.quit();
		driver1.quit();
		
	}

}
