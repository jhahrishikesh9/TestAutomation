package Methods;
import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.PO_Login;

public class Login_Methods extends PO_Login{
		public static void validateCorrectURL(WebDriver driver, String url) {
			//this is a test 
			String newUrl = driver.getCurrentUrl();
			System.out.println(newUrl);
			assertEquals("Url Matched Successfully",url, newUrl);
		}
		
		public static void ClickSignUpButton(WebDriver driver) {
			driver.findElement(By.xpath(signUpButton)).click();
		}
		
		public static void enterEmail(WebDriver driver, String mail) {
			driver.findElement(By.xpath((EmailAddress_Login))).sendKeys(mail);;
		}
		
		public static void enterPassword(WebDriver driver, String Pass) {
			driver.findElement(By.xpath(Password_Login)).sendKeys(Pass);
		}
		
		public static void SubmitBtn_Login(WebDriver driver) {
			driver.findElement(By.xpath(Login_Btn)).click();
		}
		
		public static void VerifyLoginSuccessfull(WebDriver driver) {
			driver.findElement(By.xpath(LoginText)).isDisplayed();
		}

	}
