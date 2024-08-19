package com.baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver browser_Launch(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		return driver;

	}

	public static void url_Launch(String url) {

		driver.get(url);

	}

	public static void sendText(WebElement element, String value) {

		element.sendKeys(value);
	}

	public static void click(WebElement element) {

		element.click();
	}

	public static void getText(WebElement element) {

		element.getText();
	}
	
	
	
}
