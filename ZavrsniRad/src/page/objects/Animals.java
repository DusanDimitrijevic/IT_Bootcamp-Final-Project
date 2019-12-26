package page.objects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Animals {
	// FISH URL
	public static final String URL_FISH = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=FISH";

	// DOGS URL
	public static final String URL_DOGS = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=DOGS";

	// REPTILES URL
	public static final String URL_REPTILES = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=REPTILES";

	// CATS URL
	public static final String URL_CATS = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=CATS";

	// MANX CATS XPATH
	private static final String MANX_XPATH = "//a[contains(text(),'FL-DSH-01')]";
	private static final String MANX_TAILLESS_XPATH = "//a[contains(text(),'EST-14')]";
	private static final String MANX_WITH_TAIL_XPATH = "//a[contains(text(),'EST-15')]";

	// PERSIAN CATS XPATH
	private static final String PERSIAN_XPATH = "//a[contains(text(),'FL-DLH-02')]";
	private static final String PERSIAN_ADULT_FEMALE_XPATH = "//a[contains(text(),'EST-16')]";
	private static final String PERSIAN_ADULT_MALE_XPATH = "//a[contains(text(),'EST-17')]";

	// BIRDS URL
	public static final String URL_BIRDS = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=BIRDS";

	private static final String ADD_TO_CART = "//a[@class='Button']";

	// MANX
	public static WebElement getManx(WebDriver driver) {
		return driver.findElement(By.xpath(MANX_XPATH));
	}

	public static void clickManx(WebDriver driver) {
		getManx(driver).click();
	}

	public static WebElement getManxTailless(WebDriver driver) {
		return driver.findElement(By.xpath(MANX_TAILLESS_XPATH));
	}

	public static void clickManxTailless(WebDriver driver) {
		getManx(driver).click();
	}

	public static WebElement getManxWithTail(WebDriver driver) {
		return driver.findElement(By.xpath(MANX_WITH_TAIL_XPATH));
	}

	public static void clickManxWithTail(WebDriver driver) {
		getManx(driver).click();
	}

	// PERSIAN
	public static WebElement getPersian(WebDriver driver) {
		return driver.findElement(By.xpath(PERSIAN_XPATH));
	}

	public static void clickPersian(WebDriver driver) {
		getPersian(driver).click();
	}

	public static WebElement getPersianAdultFemale(WebDriver driver) {
		return driver.findElement(By.xpath(PERSIAN_ADULT_FEMALE_XPATH));
	}

	public static void clickPersianAdultFemale(WebDriver driver) {
		getPersianAdultFemale(driver).click();
	}

	public static WebElement getPersianAdultMale(WebDriver driver) {
		return driver.findElement(By.xpath(PERSIAN_ADULT_MALE_XPATH));
	}

	public static void clickPersianAdultMale(WebDriver driver) {
		getPersianAdultMale(driver).click();
	}

	// add to cart methods
	public static WebElement getAddToCart(WebDriver driver) {
		return driver.findElement(By.xpath(ADD_TO_CART));
	}

	public static void clickAddToCart(WebDriver driver) {
		getAddToCart(driver).click();
	}
}
