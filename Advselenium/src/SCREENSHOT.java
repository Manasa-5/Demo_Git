import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SCREENSHOT {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=pmax_cpc&utm_campaign=Myntra_PMax_Summer_Non_Metro_SOK&keyword=&matchtype=&target=&placement=&gclid=Cj0KCQjw9deiBhC1ARIsAHLjR2Dz9fFe-RyyltdodCqQBHD3au3XAJdHQrbCVaqNnSRyQCwBL-Y6W4UaAlQsEALw_wcB");
		Thread.sleep(1000);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File ("C:\\Users\\Manasa\\Desktop\\SELENIUM\\screenshot\\testcase1.jpeg");
		FileHandler.copy(Src, dst);

	}

}
