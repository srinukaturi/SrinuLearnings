import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chromeBrowserLaunch {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='callout']")));
		driver.findElement(By.xpath("//button[contains(text(),'Stay signed out')]")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.name("q")).sendKeys("srinu");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("C:/Users/saiku/OneDrive/Documents/srinu.png"));
		Thread.sleep(5000);
		driver.quit();
		
		
		// TODO Auto-generated method stub

	}

}
