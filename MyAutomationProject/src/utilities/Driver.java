package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

	public static WebDriver getDriver(String browserType) {

		WebDriver driver = null;

//		if (browserType == "chrome") {
//			driver = getChromeDriver();
//		} else if (browserType == "firefox") {
//			driver = getFireFoxDriver();
//		} else {
//			System.out.println(browserType + " is invalid browser type");
//		}
//		return driver;
		switch(browserType) {
		case "chrome":
			driver = getChromeDriver();
			break;
		case "firefox":
			driver = getFireFoxDriver();
			break;
			
		default: System.out.println(browserType  + " is invalid");
			break;
		}
		return driver;
	}

	private static ChromeDriver getChromeDriver() {
		WebDriverManager.chromedriver().setup();
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\Eagle\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		return new ChromeDriver();
	}

	private static FirefoxDriver getFireFoxDriver() {
//		WebDriverManager.firefoxdriver().setup();
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Eagle\\WebDrivers\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		return new FirefoxDriver();
	}
}
