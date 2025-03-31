import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class mutipleWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		String firstChild="";
		driver.get("https://www.way2automation.com/demo.html");
		driver.manage().window().maximize();
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[contains(text(),'Frames and Windows')]")).click();
		Set<String> mylist = driver.getWindowHandles();
		for(String value: mylist)
		{
			System.out.println(driver.getTitle());
			if(!value.equalsIgnoreCase(parentWindow))
			{
				firstChild = value;
				driver.switchTo().window(value);
				driver.getTitle();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[@class='fancybox-inner']/div/form/div[2]/div/p[1]/a")).click();
				
			}
		}
		driver.findElement(By.xpath("//div[@class='row']/div[3]/ul/li/a")).click();
		Set<String> mylist1 = driver.getWindowHandles();
		Thread.sleep(3000);
		for(String nvalue: mylist1)
		{
			System.out.println(nvalue);
			if((!nvalue.equalsIgnoreCase(parentWindow))&&(!nvalue.equalsIgnoreCase(firstChild)))
					{
				driver.switchTo().window(nvalue);
				driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='example-1-tab-1']/div/iframe")));
				driver.findElement(By.xpath("//a[contains(text(),'New Browser Tab')]")).click();
					}
		}
		driver.switchTo().window(firstChild);
		driver.findElement(By.xpath("//a[@href='dropdown.php']")).click();
		Set<String> mylist2 = driver.getWindowHandles();
		List<String> myalist = new ArrayList<String>(mylist2);
		String newWindow = myalist.getLast();
		driver.switchTo().window(newWindow);
		driver.findElement(By.xpath("//a[contains(text(),'Enter Country')]")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='example-1-tab-2']/div/iframe")));
		driver.findElement(By.xpath("//select[@id='combobox']")).click();
		List<WebElement> mylist3 = driver.findElements(By.xpath("//select[@id='combobox']/option"));
		for(WebElement we: mylist3)
		{
			if(we.getText().equalsIgnoreCase("Pakistan"))
			{
			we.click();	
			driver.findElement(By.xpath("//select[@id='combobox']")).click();
			}
		}
		
		/*
		 * Select sc = new
		 * Select(driver.findElement(By.xpath("//select[@id='combobox']")));
		 * sc.selectByContainsVisibleText("Afghanistan");
		 */
		
		Thread.sleep(5000);
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
