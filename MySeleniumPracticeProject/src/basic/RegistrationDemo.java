package basic;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationDemo {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leapwork.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement startTrial = driver
				.findElement(By.xpath("//a[@id='cta_button_2912187_4b03a48a-7e03-4d6d-b71f-dd2db17168b6']"));
		startTrial.click();
		Thread.sleep(1000);
		WebElement firstName = driver
				.findElement(By.xpath("//input[@id='firstname-51ffe277-2bbe-43b5-b3d5-c84691ace7da_1947']"));
		firstName.sendKeys("Emran");
		Thread.sleep(1000);
		WebElement lastName = driver
				.findElement(By.xpath("//input[@id='lastname-51ffe277-2bbe-43b5-b3d5-c84691ace7da_1947']"));
		lastName.sendKeys("kamal");
		Thread.sleep(1000);
		WebElement workEamil = driver
				.findElement(By.xpath("//input[@id='email-51ffe277-2bbe-43b5-b3d5-c84691ace7da_1947']"));
		workEamil.sendKeys("emrankamal@gmail.com");
		Thread.sleep(1000);
		WebElement phoneCode = driver.findElement(By.id("phone_ext-51ffe277-2bbe-43b5-b3d5-c84691ace7da_1947"));
		
	}
}
