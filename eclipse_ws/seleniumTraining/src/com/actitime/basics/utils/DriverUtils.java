package com.actitime.basics.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;



/*
 This is a Class with Reusable functions 
 with respect to Driver
 */
public class DriverUtils {
	// i'm declaring a global variable
	public static WebDriver driver = null;

	/***
	 * getMyDriver returns a Chrome driver object by default and driver object is
	 * configured with implictwait of 30 sec
	 * 
	 * @author Aravind
	 * 
	 * @return - chromedriver object is returned
	 */
	public static WebDriver getMyDriver() {
		System.out.println("--- Creating Driver Object ---");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}

	public static WebDriver getMyDriver(String browserType) {
		System.out.println("--- Creating driver Object for --- " + browserType);

		switch (browserType) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "ff":
			System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
			FirefoxOptions options  = new FirefoxOptions();
			options.addArguments("--disable-infobars");
			driver = new FirefoxDriver(options);
			break;
		case "edge":
			System.setProperty("webdriver.edge.driver", "drivers\\MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Please contact FrameWork Developers!!!! to support " + browserType);
			driver = null;
			
			break;
		}
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;

	}

	/***
	 * @author Aravind
	 * @return - no return type To Launch the applciaton
	 */
	public static void launchApp() {
		System.out.println("--- Launching Actitime Application ---");
		driver.get("http://localhost/login.do");
		validateTitle("actiTIME - Login");
		System.out.println("--- Applcition Launched Successfully ---");
	}

	/***
	 * @author Aravind
	 * @return - no return type
	 * @param - url => url of the application to be launched To Launch the
	 *          application
	 */
	public static void launchApp(String url) {
		System.out.println("--- Launching  Application ---" + url);
		driver.get(url);
		System.out.println("--- Applcition Launched Successfully ---");
	}

	/***
	 * @author Aravind
	 * @param typeOfIdentifier =>
	 *                         id,name,classname,tagName,linkText,partialLinkText,
	 *                         css,xpath
	 * @param value            => value corresponding to typeOfIdentifier
	 */
	public static WebElement getElement(String typeOfIdentifier, String value) {
		System.out.println("--- finding the element ---");
		WebElement ele = null;
		boolean flag = false;
		switch (typeOfIdentifier) {
		case "id":
			ele = driver.findElement(By.id(value));
			break;

		case "name":
			ele = driver.findElement(By.name(value));
			break;

		case "classname":
			ele = driver.findElement(By.className(value));
			break;

		case "tagname":
			ele = driver.findElement(By.tagName(value));
			break;

		case "linktext":
			ele = driver.findElement(By.linkText(value));
			break;

		case "partiallinktext":
			ele = driver.findElement(By.partialLinkText(value));
			break;

		case "css":
			ele = driver.findElement(By.cssSelector(value));
			break;

		case "xpath":
			ele = driver.findElement(By.xpath(value));
			break;

		default:
			System.out.println("Please check the type of identifier passed " + typeOfIdentifier);
			break;
		}

		if (ele.isDisplayed()) {
			System.out.println("Element is displayed ");
			if (ele.isEnabled()) {
				System.out.println("Element is enabled ");
				flag = true;
			} else {
				System.out.println("Element is not enabled sendeing null element ");

			}
		} else {
			System.out.println("Elment is not displayed so sending null and terminating the execution");

		}

		if (flag) {
			return ele;
		} else {
			return null;
		}

	}

	public static void click(String typeOfIdentifier, String value) {
		System.out.println("--- clicking on Element ---");
		getElement(typeOfIdentifier, value).click();
	}

	public static void type(String typeOfIdentifier, String value, String textToType) {
		System.out.println("--- typing on Element --- " + textToType);
		getElement(typeOfIdentifier, value).sendKeys(textToType);
	}

	public static void selectCheckBox(String typeOfIdentifier, String value) {
		System.out.println("--- selecting CheckBox -----");
		WebElement ele = getElement(typeOfIdentifier, value);
		if (ele.isSelected()) {
			System.out.println("Check box is already Selected!!!!!");
		} else {
			System.out.println("Clicking on Checkbox");
			ele.click();
		}

	}

	public static void sleep(long ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void validateTitle(String expectedTitle) {
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle,expectedTitle);

	}

}
