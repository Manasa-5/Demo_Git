import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup {

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox?compose=DmwnWsTJtJpJntlLfhnPPSVzzsrkTLttzLDSdxDNBBgqjtJDcLbgbbfzWxKWBCpqZTHSQdKvHLHL");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@ role='button']")).click();

	}

}
