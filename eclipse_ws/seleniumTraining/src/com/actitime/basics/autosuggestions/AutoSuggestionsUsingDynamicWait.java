package com.actitime.basics.autosuggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestionsUsingDynamicWait {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("=== Printing AutoSuggestions ===");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.google.com/"); // 5 mins 
		WebElement searchBox = driver.findElement(By.name("q")); // .sendKeys("Intellipaat");
		searchBox.sendKeys("Intelliipaat");
		
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//ul[@class='erkvQe']"))));
		
		
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//ul[li[@class='sbct']]/li"));
		
		System.out.println("Total Suggestions displayed by Application : " + autoSuggestions.size());
		
		for (WebElement suggestion : autoSuggestions) 
		{
			System.out.println(suggestion.getText());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
