package com.google;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * 
 * @author Eagle
 *
 */

public class GoogleSearch {

	public static void main(String[] args) {

//		StringBuilder line = new StringBuilder("-");
//		StringBuilder aL = line.append("-");
//		System.out.println(line==aL);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Eagle\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("mercedes.com");
		

	}

}
