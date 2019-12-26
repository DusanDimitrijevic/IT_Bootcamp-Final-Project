package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public static final String URL="https://petstore.octoperf.com/";
	private static final String ENTER_XPATH="//a[contains(text(),'Enter the Store')]";
	
	public static WebElement getEnter(WebDriver driver) {
		return driver.findElement(By.xpath(ENTER_XPATH));
	}
	public static void clickEnter(WebDriver driver) {
		getEnter(driver).click();
	}
}