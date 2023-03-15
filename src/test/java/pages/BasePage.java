package pages;

import static utilities.DriverSetup.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BasePage {
	
	public WebElement getElement(By locator) {
		return getDriver().findElement(locator);
	}
	
	public void clickOnElement(By locator) {
		getElement(locator).click();
	}
	
	public String getElementText(By locator) {
		return getElement(locator).getText();
	}
	
	public void writeTextOnElement(By locator, String text) {
		getElement(locator).sendKeys(text);
	}
	
	public void moveToElement(By locator) {
		Actions actions = new Actions(getDriver());
		actions.moveToElement(getElement(locator)).build().perform();
	}
	

}
