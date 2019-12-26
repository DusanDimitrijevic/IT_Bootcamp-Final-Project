package page.proba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.ExcelUtils;
import page.objects.HomePage;
import page.objects.Registration;
import page.objects.SignIn;

public class MainRegistrationProba {
	public static void wait2() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dule\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		{
			for (int i = 1; i < 51; i++) {
				driver.get(HomePage.URL);
				driver.manage().window().maximize();

				String DATA_SOURCE = "UserData.xlsx";

				HomePage.clickEnter(driver);
				wait2();
				SignIn.clickSignIn(driver);
				SignIn.clickRegisterButton(driver);

				ExcelUtils.setExcell(DATA_SOURCE);
				ExcelUtils.setWorkSheet(0);

				String userID, newPassword, repeatPassword, firstName, lastName, email, phone, address1, address2, city,
						state, zip, country;

				userID = ExcelUtils.getDataAt(i, 0);
				newPassword = ExcelUtils.getDataAt(i, 1);
				repeatPassword = ExcelUtils.getDataAt(i, 1);
				firstName = ExcelUtils.getDataAt(i, 2);
				lastName = ExcelUtils.getDataAt(i, 3);
				email = ExcelUtils.getDataAt(i, 4);
				phone = ExcelUtils.getDataAt(i, 5);
				address1 = ExcelUtils.getDataAt(i, 6);
				address2 = ExcelUtils.getDataAt(i, 7);
				city = ExcelUtils.getDataAt(i, 8);
				state = ExcelUtils.getDataAt(i, 9);
				zip = ExcelUtils.getDataAt(i, 10);
				country = ExcelUtils.getDataAt(i, 11);

				Registration.inputUserID(driver, userID);
				Registration.inputNewPassword(driver, newPassword);
				Registration.inputRepeatPassword(driver, repeatPassword);
				Registration.inputFirstName(driver, firstName);
				Registration.inputLastName(driver, lastName);
				Registration.inputEmail(driver, email);
				Registration.inputPhone(driver, phone);
				Registration.inputAddress1(driver, address1);
				Registration.inputAddress2(driver, address2);
				Registration.inputCity(driver, city);
				Registration.inputState(driver, state);
				Registration.inputZip(driver, zip);
				Registration.inputCountry(driver, country);

				Registration.inputLanguage(driver, "japanese");
				Registration.inputFavCategory(driver, "REPTILES");
				Registration.clickEnableList(driver);
				Registration.clickEnableBanner(driver);

				wait2();

				Registration.clickSaveAccount(driver);

				driver.get(SignIn.URL);

				SignIn.clickRegisterButton(driver);

			}
			driver.quit();
		}

	}
}