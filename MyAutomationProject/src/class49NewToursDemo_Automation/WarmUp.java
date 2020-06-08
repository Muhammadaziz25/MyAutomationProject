package class49NewToursDemo_Automation;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/**
 * 10.05.2020
 */
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WarmUp {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver drv ;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first name");
		String fName = sc.nextLine();
		System.out.println("Please enter last name");
		String lName = sc.nextLine();
		System.out.println("Please enter phone number");
		String phoneNumber = sc.nextLine();
		String email = generateEmail(fName, lName);
		
		System.out.println("Please enter address1");
		String address1 = sc.nextLine();
		System.out.println("Please enter address2");
		String address2 = sc.nextLine();
		System.out.println("Please enter city");
		String city = sc.nextLine();
		System.out.println("Please enter state");
		String state = sc.nextLine();
		System.out.println("Please enter postalCode");
		String postalCode = sc.nextLine();
//		city
		
		
		//<a href="mercuryregister.php">REGISTER</a> 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Eagle\\WebDrivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys(fName);
		driver.findElement(By.name("lastName")).sendKeys(lName);
		driver.findElement(By.name("phone")).sendKeys(phoneNumber);
		driver.findElement(By.id("userName")).sendKeys(email);
		
		driver.findElement(By.name("address1")).sendKeys(address1);
		driver.findElement(By.name("address2")).sendKeys(address2);
		driver.findElement(By.name("city")).sendKeys(city);
		driver.findElement(By.name("state")).sendKeys(state);
		driver.findElement(By.name("postalCode")).sendKeys(postalCode);
		WebElement countryDropDown = driver.findElement(By.name("country"));
		Select select = new Select(countryDropDown);
//		select.selectByValue("218");
		select.selectByVisibleText("TURKEY ");
		
		
		String userName = generateUserName(fName, lName);
		String password = generatePassword(fName, lName);
		driver.findElement(By.name("email")).sendKeys(userName);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("confirmPassword")).sendKeys(password);
		driver.findElement(By.name("register")).click();
		Thread.sleep(5000);
		
		String actualConfirmationText = driver.findElement(By.tagName("b")).getText();// getText method returns String
		String expectedConfirmationText = "Dear " + fName + " " + lName + ",";
		
		if(actualConfirmationText.equals(expectedConfirmationText)) {
			System.out.println("You are registered at Mercury");
		} else {
			System.out.println("Something went wrong");
		}
		
		String actualNote = driver.findElement(By.xpath("(//b)[2]")).getText();
		String expectedNote = "Note: Your user name is " + userName + ".";
		if(actualNote.equals(expectedNote)) {
			System.out.println("You are successful");
		} else {
			System.out.println("Something is wrong");
		}
				
		Thread.sleep(5000);
		
//		driver.quit();
	}
	
	private static String generateEmail( String fName, String lName) {
		StringBuilder sb = new StringBuilder();
		sb.append(fName).append(".").append(lName).append("@gmail.com");
		return sb.toString().toLowerCase();
	}
	
	private static String generateUserName( String fName, String lName) {
		StringBuilder sb = new StringBuilder();
		sb.append(fName).append(".").append(lName);
		return sb.toString().toLowerCase();
	}
	
	private static String generatePassword ( String fName, String lName) {
		StringBuilder sb = new StringBuilder();
		sb.append(fName).append(".").append(lName).append("123");
		return sb.toString();
	}
	

}
