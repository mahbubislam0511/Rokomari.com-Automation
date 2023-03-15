package testCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pages.CartPage;
import pages.HomePage;
import pages.HumayanAhmedBooksPages;
import pages.HumayanAhmedBooksPagesTwo;
import pages.ShippingPage;
import pages.SigUpUsingGooglePage;
import pages.SigninUsingGooglePage;
import utilities.DriverSetup;

public class RokomariBooksPurchaseAutomation extends DriverSetup {

	HomePage homePage = new HomePage();
	SigUpUsingGooglePage signUpUsingGooglePage = new SigUpUsingGooglePage();
	SigninUsingGooglePage signinUsingGooglePage = new SigninUsingGooglePage();
	HumayanAhmedBooksPages humayanAhmedBooksPages = new HumayanAhmedBooksPages();
	HumayanAhmedBooksPagesTwo humayanAhmedBooksPagesTwo = new HumayanAhmedBooksPagesTwo();
	CartPage cartPage = new CartPage();
	ShippingPage shippingPage = new ShippingPage();
	
	@Test
	public void purchaseAutomation() throws InterruptedException {
		
		//Go To Home Page
		getDriver().get(homePage.Url);
		Thread.sleep(2500);
		homePage.clickOnElement(homePage.closeAdd);
		Thread.sleep(2500);
		homePage.clickOnElement(homePage.signInButton);
		Thread.sleep(2500);
		
		//Sign up using Google Account
		/*
		signpUsingGooglePage.clickOnElement(signUpUsingGooglePage.clickSignUpButton);
		Thread.sleep(2500);
		signUpUsingGooglePage.writeTextOnElement(signUpUsingGooglePage.fullName, "Mahbub Islam");
		Thread.sleep(2500);
		signUpUsingGooglePage.writeTextOnElement(signUpUsingGooglePage.email, "mahbub.stc0510@gmail.com");
		Thread.sleep(2500);
		signUpUsingGooglePage.writeTextOnElement(signUpUsingGooglePage.phoneNumber, "01774310925");
		Thread.sleep(2500);
		signUpUsingGooglePage.writeTextOnElement(signUpUsingGooglePage.password, "Mahbub@220519");
		Thread.sleep(2500);
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		getDriver().switchTo().frame(signUpUsingGooglePage.getElement(signUpUsingGooglePage.reCAPTCHA));
		Thread.sleep(2500);
		signUpUsingGooglePage.clickOnElement(signUpUsingGooglePage.iAmNotRobot);
		Thread.sleep(5000);
		getDriver().switchTo().defaultContent();
		Thread.sleep(5000);
		signUpUsingGooglePage.clickOnElement(signUpUsingGooglePage.createAccountButton);
		Thread.sleep(15000);
		*/
		
		//Sign in using Google Account
		signinUsingGooglePage.writeTextOnElement(signinUsingGooglePage.email, "mahbub.stc0510@gmail.com");
		Thread.sleep(2500);
		signinUsingGooglePage.writeTextOnElement(signinUsingGooglePage.password, "Mahbub@220519");
		Thread.sleep(2500);
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scroll(0,300)");
		Thread.sleep(2500);
		signinUsingGooglePage.clickOnElement(signinUsingGooglePage.signin);
		Thread.sleep(2000);
		//Go to Humayan Ahmed's Page one
		homePage.moveToElement(homePage.authors);
		Thread.sleep(2500);
		homePage.clickOnElement(homePage.humayon_Ahmed);
		Thread.sleep(2500);
		js.executeScript("window.scroll(0,500)");
        Thread.sleep(2500);
        humayanAhmedBooksPages.clickOnElement(humayanAhmedBooksPages.somokalinUpponash);
        Thread.sleep(2500);
        js.executeScript("window.scroll(0,500)");
        Thread.sleep(2500);
        humayanAhmedBooksPages.clickOnElement(humayanAhmedBooksPages.RochonaSonkolonOSomogro);
        Thread.sleep(2500);
        //js.executeScript("arguments[0].scrollIntoView(true);", humayanAhmedBooksPages.getElement(humayanAhmedBooksPages.pageTwo));
        js.executeScript("window.scroll(0,6000)");
        Thread.sleep(2500);
        humayanAhmedBooksPages.clickOnElement(humayanAhmedBooksPages.pageTwo);
        Thread.sleep(2500);
        js.executeScript("window.scroll(0,500)");
        Thread.sleep(2500);
        
        //Go to Humayan Ahmed's Page two
        humayanAhmedBooksPagesTwo.moveToElement(humayanAhmedBooksPagesTwo.book);
        Thread.sleep(2500);
        humayanAhmedBooksPagesTwo.clickOnElement(humayanAhmedBooksPagesTwo.addToCart);
        Thread.sleep(2500);
        humayanAhmedBooksPagesTwo.clickOnElement(humayanAhmedBooksPagesTwo.clickCardIcon);
        Thread.sleep(4500);
        
        //cart page
        js.executeScript("window.scroll(0,550)");
        Thread.sleep(2500);
        cartPage.clickOnElement(cartPage.placeOrder);
        Thread.sleep(2500);
        
        //Shipping Page
        shippingPage.writeTextOnElement(shippingPage.alterPhoneNumber, "01710134150");
        Thread.sleep(2500);
        Select select = new Select(shippingPage.getElement(shippingPage.city));
        select.selectByVisibleText("রাজশাহী");
        Thread.sleep(2500);
        shippingPage.writeTextOnElement(shippingPage.address, "200 Sardarpara Bhangura, Pabna");
        Thread.sleep(2500);
        js.executeScript("window.scroll(0,800)");
        Thread.sleep(2500);
        shippingPage.clickOnElement(shippingPage.ssl);
        Thread.sleep(2500);
        assertEquals(getDriver().getTitle(), shippingPage.ShippingPage_Title);
        System.out.println("Congratualations! My assignment is done");
        
	}
}
