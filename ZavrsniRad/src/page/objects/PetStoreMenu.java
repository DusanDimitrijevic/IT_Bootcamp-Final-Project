package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PetStoreMenu {

	public static final String URL = "https://petstore.octoperf.com/actions/Catalog.action";

	private static final String SIGN_IN_XPATH = "/html[1]/body[1]/div[1]/div[2]/div[1]/a[2]";
	// VRACANJE NA MAIN MENU
	public static final String RETURN_MAIN_MENU_XPATH = "//a[contains(text(),'Return to Main Menu')]";
	public static final String PET_STORE_RETURN_LOGO_XPATH = "//div[@id='LogoContent']//a//img";
	// LEVA STRANA MENIJA
	public static final String L_MENU_FISH_XPATH = "//div[@id='Content']//a[1]//img[1]";
	public static final String L_MENU_DOGS_XPATH = "//div[@id='Content']//a[2]//img[1]";
	public static final String L_MENU_CATS_XPATH = "//div[@id='Content']//a[3]//img[1]";
	public static final String L_MENU_REPTILES_XPATH = "//div[@id='Content']//a[4]//img[1]";
	public static final String L_MENU_BIRDS_XPATH = "//div[@id='Content']//a[5]//img[1]";
	// HEADER
	public static final String FISH_HEADER_XPATH = "//div[@id='QuickLinks']//a[1]//img[1]";
	public static final String DOGS_HEADER_XPATH = "//div[@id='Header']//a[2]//img[1]";
	public static final String CATS_HEADER_XPATH = "//div[@id='Header']//a[4]//img[1]";
	public static final String REPTILES_HEADER_XPATH = "//div[@id='Header']//a[3]//img[1]";
	public static final String BIRDS_HEADER_XPATH = "//div[@id='Header']//a[5]//img[1]";
	// IMAGES
	public static final String FISH_IMAGE_XPATH = "//body//area[2]";
	public static final String DOGS_IMAGE_XPATH = "//body//area[3]";
	public static final String CATS_IMAGE_XPATH = "//body//area[5]";
	public static final String REPTILES_IMAGE_XPATH = "//body//area[4]";
	public static final String LARGER_BIRDS_IMAGE_XPATH = "//body//area[1]";
	public static final String SMALLER_BIRDS_IMAGE_XPATH = "//body//area[6]";
	// DUGMICI

	private static final String LOGOHOME_XPATH = "/html[1]/body[1]/div[1]/div[1]/div[1]/a[1]/img[1]";
	private static final String SHOPPINGCART_XPATH = "/html[1]/body[1]/div[1]/div[2]/div[1]/a[1]/img[1]";
	private static final String HELP_XPATH = "/html[1]/body[1]/div[1]/div[2]/div[1]/a[3]";
	private static final String SEARCHFIELD_XPATH = "/html[1]/body[1]/div[1]/div[3]/div[1]/form[1]/input[1]";
	private static final String SEARCHBUTTON_XPATH = "/html[1]/body[1]/div[1]/div[3]/div[1]/form[1]/input[2]";
	private static final String ACCTBUTTON_XPATH = "/html[1]/body[1]/div[1]/div[2]/div[1]/a[3]";

	/// METODA ZA VRACANJE U MAIN MENU
	public static WebElement getReturnMenu(WebDriver driver) {
		return driver.findElement(By.xpath(RETURN_MAIN_MENU_XPATH));
	}

	public static void clickReturnMenu(WebDriver driver) {
		getReturnMenu(driver).click();
	}

	public static WebElement getReturnLogo(WebDriver driver) {
		return driver.findElement(By.xpath(PET_STORE_RETURN_LOGO_XPATH));
	}

	public static void clickReturnLogo(WebDriver driver) {
		getReturnLogo(driver).click();
	}

	// LEVA STRANA MENIJA FISH

	public static WebElement getLeftFish(WebDriver driver) {
		return driver.findElement(By.xpath(L_MENU_FISH_XPATH));
	}

	public static void clickLeftFish(WebDriver driver) {
		getLeftFish(driver).click();

	}

	// LEVA STRANA DOGS
	public static WebElement getLeftDogs(WebDriver driver) {
		return driver.findElement(By.xpath(L_MENU_DOGS_XPATH));
	}

	public static void clickLeftDogs(WebDriver driver) {
		getLeftDogs(driver).click();
	}

	// LEVA STRANA CATS
	public static WebElement getLeftCats(WebDriver driver) {
		return driver.findElement(By.xpath(L_MENU_CATS_XPATH));
	}

	public static void clickLeftCats(WebDriver driver) {
		getLeftCats(driver).click();
	}

	// LEVA STRANA REPTILI
	public static WebElement getLeftReptiles(WebDriver driver) {
		return driver.findElement(By.xpath(L_MENU_REPTILES_XPATH));
	}

	public static void clickLeftReptiles(WebDriver driver) {
		getLeftReptiles(driver).click();
	}

	// LEVA STRANA BIRDS
	public static WebElement getLeftBirds(WebDriver driver) {
		return driver.findElement(By.xpath(L_MENU_BIRDS_XPATH));
	}

	public static void clickLeftBirds(WebDriver driver) {
		getLeftBirds(driver).click();
	}

	// HEADER FISH
	public static WebElement getHeaderFish(WebDriver driver) {
		return driver.findElement(By.xpath(FISH_HEADER_XPATH));
	}

	public static void clickHeaderFish(WebDriver driver) {
		getHeaderFish(driver).click();
	}

	// HEADER DOGS
	public static WebElement getHeaderDogs(WebDriver driver) {
		return driver.findElement(By.xpath(DOGS_HEADER_XPATH));
	}

	public static void clickHeaderDogs(WebDriver driver) {
		getHeaderDogs(driver).click();
	}

	// HEADER CATS
	public static WebElement getHeaderCats(WebDriver driver) {
		return driver.findElement(By.xpath(CATS_HEADER_XPATH));
	}

	public static void clickHeaderCats(WebDriver driver) {
		getHeaderCats(driver).click();
	}

	// HEADER REPTILES
	public static WebElement getHeaderReptiles(WebDriver driver) {
		return driver.findElement(By.xpath(REPTILES_HEADER_XPATH));
	}

	public static void clickHeaderReptiles(WebDriver driver) {
		getHeaderReptiles(driver).click();
	}

	// HEADER BIRDS
	public static WebElement getHeaderBirds(WebDriver driver) {
		return driver.findElement(By.xpath(BIRDS_HEADER_XPATH));
	}

	public static void clickHeaderBirds(WebDriver driver) {
		getHeaderBirds(driver).click();
	}

	// IMAGES FISH
	public static WebElement getFishImage(WebDriver driver) {
		return driver.findElement(By.xpath(FISH_IMAGE_XPATH));
	}

	public static void clickFishImage(WebDriver driver) {
		getFishImage(driver).click();
	}

	// IMAGES DOGS
	public static WebElement getDogsImage(WebDriver driver) {
		return driver.findElement(By.xpath(DOGS_IMAGE_XPATH));
	}

	public static void clickDogsImage(WebDriver driver) {
		getDogsImage(driver).click();
	}

	// IMAGES CATS
	public static WebElement getCatsImage(WebDriver driver) {
		return driver.findElement(By.xpath(CATS_IMAGE_XPATH));
	}

	public static void clickCatsImage(WebDriver driver) {
		getCatsImage(driver).click();
	}

	// IMAGES REPTILES
	public static WebElement getReptilesImage(WebDriver driver) {
		return driver.findElement(By.xpath(REPTILES_IMAGE_XPATH));
	}

	public static void clickReptilesImage(WebDriver driver) {
		getReptilesImage(driver).click();
	}

	// IMAGES LARGER BIRD
	public static WebElement getLargeBirdImage(WebDriver driver) {
		return driver.findElement(By.xpath(LARGER_BIRDS_IMAGE_XPATH));
	}

	public static void clickLargeBirdImage(WebDriver driver) {
		getLargeBirdImage(driver).click();
	}

	// IMAGES SMALLER BIRD
	public static WebElement getSmallBirdImage(WebDriver driver) {
		return driver.findElement(By.xpath(SMALLER_BIRDS_IMAGE_XPATH));
	}

	public static void clickSmallBirdImage(WebDriver driver) {
		getSmallBirdImage(driver).click();

	}

	public static WebElement getSignIn(WebDriver driver) {
		return driver.findElement(By.xpath(SIGN_IN_XPATH));
	}

	public static void clickSignIn(WebDriver driver) {
		getSignIn(driver).click();
	}

	// METODE ZA DUGMICE

	public static WebElement getLogoHome(WebDriver driver) {
		return driver.findElement(By.xpath(LOGOHOME_XPATH));
	}

	public static void clickLogoHome(WebDriver driver) {
		getLogoHome(driver).click();
	}

	public static WebElement getShoppingCart(WebDriver driver) {
		return driver.findElement(By.xpath(SHOPPINGCART_XPATH));
	}

	public static void clickShoppingCart(WebDriver driver) {
		getShoppingCart(driver).click();
	}

	public static WebElement getHelp(WebDriver driver) {
		return driver.findElement(By.xpath(HELP_XPATH));
	}

	public static void clickHelp(WebDriver driver) {
		getHelp(driver).click();
	}

	public static WebElement getSearchField(WebDriver driver) {
		return driver.findElement(By.xpath(SEARCHFIELD_XPATH));
	}

	public static void clickSearchField(WebDriver driver) {
		getSearchField(driver).click();
	}

	public static WebElement getSearchButton(WebDriver driver) {
		return driver.findElement(By.xpath(SEARCHBUTTON_XPATH));
	}

	public static void clickSearchButton(WebDriver driver) {
		getSearchButton(driver).click();
	}

	public static WebElement getMyAcctBtn(WebDriver driver) {
		return driver.findElement(By.xpath(ACCTBUTTON_XPATH));
	}

	public static void clickMyAcctBtn(WebDriver driver) {
		getMyAcctBtn(driver).click();
	}
}
