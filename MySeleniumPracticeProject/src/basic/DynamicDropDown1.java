package basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.southwest.com/?src=SRCH_go_cmp-1616146491_adg-78852916944_ad-393541731773_kwd-37098060_dev-c_ext-_prd-");
		WebElement depart = driver.findElement(By.id("LandingAirBookingSearchForm_originationAirportCode"));
		depart.clear();
		Thread.sleep(2000);
		depart.sendKeys("wash");
		List<WebElement>departure =driver.findElements(By.xpath("//input[@value='GEG']"));
		for(WebElement dep:departure) {
			if(dep.getText().contains("West Palm Beach, FL - PBI"));
			dep.click();
			break;
			
		}

	}

}
