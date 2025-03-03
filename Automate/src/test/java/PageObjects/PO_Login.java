package PageObjects;

public class PO_Login {

	public static String signUpButton = "//*[text()=' Signup / Login']";
	public static String EmailAddress_Login = "//parent::form[@action='/login']//input[@type='email' and @placeholder='Email Address']";
	public static String Password_Login ="//parent::form[@action='/login']//input[@type='password' and @placeholder='Password']";
	public static String Login_Btn = "//parent::form[@action='/login']//button[@type='submit']";
	public static String LoginText = "//*[text()=' Logged in as ']";
}
