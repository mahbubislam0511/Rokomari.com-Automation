package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {
	
	public String Url = "https://www.rokomari.com/book";
	
	public By authors = By.xpath("//a[@id='js--authors']");
	
	public By humayon_Ahmed = By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]");
	
	public By closeAdd = By.xpath("//div[@id='js--entry-popup']//i[@class='ion-close-round']");
	
	public By signInButton = By.xpath("//a[normalize-space()='Sign in']");
	
	public By signUpButtonWithGoogle = By.xpath("//button[@class='btn btn-social-google d-flex justify-content-start align-items-center']");
	
	
}
