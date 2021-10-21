package DropDownHandlingPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDwonPractice {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aa.com/homePage.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		WebElement from = driver.findElement(By.id("reservationFlightSearchForm.originAirport"));
		from.clear();
		from.sendKeys("new york");
		List<WebElement> depart = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/a"));
		for (WebElement deporture : depart) {
			if (deporture.getText().contains("BGM")) {
				deporture.click();
				break;
			}
		}

			WebElement to = driver.findElement(By.id("reservationFlightSearchForm.destinationAirport"));
			to.clear();
			to.sendKeys("wash");
			List<WebElement> arival = driver.findElements(By.xpath("//ul[@id='ui-id-2']/li/a"));
			for (WebElement ariv : arival) {
				if (ariv.getText().equals("SEA - Seattle Tacoma Intl, WA")) {
				ariv.click();
				break;
				}
			}
			
			WebElement NumberOfPassengers = driver.findElement(By.id("flightSearchForm.adultOrSeniorPassengerCount"));
			Select select = new Select(NumberOfPassengers);
			select.selectByValue("5");
			driver.close();
		}

	}


