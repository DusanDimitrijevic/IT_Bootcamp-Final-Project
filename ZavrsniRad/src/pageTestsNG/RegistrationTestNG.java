package pageTestsNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.Edit;
import page.objects.Registration;

import utility.ExcelUtils;

public class RegistrationTestNG {
	WebDriver driver;
	String url = Registration.URL;
	SoftAssert sa = new SoftAssert();
	WebElement tempWE = null;
	String tempS = "";

	@BeforeTest
	public void beforeFirstTest() {
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
	public void RegistrationFormTestOneUserExcel() {
		ExcelUtils.setExcell("UserData.xlsx");
		ExcelUtils.setWorkSheet(0);

		String userID = ExcelUtils.getDataAt(1, 0);
		String newPassword = ExcelUtils.getDataAt(1, 1);
		String repeatPassword = ExcelUtils.getDataAt(1, 1);

		String firstName = ExcelUtils.getDataAt(1, 2);
		String lastName = ExcelUtils.getDataAt(1, 3);
		String email = ExcelUtils.getDataAt(1, 4);
		String phone = ExcelUtils.getDataAt(1, 5);
		String address1 = ExcelUtils.getDataAt(1, 6);
		String address2 = ExcelUtils.getDataAt(1, 7);
		String city = ExcelUtils.getDataAt(1, 8);
		String state = ExcelUtils.getDataAt(1, 9);
		String zip = ExcelUtils.getDataAt(1, 10);
		String country = ExcelUtils.getDataAt(1, 11);

		String language = "english";

		String favoriteCategory = "REPTILES";

		Registration.inputUserID(driver, userID);
		tempWE = Registration.getUserID(driver);
		sa.assertEquals(tempWE.getAttribute("value"), userID);

		Registration.inputNewPassword(driver, newPassword);
		tempWE = Registration.getNewPassword(driver);
		sa.assertEquals(tempWE.getAttribute("value"), newPassword);

		Registration.inputRepeatPassword(driver, repeatPassword);
		tempWE = Registration.getRepeatPassword(driver);
		sa.assertEquals(tempWE.getAttribute("value"), repeatPassword);

		Registration.inputFirstName(driver, firstName);
		tempWE = Registration.getFirstName(driver);
		sa.assertEquals(tempWE.getAttribute("value"), firstName);

		Registration.inputLastName(driver, lastName);
		tempWE = Registration.getLastName(driver);
		sa.assertEquals(tempWE.getAttribute("value"), lastName);

		Registration.inputEmail(driver, email);
		tempWE = Registration.getEmail(driver);
		sa.assertEquals(tempWE.getAttribute("value"), email);

		Registration.inputPhone(driver, phone);
		tempWE = Registration.getPhone(driver);
		sa.assertEquals(tempWE.getAttribute("value"), phone);

		Registration.inputAddress1(driver, address1);
		tempWE = Registration.getAddress1(driver);
		sa.assertEquals(tempWE.getAttribute("value"), address1);

		Registration.inputAddress2(driver, address2);
		tempWE = Registration.getAddress2(driver);
		sa.assertEquals(tempWE.getAttribute("value"), address2);

		Registration.inputCity(driver, city);
		tempWE = Registration.getCity(driver);
		sa.assertEquals(tempWE.getAttribute("value"), city);

		Registration.inputState(driver, state);
		tempWE = Registration.getState(driver);
		sa.assertEquals(tempWE.getAttribute("value"), state);

		Registration.inputZip(driver, zip);
		tempWE = Registration.getZip(driver);
		sa.assertEquals(tempWE.getAttribute("value"), zip);

		Registration.inputCountry(driver, country);
		tempWE = Registration.getCountry(driver);
		sa.assertEquals(tempWE.getAttribute("value"), country);

		Registration.inputLanguage(driver, language);
		tempS = Registration.getLanguage(driver).getFirstSelectedOption().getText();
		sa.assertEquals(tempS, language);

		Registration.inputFavCategory(driver, favoriteCategory);
		tempS = Registration.getFavCategory(driver).getFirstSelectedOption().getText();
		sa.assertEquals(tempS, favoriteCategory);

		Registration.clickEnableList(driver);
		tempWE = Registration.getEnableList(driver);
		sa.assertEquals(tempWE.isSelected(), true);

		tempWE = Registration.getEnableBanner(driver);
		sa.assertEquals(tempWE.isSelected(), false);

		// Registration.clickSaveAccount(driver);
		String currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		// sa.assertEquals(currUrl, PetStoreMenu.URL);

		sa.assertAll();
	}

	@Test(priority = 2)
	public void RegistrationFormTestAllUsers() {
		ExcelUtils.setExcell("UserData.xlsx");
		ExcelUtils.setWorkSheet(0);

		for (int i = 2; i < ExcelUtils.getRowNumber(); i++) {
			
			driver.get(url);

			Edit.deleteUserID(driver);
			Edit.deleteNewPassword(driver);
			Edit.deleteRepeatPassword(driver);
			Edit.deleteFirstName(driver);
			Edit.deleteLastName(driver);
			Edit.deleteEmail(driver);
			Edit.deletePhone(driver);
			Edit.deleteAddress1(driver);
			Edit.deleteAddress2(driver);
			Edit.deleteCity(driver);
			Edit.deleteState(driver);
			Edit.deleteZip(driver);
			Edit.deleteCountry(driver);
			if (Registration.getEnableList(driver).isSelected() == true) {
				Registration.clickEnableList(driver);
			}
			if (Registration.getEnableBanner(driver).isSelected() == true) {
				Registration.clickEnableBanner(driver);
			}

			String userID = ExcelUtils.getDataAt(i, 0);
			String newPassword = ExcelUtils.getDataAt(i, 1);
			String repeatPassword = ExcelUtils.getDataAt(i, 1);

			String firstName = ExcelUtils.getDataAt(i, 2);
			String lastName = ExcelUtils.getDataAt(i, 3);
			String email = ExcelUtils.getDataAt(i, 4);
			String phone = ExcelUtils.getDataAt(i, 5);
			String address1 = ExcelUtils.getDataAt(i, 6);
			String address2 = ExcelUtils.getDataAt(i, 7);
			String city = ExcelUtils.getDataAt(i, 8);
			String state = ExcelUtils.getDataAt(i, 9);
			String zip = ExcelUtils.getDataAt(i, 10);
			String country = ExcelUtils.getDataAt(i, 11);

			String language = "english";
			String favoriteCategory = "REPTILES";

			Registration.inputUserID(driver, userID);
			tempWE = Registration.getUserID(driver);
			sa.assertEquals(tempWE.getAttribute("value"), userID);

			Registration.inputNewPassword(driver, newPassword);
			tempWE = Registration.getNewPassword(driver);
			sa.assertEquals(tempWE.getAttribute("value"), newPassword);

			Registration.inputRepeatPassword(driver, repeatPassword);
			tempWE = Registration.getRepeatPassword(driver);
			sa.assertEquals(tempWE.getAttribute("value"), repeatPassword);

			Registration.inputFirstName(driver, firstName);
			tempWE = Registration.getFirstName(driver);
			sa.assertEquals(tempWE.getAttribute("value"), firstName);

			Registration.inputLastName(driver, lastName);
			tempWE = Registration.getLastName(driver);
			sa.assertEquals(tempWE.getAttribute("value"), lastName);

			Registration.inputEmail(driver, email);
			tempWE = Registration.getEmail(driver);
			sa.assertEquals(tempWE.getAttribute("value"), email);

			Registration.inputPhone(driver, phone);
			tempWE = Registration.getPhone(driver);
			sa.assertEquals(tempWE.getAttribute("value"), phone);

			Registration.inputAddress1(driver, address1);
			tempWE = Registration.getAddress1(driver);
			sa.assertEquals(tempWE.getAttribute("value"), address1);

			Registration.inputAddress2(driver, address2);
			tempWE = Registration.getAddress2(driver);
			sa.assertEquals(tempWE.getAttribute("value"), address2);

			Registration.inputCity(driver, city);
			tempWE = Registration.getCity(driver);
			sa.assertEquals(tempWE.getAttribute("value"), city);

			Registration.inputState(driver, state);
			tempWE = Registration.getState(driver);
			sa.assertEquals(tempWE.getAttribute("value"), state);

			Registration.inputZip(driver, zip);
			tempWE = Registration.getZip(driver);
			sa.assertEquals(tempWE.getAttribute("value"), zip);

			Registration.inputCountry(driver, country);
			tempWE = Registration.getCountry(driver);
			sa.assertEquals(tempWE.getAttribute("value"), country);

			Registration.inputLanguage(driver, language);
			tempS = Registration.getLanguage(driver).getFirstSelectedOption().getText();
			sa.assertEquals(tempS, language);

			Registration.inputFavCategory(driver, favoriteCategory);
			tempS = Registration.getFavCategory(driver).getFirstSelectedOption().getText();
			sa.assertEquals(tempS, favoriteCategory);

			Registration.clickEnableList(driver);
			tempWE = Registration.getEnableList(driver);
			sa.assertEquals(tempWE.isSelected(), true);

			tempWE = Registration.getEnableBanner(driver);
			sa.assertEquals(tempWE.isSelected(), false);

			// Registration.clickSaveAccount(driver);
			String currUrl = driver.getCurrentUrl();
			currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
			// sa.assertEquals(currUrl, PetStoreMenu.URL);

			sa.assertAll();
		}
	}
}