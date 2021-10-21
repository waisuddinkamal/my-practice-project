package basic;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ClassPracticeFive {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.get("http://tek-school.com/retail/index.php?route=common/home");
		Actions action = new Actions(driver);
		WebElement lapTopsAndNoteBook = driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']"));
		action.click(lapTopsAndNoteBook).build().perform();
		WebElement showAllLapTop = driver.findElement(By.xpath("//a[contains(text(),'Show All Laptops & Notebooks')]"));
		action.doubleClick(showAllLapTop).build().perform();
		WebElement shortBy = driver.findElement(By.xpath("//select[@id='input-sort']"));
		//shortBy.click();
		Select select = new Select(shortBy);
		select.selectByVisibleText("Name (Z - A)");
		driver.navigate().to("https://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		WebElement appStore = driver.findElement(By.xpath("//p[text()='App Store']"));
		appStore.click();
		Set<String> appStoreChild = driver.getWindowHandles();
		Iterator<String> iterator = appStoreChild.iterator();
		String childWindow = iterator.next();
		String parenWindow = iterator.next();
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle()+"this is child title");
		driver.close();
		//driver.switchTo().window(parenWindow);
		WebElement search =driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']"));
		search.click();
		driver.switchTo().alert().accept();
		
		
		
			
			
		}

	}


