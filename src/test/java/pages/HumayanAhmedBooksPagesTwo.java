package pages;

import org.openqa.selenium.By;

public class HumayanAhmedBooksPagesTwo extends BasePage {
	
	public By book = By.xpath("//img[@alt='Achinpur image']");
	
	public By addToCart = By.xpath("//div[@title='অচিনপুর হুমায়ূন আহমেদ']//div[1]//div[2]//button[1]");
	
	public By clickCardIcon = By.xpath("//a[@id='js-cart-menu']//*[name()='svg']");
	
}
