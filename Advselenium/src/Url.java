import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Url {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	String title =driver.getTitle();
	System.out.println(title);
	Thread.sleep(1000);
	String pagesrc=driver.getPageSource();
	System.out.println(pagesrc);
	Thread.sleep(1000);
	String url=driver.getCurrentUrl();
System.out.println(url);
driver.quit();
	}

}
