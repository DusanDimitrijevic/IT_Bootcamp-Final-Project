
package pageTestsNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.Edit;
import page.objects.PetStoreMenu;
import page.objects.SignIn;
import utility.ExcelUtils;

public class EditTestNG {
	WebDriver driver;
	SoftAssert sa = new SoftAssert();
	String url = PetStoreMenu.URL;
	WebElement tempWE = null;
	String tempS = "";

	@BeforeTest
	public void beforeTests() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dule\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get(url);
		String currUrl = driver.getCurrentUrl();
		if (url.equals(currUrl)) {
			System.out.println("Otvorena je trazena stranica!");
		} else {
			System.out.println("Nije otvorena trazena stranica!");
			System.out.println("Trenutni url je " + currUrl);
		}
	}

	@AfterTest
	public void afterTests() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

	@Test(priority = 1)
	public void signInTestOneUser() throws InterruptedException {
		driver.get(SignIn.URL);
		SignIn.inputSignInUsername(driver, "user123");
		tempWE = SignIn.getSignInUsername(driver);
		sa.assertEquals(tempWE.getAttribute("value"), "user123");
		Thread.sleep(1000);

		SignIn.getSignInPassword(driver).clear();

		SignIn.inputSignInPassword(driver, "pass123");
		tempWE = SignIn.getSignInPassword(driver);
		sa.assertEquals(tempWE.getAttribute("value"), "pass123");

		SignIn.clickSignIn(driver);
		String currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, SignIn.URL_AFTER_SIGNIN);
		sa.assertAll();
	}

	@Test(priority = 2)
	public void EditSignedInUserInfoTest() {
		ExcelUtils.setExcell("UserData.xlsx");
		ExcelUtils.setWorkSheet(0);

		
		String newPassword = ExcelUtils.getDataAt(2, 1);
		String repeatPassword = ExcelUtils.getDataAt(2, 1);

		String firstName = ExcelUtils.getDataAt(2, 2);
		String lastName = ExcelUtils.getDataAt(2, 3);
		String email = ExcelUtils.getDataAt(2, 4);
		String phone = ExcelUtils.getDataAt(2, 5);
		String address1 = ExcelUtils.getDataAt(2, 6);
		String address2 = ExcelUtils.getDataAt(2, 7);
		String city = ExcelUtils.getDataAt(2, 8);
		String state = ExcelUtils.getDataAt(2, 9);
		String zip = ExcelUtils.getDataAt(2, 10);
		String country = ExcelUtils.getDataAt(2, 11);

	
		
		String language = "japanese";
		String favCategory = "FISH";
		

		PetStoreMenu.clickMyAcctBtn(driver);
		sa.assertEquals(driver.getCurrentUrl(), Edit.URL);

		Edit.deleteNewPassword(driver);
		Edit.inputNewPassword(driver, newPassword);
		tempWE = Edit.getNewPassword(driver);
		sa.assertEquals(tempWE.getAttribute("value"), newPassword);

		Edit.deleteRepeatPassword(driver);
		Edit.inputRepeatPassword(driver, repeatPassword);
		tempWE = Edit.getRepeatPassword(driver);
		sa.assertEquals(tempWE.getAttribute("value"), repeatPassword);

		Edit.deleteFirstName(driver);
		Edit.inputFirstName(driver, firstName);
		tempWE = Edit.getFirstName(driver);
		sa.assertEquals(tempWE.getAttribute("value"), firstName);

		Edit.deleteLastName(driver);
		Edit.inputLastName(driver, lastName);
		tempWE = Edit.getLastName(driver);
		sa.assertEquals(tempWE.getAttribute("value"), lastName);

		Edit.deleteEmail(driver);
		Edit.inputEmail(driver, email);
		tempWE = Edit.getEmail(driver);
		sa.assertEquals(tempWE.getAttribute("value"), email);

		Edit.deletePhone(driver);
		Edit.inputPhone(driver, phone);
		tempWE = Edit.getPhone(driver);
		sa.assertEquals(tempWE.getAttribute("value"), phone);

		Edit.deleteAddress1(driver);
		Edit.inputAddress1(driver, address1);
		tempWE = Edit.getAddress1(driver);
		sa.assertEquals(tempWE.getAttribute("value"), address1);

		Edit.deleteAddress2(driver);
		Edit.inputAddress2(driver, address2);
		tempWE = Edit.getAddress2(driver);
		sa.assertEquals(tempWE.getAttribute("value"), address2);

		Edit.deleteCity(driver);
		Edit.inputCity(driver, city);
		tempWE = Edit.getCity(driver);
		sa.assertEquals(tempWE.getAttribute("value"), city);

		Edit.deleteState(driver);
		Edit.inputState(driver, state);
		tempWE = Edit.getState(driver);
		sa.assertEquals(tempWE.getAttribute("value"), state);

		Edit.deleteZip(driver);
		Edit.inputZip(driver, zip);
		tempWE = Edit.getZip(driver);
		sa.assertEquals(tempWE.getAttribute("value"), zip);

		Edit.deleteCountry(driver);
		Edit.inputCountry(driver, country);
		tempWE = Edit.getCountry(driver);
		sa.assertEquals(tempWE.getAttribute("value"), country);

		Edit.inputLanguage(driver, language);
		tempS = Edit.getLanguage(driver).getFirstSelectedOption().getText();
		sa.assertEquals(tempS, language);

		Edit.inputFavCategory(driver, favCategory);
		tempS = Edit.getFavCategory(driver).getFirstSelectedOption().getText();
		sa.assertEquals(tempS, favCategory);

		Edit.clickEnableList(driver);
		tempWE = Edit.getEnableList(driver);
		// sa.assertEquals(tempWE.getAttribute("value").isEmpty(), false);

		tempWE = Edit.getEnableBanner(driver);
		// sa.assertEquals(tempWE.getAttribute("value").isEmpty(), true);

		Edit.clickSaveAccount(driver);
		String currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, Edit.URL_AFTER_EDIT);

		sa.assertAll();
	}

	@Test(priority = 3)
	public void userSignOut() {
		SignIn.clickSignOutPassword(driver);
		String currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, PetStoreMenu.URL);
	}

	@Test(priority = 4)
	public void userSignInAndCheck() {
		ExcelUtils.setExcell("UserData.xlsx");
		ExcelUtils.setWorkSheet(0);

		

		String newPassword = ExcelUtils.getDataAt(2, 1);
		String repeatPassword = ExcelUtils.getDataAt(2, 1);

		String firstName = ExcelUtils.getDataAt(2, 2);
		String lastName = ExcelUtils.getDataAt(2, 3);
		String email = ExcelUtils.getDataAt(2, 4);
		String phone = ExcelUtils.getDataAt(2, 5);
		String address1 = ExcelUtils.getDataAt(2, 6);
		String address2 = ExcelUtils.getDataAt(2, 7);
		String city = ExcelUtils.getDataAt(2, 8);
		String state = ExcelUtils.getDataAt(2, 9);
		String zip = ExcelUtils.getDataAt(2, 10);
		String country = ExcelUtils.getDataAt(2, 11);

		
		String language = "japanese";
		String favCategory = "FISH";
		

		PetStoreMenu.clickSignIn(driver);
		String currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, SignIn.URL);

		SignIn.inputSignInUsername(driver, "user123");
		tempWE = SignIn.getSignInUsername(driver);
		sa.assertEquals(tempWE.getAttribute("value"), "user123");

		SignIn.getSignInPassword(driver).clear();

		SignIn.inputSignInPassword(driver, "pass123");
		tempWE = SignIn.getSignInPassword(driver);
		sa.assertEquals(tempWE.getAttribute("value"), "pass123");

		SignIn.clickSignIn(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, "https://petstore.octoperf.com/actions/Catalog.action");

		PetStoreMenu.clickMyAcctBtn(driver);
		sa.assertEquals(driver.getCurrentUrl(), Edit.URL);

		tempWE = Edit.getRepeatPassword(driver);
		sa.assertEquals(tempWE.getAttribute("value"), newPassword);

		tempWE = Edit.getRepeatPassword(driver);
		sa.assertEquals(tempWE.getAttribute("value"), repeatPassword);

		tempWE = Edit.getFirstName(driver);
		sa.assertEquals(tempWE.getAttribute("value"), firstName);

		tempWE = Edit.getLastName(driver);
		sa.assertEquals(tempWE.getAttribute("value"), lastName);

		tempWE = Edit.getEmail(driver);
		sa.assertEquals(tempWE.getAttribute("value"), email);

		tempWE = Edit.getPhone(driver);
		sa.assertEquals(tempWE.getAttribute("value"), phone);

		tempWE = Edit.getAddress1(driver);
		sa.assertEquals(tempWE.getAttribute("value"), address1);

		tempWE = Edit.getAddress2(driver);
		sa.assertEquals(tempWE.getAttribute("value"), address2);

		tempWE = Edit.getCity(driver);
		sa.assertEquals(tempWE.getAttribute("value"), city);

		tempWE = Edit.getState(driver);
		sa.assertEquals(tempWE.getAttribute("value"), state);

		tempWE = Edit.getZip(driver);
		sa.assertEquals(tempWE.getAttribute("value"), zip);

		tempWE = Edit.getCountry(driver);
		sa.assertEquals(tempWE.getAttribute("value"), country);

		tempS = Edit.getLanguage(driver).getFirstSelectedOption().getText();
		sa.assertEquals(tempS, language);

		tempS = Edit.getFavCategory(driver).getFirstSelectedOption().getText();
		sa.assertEquals(tempS, favCategory);

		tempWE = Edit.getEnableList(driver);
		// sa.assertEquals(tempWE.getAttribute("value").isEmpty(), false);

		tempWE = Edit.getEnableBanner(driver);
		// sa.assertEquals(tempWE.getAttribute("value").isEmpty(), true);

		sa.assertAll();
	}
}
