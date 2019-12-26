package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Edit {
	public static final String URL = "https://petstore.octoperf.com/actions/Account.action?newAccountForm=";
	public static final String URL_AFTER_EDIT = "https://petstore.octoperf.com/actions/Account.action";

	public static final String USER_ID_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]";
	public static final String NEW_PASSWORD_XPATH = "//input[@name='password']";
	public static final String REPEAT_PASSWORD_XPATH = "//input[@name='repeatedPassword']";
	public static final String FIRST_NAME_XPATH = "//input[@name='account.firstName']";
	public static final String LAST_NAME_XPATH = "//input[@name='account.lastName']";
	public static final String EMAIL_XPATH = "//input[@name='account.email']";
	public static final String PHONE_XPATH = "//input[@name='account.phone']";
	public static final String ADDRESS1_XPATH = "//input[@name='account.address1']";
	public static final String ADDRESS2_XPATH = "//input[@name='account.address2']";
	public static final String CITY_XPATH = "//input[@name='account.city']";
	public static final String STATE_XPATH = "//input[@name='account.state']";
	public static final String ZIP_XPATH = "//input[@name='account.zip']";
	public static final String COUNTRY_XPATH = "//input[@name='account.country']";
	public static final String LANGUAGE_XPATH = "//select[@name='account.languagePreference']";
	public static final String FAV_CATEGORY_XPATH = "//select[@name='account.favouriteCategoryId']";
	public static final String ENABLE_LIST_XPATH = "//input[@name='account.listOption']";
	public static final String ENABLE_BANNER_XPATH = "//input[@name='account.bannerOption']";
	public static final String SAVE_ACCOUNT_XPATH = "//input[@name='newAccount']";

	/// 1.USER ID
	public static WebElement getUserID(WebDriver driver) {
		return driver.findElement(By.xpath(USER_ID_XPATH));
	}

	public static void clickUserID(WebDriver driver) {
		getUserID(driver).click();
	}

	public static void deleteUserID(WebDriver driver) {
		getUserID(driver).clear();
	}

	public static void inputUserID(WebDriver driver, String data) {
		getUserID(driver).sendKeys(data);

	}

	/// 2.NEW PASSWORD
	public static WebElement getNewPassword(WebDriver driver) {
		return driver.findElement(By.xpath(NEW_PASSWORD_XPATH));
	}

	public static void clickNewPassword(WebDriver driver) {
		getNewPassword(driver).click();
	}

	public static void deleteNewPassword(WebDriver driver) {
		getNewPassword(driver).clear();
	}

	public static void inputNewPassword(WebDriver driver, String data) {
		getNewPassword(driver).sendKeys(data);
	}

	/// 3.REPEAT PASSWORD
	public static WebElement getRepeatPassword(WebDriver driver) {
		return driver.findElement(By.xpath(REPEAT_PASSWORD_XPATH));
	}

	public static void clickRepeatPassword(WebDriver driver) {
		getRepeatPassword(driver).click();
	}

	public static void deleteRepeatPassword(WebDriver driver) {
		getRepeatPassword(driver).clear();
	}

	public static void inputRepeatPassword(WebDriver driver, String data) {
		getRepeatPassword(driver).sendKeys(data);
	}

	/// 4.FIRST NAME
	public static WebElement getFirstName(WebDriver driver) {
		return driver.findElement(By.xpath(FIRST_NAME_XPATH));
	}

	public static void clickFirstName(WebDriver driver) {
		getFirstName(driver).click();
	}

	public static void deleteFirstName(WebDriver driver) {
		getFirstName(driver).clear();
	}

	public static void inputFirstName(WebDriver driver, String data) {
		getFirstName(driver).sendKeys(data);
	}

	/// 5.LAST NAME
	public static WebElement getLastName(WebDriver driver) {
		return driver.findElement(By.xpath(LAST_NAME_XPATH));
	}

	public static void clickLastName(WebDriver driver) {
		getLastName(driver).click();
	}

	public static void deleteLastName(WebDriver driver) {
		getLastName(driver).clear();
	}

	public static void inputLastName(WebDriver driver, String data) {
		getLastName(driver).sendKeys(data);
	}

	/// 6.EMAIL
	public static WebElement getEmail(WebDriver driver) {
		return driver.findElement(By.xpath(EMAIL_XPATH));
	}

	public static void clickEmail(WebDriver driver) {
		getEmail(driver).click();
	}

	public static void deleteEmail(WebDriver driver) {
		getEmail(driver).clear();
	}

	public static void inputEmail(WebDriver driver, String data) {
		getEmail(driver).sendKeys(data);
	}

	/// 7.PHONE
	public static WebElement getPhone(WebDriver driver) {
		return driver.findElement(By.xpath(PHONE_XPATH));
	}

	public static void clickPhone(WebDriver driver) {
		getPhone(driver).click();
	}

	public static void deletePhone(WebDriver driver) {
		getPhone(driver).clear();
	}

	public static void inputPhone(WebDriver driver, String data) {
		getPhone(driver).sendKeys(data);
	}

	/// 8. ADDRESS1
	public static WebElement getAddress1(WebDriver driver) {
		return driver.findElement(By.xpath(ADDRESS1_XPATH));
	}

	public static void clickAddress1(WebDriver driver) {
		getAddress1(driver).click();
	}

	public static void deleteAddress1(WebDriver driver) {
		getAddress1(driver).clear();
	}

	public static void inputAddress1(WebDriver driver, String data) {
		getAddress1(driver).sendKeys(data);
	}

	/// 9. ADDRESS2
	public static WebElement getAddress2(WebDriver driver) {
		return driver.findElement(By.xpath(ADDRESS2_XPATH));
	}

	public static void clickAddress2(WebDriver driver) {
		getAddress2(driver).click();
	}

	public static void deleteAddress2(WebDriver driver) {
		getAddress2(driver).clear();
	}

	public static void inputAddress2(WebDriver driver, String data) {
		getAddress2(driver).sendKeys(data);
	}

	/// 10.CITY
	public static WebElement getCity(WebDriver driver) {
		return driver.findElement(By.xpath(CITY_XPATH));
	}

	public static void clickCity(WebDriver driver) {
		getCity(driver).click();
	}

	public static void deleteCity(WebDriver driver) {
		getCity(driver).clear();
	}

	public static void inputCity(WebDriver driver, String data) {
		getCity(driver).sendKeys(data);
	}

	/// 11.STATE
	public static WebElement getState(WebDriver driver) {
		return driver.findElement(By.xpath(STATE_XPATH));
	}

	public static void clickState(WebDriver driver) {
		getState(driver).click();
	}

	public static void deleteState(WebDriver driver) {
		getState(driver).clear();
	}

	public static void inputState(WebDriver driver, String data) {
		getState(driver).sendKeys(data);
	}

	/// 12. ZIP
	public static WebElement getZip(WebDriver driver) {
		return driver.findElement(By.xpath(ZIP_XPATH));
	}

	public static void clickZip(WebDriver driver) {
		getZip(driver).click();
	}

	public static void deleteZip(WebDriver driver) {
		getZip(driver).clear();
	}

	public static void inputZip(WebDriver driver, String data) {
		getZip(driver).sendKeys(data);
	}

	/// 13.COUNTRY
	public static WebElement getCountry(WebDriver driver) {
		return driver.findElement(By.xpath(COUNTRY_XPATH));
	}

	public static void clickCountry(WebDriver driver) {
		getCountry(driver).click();
	}

	public static void deleteCountry(WebDriver driver) {
		getCountry(driver).clear();
	}

	public static void inputCountry(WebDriver driver, String data) {
		getCountry(driver).sendKeys(data);
	}

	/// 14.LANGUAGE
	public static Select getLanguage(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(LANGUAGE_XPATH)));
	}

	public static void inputLanguage(WebDriver driver, String data) {
		getLanguage(driver).selectByVisibleText(data);
	}

	/// 15.FAVOURITE CATEGORY
	public static Select getFavCategory(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(FAV_CATEGORY_XPATH)));
	}

	public static void inputFavCategory(WebDriver driver, String data) {
		getFavCategory(driver).selectByVisibleText(data);
	}

	/// 16.ENABLE LIST
	public static WebElement getEnableList(WebDriver driver) {
		return driver.findElement(By.xpath(ENABLE_LIST_XPATH));
	}

	public static void clickEnableList(WebDriver driver) {
		getEnableList(driver).click();
	}

	/// 17.ENABLE BANNER
	public static WebElement getEnableBanner(WebDriver driver) {
		return driver.findElement(By.xpath(ENABLE_BANNER_XPATH));
	}

	public static void clickEnableBanner(WebDriver driver) {
		getEnableBanner(driver).click();
	}

	/// 18.SAVE ACCOUNT
	public static WebElement getSaveAccount(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_ACCOUNT_XPATH));
	}

	public static void clickSaveAccount(WebDriver driver) {
		getSaveAccount(driver).click();
	}
}
