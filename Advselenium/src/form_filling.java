import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class form_filling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uitestpractice.com/Students/Form");
		driver.findElement(By.cssSelector("input[id='firstname']")).sendKeys("Manasa");
		driver.findElement(By.cssSelector("input[id='lastname']")).sendKeys("S");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='optradio']")).click();
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		Thread.sleep(2000);
		WebElement ele =driver.findElement(By.xpath("//select[@id'sell']"));
				Select s=new Select(ele);
				s.selectByVisibleText("India");
		//WebElement ele =driver.findElement(By.xpath("//select[@id'sell']"));
		driver.findElement(By.cssSelector("input[type='number']")).sendKeys("8197101258");
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Manasa_manu");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("Manasagowda145@gmail.com");
		driver.findElement(By.cssSelector("textarea[id='comment']")).sendKeys("Myself Manasa I am from Hassan completed BE graduation in Civil streem");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Manasa@145");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		
		
	}

}
