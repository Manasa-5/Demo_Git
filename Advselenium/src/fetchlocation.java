import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fetchlocation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		WebElement ele = driver.findElement(By.xpath("//span[@ title='About']"));
		Thread.sleep(1000);
		Point locn = ele.getLocation();
		System.out.println(locn);
		int X = locn.getX();
		System.out.println(X);
		int Y = locn.getY();
		System.out.println(Y);
		
	}

}
