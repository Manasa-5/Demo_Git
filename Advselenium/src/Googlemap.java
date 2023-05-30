import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlemap {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/maps/@12.9856065,77.5085862,14z");
		driver.findElement(By.xpath("//button [@ id='hArJGc']")).click();
		driver.findElement(By.xpath("//*[@id=\"sb_ifc51\"]/input")).sendKeys("hassan");)
		//driver.findElement(By.xpath("//div[@ id='sb_ifc52']")).sendKeys("BANGLORE");
		
		
	}

}
