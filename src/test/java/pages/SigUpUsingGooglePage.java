package pages;

import org.openqa.selenium.By;

public class SigUpUsingGooglePage extends BasePage{
	
	public By emailTextBox = By.xpath("//input[@type='email']");
	
	public By nextButton = By.xpath("//span[normalize-space()='Next']");
	
	public By nextButtonWithBangla = By.xpath("//span[contains(text(),'পরবর্তী')]");
	
	public By clickSignUpButton = By.xpath("//p[@class='js--registration-form-btn text-uppercase']");
	
	public By fullName = By.xpath("//input[@id='nm']");
	
	public By email = By.xpath("//input[@id='js-email']");
	
	public By phoneNumber = By.xpath("//input[@id='js-phone']");
	
	public By password = By.xpath("//input[@id='pwd']");
	
	public By notRobot = By.xpath("//body");
	
	public By createAccountButton = By.xpath("//button[normalize-space()='Create Account']");
	
	public By reCAPTCHA = By.xpath("//iframe[@title='reCAPTCHA']");
	
	public By iAmNotRobot = By.xpath("//div[@class='recaptcha-checkbox-border']");
	

}
