import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDropExample {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Drag and Drop')]")).click();
		Thread.sleep(5000);
		WebElement source = driver.findElement(By.xpath("//div[@id='column-a']"));
		WebElement desti = driver.findElement(By.xpath("//div[@id='column-b']"));
		Actions actions = new Actions(driver);
		Thread.sleep(5000);
		actions.dragAndDrop(source, desti).build().perform();
		Thread.sleep(5000);
		
		
		// TODO Auto-generated method stub

	}

}
