package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn {

	public static final String URL = "https://petstore.octoperf.com/actions/Account.action?signonForm=";
	public static final String URL_AFTER_SIGNIN = "https://petstore.octoperf.com/actions/Catalog.action";

	private static final String SIGN_IN_XPATH = "//a[contains(text(),'Sign In')]";
	private static final String SIGN_OUT_XPATH = "//a[contains(text(),'Sign Out')]";
	private static final String SIGN_IN_USERNAME_XPATH = "//input[@name='username']";
	private static final String SIGN_IN_PASSWORD_XPATH = "//input[@name='password']";
	private static final String REGISTER_BUTTON_XPATH = "//a[contains(text(),'Register Now!')]";

	public static WebElement getSignIn(WebDriver driver) {
		return driver.findElement(By.xpath(SIGN_IN_XPATH));
	}

	public static void clickSignIn(WebDriver driver) {
		getSignIn(driver).click();
	}

	/// METODA za SignInUsername
	public static WebElement getSignInUsername(WebDriver driver) {
		return driver.findElement(By.xpath(SIGN_IN_USERNAME_XPATH));
	}

	public static void clickSignInUsername(WebDriver driver) {
		getSignInUsername(driver).click();
	}

	public static void inputSignInUsername(WebDriver driver, String data) {
		getSignInUsername(driver).sendKeys(data);
	}

	/// METODA za SignInPassword
	public static WebElement getSignInPassword(WebDriver driver) {
		return driver.findElement(By.xpath(SIGN_IN_PASSWORD_XPATH));
	}

	public static void clickSignInPassword(WebDriver driver) {
		getSignInPassword(driver).click();
	}

	public static void inputSignInPassword(WebDriver driver, String data) {
		getSignInPassword(driver).sendKeys(data);
	}

	/// METODA za SignOut
	public static WebElement getSignOutPassword(WebDriver driver) {
		return driver.findElement(By.xpath(SIGN_OUT_XPATH));
	}

	public static void clickSignOutPassword(WebDriver driver) {
		getSignInPassword(driver).click();
	}

	public static void inputSignOutPassword(WebDriver driver, String data) {
		getSignInPassword(driver).sendKeys(data);
	}

	public static WebElement getRegisterButton(WebDriver driver) {
		return driver.findElement(By.xpath(REGISTER_BUTTON_XPATH));
	}

	public static void clickRegisterButton(WebDriver driver) {
		getRegisterButton(driver).click();
	}

}
