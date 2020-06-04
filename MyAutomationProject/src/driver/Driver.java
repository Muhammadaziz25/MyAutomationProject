package driver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	
	public static ChromeDriver getDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Eagle\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		return new ChromeDriver();
	}

}
