package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println(driver.getTitle());
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
		driver.navigate().to("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.navigate().forward();
		
		

	}

}
