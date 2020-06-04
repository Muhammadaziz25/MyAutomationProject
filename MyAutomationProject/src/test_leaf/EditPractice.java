package test_leaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.Sleep;

import static utilities.Driver.*;

public class EditPractice {
	
	public static void main(String[] args) {
		
		WebDriver driver;
		driver = getDriver("firefox");
		
		driver.get("http://testleaf.herokuapp.com/home.html");
		driver.findElement(By.tagName("h5")).click();
		String actualText = driver.findElement(By.tagName("h1")).getText();
		String expectedText = "Work with Edit Fields";
		if(actualText.equals(expectedText)) {
			System.out.println("Validation of text pass");
		} else {
			System.out.println("Validation of text fail");
		}
		
		driver.findElement(By.id("email")).sendKeys("something@gmail.com");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Appending text");
		String getValue = driver.findElement(By.name("username")).getAttribute("value");
		System.out.println(getValue);
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
		boolean isDisable = !driver.findElement(By.cssSelector("[disabled='true']")).isEnabled();
		System.out.println(isDisable);
		
		
		Sleep.sleep(2);
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
//		WebDriver driver;
//		
//	    driver = Driver.getDriver();
//	    driver.navigate().to("http://testleaf.herokuapp.com/");
//	    driver.findElement(By.xpath("(//a)[2]")).click();
//	    
//	    String actualHeader = driver.findElement(By.tagName("h1")).getText();
//	    String expectedHeader = "Work with Edit Fields";
//	    if(actualHeader.equals(expectedHeader)) {
//	    	System.out.println("Validation: Pass");
//	    }else {
//	    	System.out.println("Validation: Fail");
//	    }
//	    
//	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc123@gmail.com");
//	    driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Append");
//	    String value = driver.findElement(By.name("username")).getAttribute("value");
//	    System.out.println(value);
//	    driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
//	    
//	   boolean isDisabled =  !driver.findElement(By.cssSelector("[disabled='true']")).isEnabled();
//	   System.out.println(isDisabled);
//	    
//	    WarmUp.sleep(2000);
//	    driver.quit();
	}

}
