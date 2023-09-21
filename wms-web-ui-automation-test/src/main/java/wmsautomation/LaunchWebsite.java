package wmsautomation;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class LaunchWebsite {
	
	
 @Test
	public  void testOss() throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"//Users//paraggaurav//Downloads//Software//chromedriver_mac_arm64 2//chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://oss-web.sayurbox.tech/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Login login = new Login();
		login.loginToWebsite(driver);
		
		PoCreation po = new PoCreation();
		po.poCreation(driver);
		
		
		

	
		

	}

}
