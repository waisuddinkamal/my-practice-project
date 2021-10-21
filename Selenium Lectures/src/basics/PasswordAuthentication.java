package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PasswordAuthentication {

	public static void main(String[] args) {
		// Password and userName Authentication handling.
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		String userName = "admin";
		String password = "admin";

		String url = "http://" + userName + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth";
		System.out.println(url);
		driver.navigate().to(url);
		driver.quit();

	}

}
