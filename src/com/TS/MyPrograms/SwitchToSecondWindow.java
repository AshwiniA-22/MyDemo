package com.TS.MyPrograms;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class SwitchToSecondWindow {

	public static void handlingWindow() {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.testingshastra.com/multiple-window-handling-assignment/");
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(60));
		wait.pollingEvery(Duration.ofMillis(500));
		wait.ignoring(NoSuchElementException.class, ElementClickInterceptedException.class);
		wait.withMessage("oho fail ho gya");

		driver.manage().window().maximize();

		WebElement button = driver.findElement(By.xpath("//button[@class=\"pum-close popmake-close\"]"));
		wait.until(ExpectedConditions.elementToBeClickable(button)).click();

		wait.until(ExpectedConditions.invisibilityOf(button));

		driver.findElement(By.xpath("//button[@onclick=\"myFunction()\"]")).click();

		String parentwindow = driver.getWindowHandle();
		Set<String> allhandles = driver.getWindowHandles();

		for (String handle : allhandles) {
			driver.switchTo().window(handle);
			if (driver.getTitle().contains("Second")) {

				driver.findElement(By.xpath("//button[@onclick=\"clickMe()\"]")).click();
				String msg = driver.findElement(By.xpath("//p[@id=\"demo\"]")).getText();
				System.out.println(msg);

				break;
			}

		}

	}

	public static void main(String[] args) {
		handlingWindow();
	}

}
