package com.actitime.basics.autosuggestions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

public class FluentWaitDemo {

	
	public static <T> void main(String[] args) {
		
		System.out.println("=== Printing Hello Text ===");
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("file:///D:/Intellipaat/Intellipaat_09_Feb/html/tiimeout.html");
		
		driver.findElement(By.tagName("button")).click();
		
		FluentWait<WebElement> wait = new FluentWait<WebElement>(
				driver.findElement(By.id("demo")))
				.withTimeout(Duration.ofMinutes(3))
				.pollingEvery(Duration.ofMillis(20))
				.ignoring(NoSuchElementException.class)
				.ignoring(Exception.class);
		
		Function<WebElement, Boolean> fun = new Function<WebElement, Boolean>() {

			@Override
			public Boolean apply(WebElement ele) {
			
				Boolean flag = false;
				if(ele.getText().trim().equals("Hello"))
				{
					System.out.println("element found!!!!!");
					flag = true;
				}
				else
				{
					System.out.println("Waiting!!!!!");
				}
				
				return flag;
			}
		};
				
		wait.until(fun);	
				
	}
}
