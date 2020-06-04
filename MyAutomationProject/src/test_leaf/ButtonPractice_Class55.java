package test_leaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.Driver;
import utilities.Sleep;

/**
 * 05.06.2020
 * @author Eagle
 *
 */
public class ButtonPractice_Class55 {
	
	public static void main(String[] args) {
		WebDriver driver = Driver.getDriver("chrome");
		driver.get("http://testleaf.herokuapp.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Button")).click();
//		String actualHeader = driver.findElement(By.tagName("h1")).getText();
//		if(actualHeader.equals("Bond with Buttons")) {
//			System.out.println("Header is true");
//		}else {
//			System.out.println("Header is false");
//		}
//		System.out.println(actualHeader);
//		driver.findElement(By.id("home")).click();
//		driver.findElement(By.linkText("Button")).click();
//		int x = driver.findElement(By.id("position")).getLocation().getX();
//		int y = driver.findElement(By.id("position")).getLocation().getY();
//		System.out.println("X is: " + x + ", Y is: " + y);
		String color = driver.findElement(By.id("color")).getAttribute("style");
		String color2 = driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println(color);
		System.out.println(color2);
		int height = driver.findElement(By.id("size")).getSize().getHeight();
		int width = driver.findElement(By.id("size")).getSize().getWidth();
		System.out.println("Height is: " + height + ", width is: " + width);
		
		Sleep.sleep(2);
		driver.quit();
		
	}

}
