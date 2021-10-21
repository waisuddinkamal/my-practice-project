package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTestPractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tek-school.com/retail/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		WebElement myAccount = driver.findElement(By.xpath("//span[contains(text(),'My Account')]"));
		System.out.println(myAccount.isDisplayed());
		myAccount.click();
		WebElement register = driver.findElement(By.xpath("//a[contains(text(),'Register')]"));
		register.click();
		WebElement firstName = driver.findElement(By.id("input-firstname"));
		WebElement lastName = driver.findElement(By.id("input-lastname"));
		WebElement eamil = driver.findElement(By.xpath("//input[@id='input-email']"));
		WebElement telephone = driver.findElement(By.xpath("//input[@id='input-telephone']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
		WebElement passwordConfirm = driver.findElement(By.xpath("//input[@id='input-confirm']"));
		WebElement yesButton = driver.findElement(By.xpath("//input[@value='1'and @name='newsletter']"));
		WebElement noButton = driver.findElement(By.xpath("//input[@name='newsletter'and @value='0']"));
		WebElement privacyPolicy = driver.findElement(By.xpath("//input[@name='agree']"));
		WebElement continueButton= driver.findElement(By.xpath("//input[@type='submit']"));
		
		
	}

}
