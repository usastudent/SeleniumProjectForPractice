package tek.selenium.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class runnerTest {

	public static void main(String[] args)  {
		
		TestingSeleniumtesting mobileApp = new TestingSeleniumtesting();
		mobileApp.setupDriver("http://tek-insurance.azurewebsites.net");
	//	mobileApp.sendtextWaitExplicityM(By.name("username"), "supervisor");
		//mobileApp.sendtextWaitExplicityM(By.name("password"), "tek_supervisor");
		
		
		
		
		
		mobileApp.clickFillField(By.name("username"), "supervisor");
		mobileApp.clickFillField(By.name("password"), "tek_supervisor");
		mobileApp.loginButtonWaitField(By.cssSelector("button#loginButton"));
		
	}

}
