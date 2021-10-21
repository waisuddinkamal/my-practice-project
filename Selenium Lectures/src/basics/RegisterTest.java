package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tek-school.com/retail/index.php?route=common/home");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		WebElement myAccount = driver.findElement(By.xpath("//span[text()='My Account']"));
		System.out.println(myAccount.isDisplayed());
		myAccount.click();
		WebElement register = driver.findElement(By.xpath("//a[text()='Register']"));
		register.click();
		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement lastName = driver.findElement(By.xpath(" //input[@name='lastname']"));
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		WebElement telephone = driver.findElement(By.xpath("//input[@name='telephone']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		WebElement confirmPassword = driver.findElement(By.xpath("//input[@name='confirm']"));
		WebElement yesButton = driver.findElement(By.xpath("//input[@value='1'and @name='newsletter']"));
		WebElement noNutton = driver.findElement(By.xpath("//input[@name='newsletter'and @value='0']"));
		WebElement privacy = driver.findElement(By.xpath("//input[@name='agree']"));
		WebElement continueButton = driver.findElement(By.xpath("//input[@type='submit']"));
		firstName.sendKeys("wais");
		lastName.sendKeys("kamal");
		email.sendKeys("waiskamal3@gmail.com");
		telephone.sendKeys("5303295014");
		password.sendKeys("kamal123");
		confirmPassword.sendKeys("kamal123");
		if(!yesButton.isSelected()) {
			yesButton.click();
		}
		if(privacy.isDisplayed()) {
			privacy.click();
		}
		Thread.sleep(500);
		continueButton.click();
		WebElement confirmationMessage = driver.findElement(By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]"));
		String sucessMessage= confirmationMessage.getText();
		String expectedMessage = "Your Account Has Been Created!";
		if(sucessMessage.equals(expectedMessage)) {
			System.out.println("Register test passed");
			System.out.println(sucessMessage);
			System.out.println(expectedMessage);
		}
		else {
			System.out.println("Register test faild");
		}
		driver.close();
		
	}

}
