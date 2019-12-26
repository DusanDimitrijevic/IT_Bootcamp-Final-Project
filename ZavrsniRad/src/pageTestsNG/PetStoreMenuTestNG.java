package pageTestsNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.Animals;

import page.objects.PetStoreMenu;

import page.objects.SignIn;

public class PetStoreMenuTestNG {
	WebDriver driver;
	String url = PetStoreMenu.URL;
	SoftAssert sa = new SoftAssert();

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
	public void HeaderTest() {
		PetStoreMenu.clickHeaderBirds(driver);
		String currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, Animals.URL_BIRDS);

		driver.get(url);
		PetStoreMenu.clickHeaderCats(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, Animals.URL_CATS);

		driver.get(url);
		PetStoreMenu.clickHeaderDogs(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, Animals.URL_DOGS);

		driver.get(url);
		PetStoreMenu.clickHeaderFish(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, Animals.URL_FISH);

		driver.get(url);
		PetStoreMenu.clickHeaderReptiles(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, Animals.URL_REPTILES);

		sa.assertAll();
	}

	@Test(priority = 2)
	public void LeftMenuTest() {
		driver.get(url);
		PetStoreMenu.clickLeftBirds(driver);
		String currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, Animals.URL_BIRDS);

		driver.get(url);
		PetStoreMenu.clickLeftCats(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, Animals.URL_CATS);

		driver.get(url);
		PetStoreMenu.clickLeftDogs(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, Animals.URL_DOGS);

		driver.get(url);
		PetStoreMenu.clickLeftFish(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, Animals.URL_FISH);

		driver.get(url);
		PetStoreMenu.clickLeftReptiles(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, Animals.URL_REPTILES);

		sa.assertAll();
	}

	@Test(priority = 3)
	public void imageMenuTest() {
		driver.get(url);
		PetStoreMenu.clickSmallBirdImage(driver);
		String currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, Animals.URL_BIRDS);

		driver.get(url);
		PetStoreMenu.clickLargeBirdImage(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, Animals.URL_BIRDS);

		driver.get(url);
		PetStoreMenu.clickCatsImage(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, Animals.URL_CATS);

		driver.get(url);
		PetStoreMenu.clickDogsImage(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, Animals.URL_DOGS);

		driver.get(url);
		PetStoreMenu.clickFishImage(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, Animals.URL_FISH);

		driver.get(url);
		PetStoreMenu.clickReptilesImage(driver);
		currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, Animals.URL_REPTILES);

		sa.assertAll();
	}

	@Test(priority = 4)
	public void SignInTest() {
		driver.get(url);
		PetStoreMenu.clickSignIn(driver);
		String currUrl = driver.getCurrentUrl();
		currUrl = currUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(currUrl, SignIn.URL);

		sa.assertAll();
	}
}
