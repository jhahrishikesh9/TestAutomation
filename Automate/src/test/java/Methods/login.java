package Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.PO_Login;

public class login extends PO_Login{
	/*
	 * public static void ExplicitWait(WebDriver driver, String by){ WebDriverWait
	 * wait = new WebDriverWait(driver, Duration.ofSeconds(10)); WebElement element
	 * = wait.until(ExpectedConditions.visibilityOfElementLocated(By by)); }
	 */
	public static void validateCorrectURL(WebDriver driver, String url) {
		//this is a test push test testnew
	}
	public static void OpenLink(WebDriver driver) {
		driver.findElement(By.xpath(signUpButton)).click();
	}

}
