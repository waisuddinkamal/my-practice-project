package classPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassPractice {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("http://tek-school.com/retail/");
		
		WebElement cameras = driver.findElement(By.xpath("//a[text()='Cameras']"));
		Actions action = new Actions(driver);
		action.moveToElement(cameras).build().perform();
		action.doubleClick().build().perform();
		action.contextClick().build().perform();
		
		driver.navigate().to("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		action.dragAndDrop(drag, drop).build().perform();
		driver.close();
		
	}

}
