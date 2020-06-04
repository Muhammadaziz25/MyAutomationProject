package test_leaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.Driver;
import utilities.Sleep;

public class HyperLink_Class55 {

	public static void main(String[] args) {

		WebDriver driver = Driver.getDriver("chrome");
		driver.get("http://testleaf.herokuapp.com/");
		driver.findElement(By.linkText("HyperLink")).click();
//		(//a[text()='Go to Home Page'])[2]
		driver.findElement(By.xpath("//a[text()='Go to Home Page']")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("Verify am I broken?")).click();
		String actualHeader = driver.findElement(By.tagName("h1")).getText();
		if(actualHeader.equals("Not Found")) {
			System.out.println("True");
		}else {
			System.out.println("Something is wrong");
		}
		driver.navigate().back();
		
		Sleep.sleep(2);
		driver.quit();
	}

}
