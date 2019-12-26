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

public class SignInTestNG {
	WebDriver driver;
	String url = SignIn.URL;
	SoftAssert sa = new SoftAssert();
	WebElement tempWE = null;
	String tempS = "";

	public static void wait2() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

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
	public void signInTestOneUserExcel() {

		ExcelUtils.setExcell("UserData.xlsx");
		ExcelUtils.setWorkSheet(0);
		String SignInUsername = ExcelUtils.getDataAt(1, 0);
		String SignInPassword = ExcelUtils.getDataAt(1, 1);

		SignIn.inputSignInUsername(driver, SignInUsername);
		tempWE = SignIn.getSignInUsername(driver);
		sa.assertEquals(tempWE.getAttribute("value"), SignInUsername);

		SignIn.inputSignInPassword(driver, SignInPassword);
		tempWE = SignIn.getSignInPassword(driver);
		sa.assertEquals(tempWE.getAttribute("value"), SignInPassword);

		SignIn.clickSignIn(driver);
		String currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, SignIn.URL_AFTER_SIGNIN);

		sa.assertAll();

		wait2();

	}

	@Test(priority = 2)
	public void signInTestAllUserExcel() throws InterruptedException {

		ExcelUtils.setExcell("UserData.xlsx");
		ExcelUtils.setWorkSheet(0);

		for (int i = 1; i < ExcelUtils.getRowNumber(); i++) {
			driver.get(url);

			String signInUsername = ExcelUtils.getDataAt(i, 0);
			String newPassword = ExcelUtils.getDataAt(i, 1);

			Edit.deleteNewPassword(driver);
			Thread.sleep(500);

			SignIn.inputSignInUsername(driver, signInUsername);
			tempWE = SignIn.getSignInUsername(driver);
			sa.assertEquals(tempWE.getAttribute("value"), signInUsername);

			SignIn.inputSignInPassword(driver, newPassword);
			tempWE = SignIn.getSignInPassword(driver);
			sa.assertEquals(tempWE.getAttribute("value"), newPassword);

			SignIn.clickSignIn(driver);
			String currUrl = driver.getCurrentUrl();
			currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
			sa.assertEquals(currUrl, SignIn.URL_AFTER_SIGNIN);

			SignIn.clickSignOutPassword(driver);
			currUrl = driver.getCurrentUrl();
			currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
			sa.assertEquals(currUrl, PetStoreMenu.URL);

			sa.assertAll();
		}
	}
}