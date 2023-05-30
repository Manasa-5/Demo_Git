import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlemaps {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/maps/@21.125498,81.914063,5z");
		driver.findElement(By.xpath("//button[@ id='hArJGc']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@ tooltip='Choose starting point, or click on the map...']")).sendKeys("HASSAN");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@jsaction='search;focus:pane.focusTooltip;blur:pane.blurTooltip']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@ tooltip='Choose destination, or click on the map...']")).sendKeys("MYSORE");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"directions-searchbox-1\"]/button[1]")).click();
	}

}
