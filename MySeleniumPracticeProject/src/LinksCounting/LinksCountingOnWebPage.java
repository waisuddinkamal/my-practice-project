package LinksCounting;


import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksCountingOnWebPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("http://tek-school.com/retail/");
		
		List <WebElement> coutingList = driver.findElements(By.tagName("a"));
		for(int i = 0; i <=coutingList.size()-1;i++) {
			String countLinks = coutingList.get(i).getText();
			System.out.println(countLinks);
		}
			System.out.println(coutingList.size());
			driver.close();

	}

}
