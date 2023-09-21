package wmsautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Expedia {

	public static void main(String[] args) throws Exception {

			System.setProperty("webdriver.chrome.driver",
					"//Users//paraggaurav//Downloads//Software//chromedriver-mac-arm64//chromedriver");

			WebDriver driver = new ChromeDriver();
			driver.get("https://www.expedia.com/");
			Thread.sleep(2000);
			driver.manage().window().maximize();

	}

}