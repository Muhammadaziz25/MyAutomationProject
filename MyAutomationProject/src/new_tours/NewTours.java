package new_tours;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import static driver.Driver.*;

/**
 * 
 * @author Eagle
 * New Tours Automation
 */
public class NewTours {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = getDriver();
		driver.get("http://newtours.demoaut.com/");
		
		driver.findElement(By.name("userName")).sendKeys("barcelona");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
