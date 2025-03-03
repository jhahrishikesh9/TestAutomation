package RegressionTests;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Methods.Login_Methods;
import Methods.login;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends Login_Methods{
	private WebDriver driver;
	Login_Methods lm = new Login_Methods();
	public void setup() {
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.automationexercise.com/");
	}
	
	@Given("Launch the browser and the website with correct URL")
	public void launch_the_browser_and_the_website_with_correct_url() {
	    setup();
	}

	@Given("Validate the correct website launched successfully")
	public void validate_the_correct_website_launched_successfully() {
	    // Write code here that turns the phrase above into concrete actions
		String url = "https://www.automationexercise.com/";
		lm.validateCorrectURL(driver, url);
	}

	@Given("Click on the Login\\/Signup button successfully")
	public void click_on_the_login_signup_button_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    lm.ClickSignUpButton(driver);
	}

	@When("button is clicked validate the new page opens with option to enter email and password")
	public void button_is_clicked_validate_the_new_page_opens_with_option_to_enter_email_and_password() {
	    // Write code here that turns the phrase above into concrete 
		String url = "https://www.automationexercise.com/login";
		lm.validateCorrectURL(driver, url);
	}

	@When("Enter correct {string} and {string} click on login button")
	public void enter_correct_email_id_and_password_click_on_login_button(String email, String password) {
	    // Write code here that turns the phrase above into concrete actions
		/*
		 * List<Map<String, String>> credentials = dataTable.asMaps(String.class,
		 * String.class); Map<String, String> cred = credentials.get(0);
		 * 
		 * String email = cred.get("email_id"); String password = cred.get("password");
		 */
		enterEmail(driver, email);
		enterPassword(driver, password);
		SubmitBtn_Login(driver);
	}

	@Then("I validate the login is sucessfull and username is reflected on the page successfully")
	public void i_validate_the_login_is_sucessfull_and_username_is_reflected_on_the_page_successfully() {
	    // Write code here that turns the phrase above into concrete actions
		VerifyLoginSuccessfull(driver);
	}
	
	@Then("Exit the browser")
	public void Exit_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
		driver.quit();
	}

}
