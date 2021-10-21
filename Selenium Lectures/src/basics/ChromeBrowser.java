package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://tek-school.com/retail/");

		WebElement myAccount = driver.findElement(By.xpath("//a[@title='My Account']"));
		myAccount.click();

		WebElement login = driver.findElement(By.xpath("(//a[text()='Login'])[1]"));
		login.click();

		WebElement emailField = driver.findElement(By.id("input-email"));
		emailField.sendKeys("ahmedkhan12345@yahoo.com");

		WebElement passwordField = driver.findElement(By.id("input-password"));
		passwordField.sendKeys("Anypassword");

		WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
		loginButton.click();
	}

}
