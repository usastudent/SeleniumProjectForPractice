package tek.selenium.testing;

import java.awt.Desktop.Action;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingSeleniumtesting {

	public static void main(String[] args)  {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://ksrtc.in/oprs-web/");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	WebElement crm = driver.findElement(By.xpath("//p[text()='CRM']"));
	timeWait();
	System.out.println(driver.getTitle()+"before clicking on CRM");
	crm.click();
	
	
	Set<String> handles = driver.getWindowHandles();
	
	Iterator <String> iterator = handles.iterator();
	String parentWindowID = iterator.next();
	String childWindowID = iterator.next();
	System.out.println(parentWindowID + " parent");
	System.out.println(childWindowID+ " child");
	
	driver.switchTo().window(childWindowID);
	System.out.println(driver.getTitle()+"after clicking on CRM");
	
	driver.close();
	driver.switchTo().window(parentWindowID);
	System.out.println(driver.getTitle()+" back to parent window");
	
	WebElement search = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']"));
	search.click();
	
	
	
	
	
	
		
	}
	public static void timeWait() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}














