package class53_MercuryAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WarmUp {
	
	public static void main(String[] args){
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Eagle\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
//		driver.navigate().to("http://newtours.demoaut.com/");
		driver.findElement(By.xpath("(//a)[5]")).click();
		sleep(2000);
		
		String actualTitle = driver.getTitle();
		String actualURL = driver.getCurrentUrl();
		
		if(actualTitle.equals("Cruises: Mercury Tours")) {
			System.out.println("Title check: Pass");
		} else {
			System.out.println("Title check: Fail");
		}
		//http://newtours.demoaut.com/mercurycruise.php
		
		if(actualURL.contains("http://newtours.demoaut.com/mercurycruise.php")) {
			System.out.println("Title check: Pass");
		} else {
			System.out.println("Title check: Fail and actual URL is " + actualURL);
		} 
		
		sleep(2000);
		driver.quit();
	}
	
	public static void sleep(int seconds) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
