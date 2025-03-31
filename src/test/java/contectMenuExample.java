import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contectMenuExample {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Context Menu')]")).click();
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//div[@id='hot-spot']"))).contextClick().build().perform();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='flash-messages']")).click();
		Thread.sleep(5000);
		// TODO Auto-generated method stub

	}

}
