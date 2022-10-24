package com.Browsers.Util;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AllBrowsers {
	
	public static WebDriver driver;
	public String Weburl = "http://automationpractice.com/index.php";

	
	public static WebDriver startBrowser(String browserName, String Weburl) {

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.firefox.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equals("IE")) {
			System.setProperty("webdriver.InternetExplorer.driver", "./Drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else {
			System.out.println("Browser is not found");
		}

		driver.manage().window().maximize();
		driver.get(Weburl);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		return driver;
	}
	
	public static void quitBrowser() {
		driver.quit();
	}


}
