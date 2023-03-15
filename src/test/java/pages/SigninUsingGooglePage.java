package pages;

import org.openqa.selenium.By;

public class SigninUsingGooglePage extends BasePage {

	public By email = By.xpath("//input[@id='j_username']");
	
	public By password = By.xpath("//input[@id='j_password']");
	
	public By signin = By.xpath("//button[normalize-space()='Sign In']");
	
}
