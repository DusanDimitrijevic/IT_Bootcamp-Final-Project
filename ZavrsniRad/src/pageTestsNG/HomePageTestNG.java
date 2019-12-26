package pageTestsNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.HomePage;
import page.objects.PetStoreMenu;

public class HomePageTestNG {
	WebDriver driver ;
	SoftAssert sa = new SoftAssert();
	String url = HomePage.URL;

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
	public void afterLastTest() {
		driver.quit();
	}

	@Test
	public void enterTheStoreTest() {
		HomePage.clickEnter(driver);
		String currUrl = driver.getCurrentUrl();
		currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, PetStoreMenu.URL);
		sa.assertAll();
	}
}