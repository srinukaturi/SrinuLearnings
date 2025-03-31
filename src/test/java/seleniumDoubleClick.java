import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("usha");
        WebElement ele = driver.findElement(By.xpath("//button[@id='dblClkBtn']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(ele).doubleClick().build().perform();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        driver.findElement(By.xpath("//input[@value='male']")).click();
        driver.findElement(By.xpath("//input[@value='female']")).click();
        driver.findElement(By.xpath("//input[@value='Automation']")).click();
        driver.findElement(By.xpath("//input[@value='Automation']")).click();
		Thread.sleep(5000);
		Select select = new Select(driver.findElement(By.xpath("//select[@id='testingDropdown']")));
		select.selectByIndex(3);
		Thread.sleep(5);
		
		// TODO Auto-generated method stub

	}

}
