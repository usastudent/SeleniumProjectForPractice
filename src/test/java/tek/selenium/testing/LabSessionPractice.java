package tek.selenium.testing;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LabSessionPractice {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * Step 1: In Selenium Project create a new Java class and Name it LabSessionPractice
Step 2: make sure you have main method
Step 3: create a refrence variable to WebDriver and assign object of Chrome Driver to open chrome browser
step 4: navigate to this url https://ksrtc.in/oprs-web/
step 5: click on CRM link on top of the page

Note: make sure you have browser opened in maximize scale
make sure you have proper wait for pageload and timeout
make sure you use Webdriver Manager to setup chromeDriver

		 */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.aa.com/homePage.do");
		driver.findElement(By.xpath("//input[@name='originAirport']")).sendKeys("LAX");
		driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.destinationAirport']")).sendKeys("JFK");
		WebElement ticketOne = driver.findElement(By.xpath("//p[text()='CRM']"));
		Thread.sleep(5000);
		System.out.println(driver.getTitle()+"before clicking on crm");
		crm.click();
		System.out.println(driver.getTitle()+"After clicking on crm");
		
		Set<String> handles = driver.getWindowHandles();
	// iterator is the similar to loop, it is interface that you can loop through collection
		// for loop starts from zero until it reach to the limit but the iterator first check-
		// the index and then it moves
		Iterator <String> iterator = handles.iterator(); // import form java.util
		String parentWindowID = iterator.next();
		String childWindowID = iterator.next();
		System.out.println(parentWindowID+" Parent");
		System.out.println(childWindowID+" child");
		
		driver.switchTo().window(childWindowID);
		System.out.println(driver.getTitle()+"before clicking on crm");
		
		
		
		
		
		

	}

}
