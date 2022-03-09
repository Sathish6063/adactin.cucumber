package Stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_user_cancels_booking {

	public static WebDriver driver;
	
	@FindBy (id="my_itinerary")
	private WebElement itinenary;
	

	public WebElement getItinenary() {
		return itinenary;
	}


	public WebElement getBooking1() {
		return booking1;
	}


	public WebElement getBooking2() {
		return booking2;
	}


	public WebElement getBooking3() {
		return booking3;
	}


	public WebElement getCancels() {
		return cancels;
	}


	public WebElement getLogout() {
		return logout;
	}


	@FindBy (xpath="//input[@value='569355']")
	private WebElement booking1;
	
	@FindBy (xpath="//input[@value='571522']")
	private WebElement booking2;
	
	@FindBy (xpath="//input[@value='570983']")
	private WebElement booking3;
	
	
	@FindBy (xpath="//input[@name='cancelall']")
	private WebElement cancels;
	
	@FindBy (id="logout")
	private WebElement logout;
	
	
	public Pom_user_cancels_booking(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}
}

