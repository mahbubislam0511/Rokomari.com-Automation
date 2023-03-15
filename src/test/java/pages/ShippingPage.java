package pages;

import org.openqa.selenium.By;

public class ShippingPage extends BasePage{
	
	public By alterPhoneNumber = By.xpath("//fieldset[@class='group']//input[@id='phone2']");
	
	public By city = By.xpath("//select[@id='js--city']");
	
	public By area = By.xpath("//select[@id='js--area']");
	
	public By address = By.xpath("//fieldset[@class='mb-0']//textarea[@id='address']");
	
	public By ssl = By.xpath("//img[@alt='ssl']");
	
	public By confirmOrder = By.xpath("//span[normalize-space()='Confirm Order']");
	
	public String ShippingPage_Title = "Shipping Address | Rokomari.com";
	
	
	

}
