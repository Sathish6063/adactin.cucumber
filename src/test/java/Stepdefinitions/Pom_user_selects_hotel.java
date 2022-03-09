package Stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_user_selects_hotel {
	
	public static WebDriver driver;
	

	
	@FindBy(id="location")
	private WebElement location;
	
	
	public WebElement getLocation() {
		return location;
	}


	public WebElement getHotels() {
		return hotels;
	}


	public WebElement getRoom_type() {
		return room_type;
	}


	public WebElement getRoom_nos() {
		return room_nos;
	}


	public WebElement getCheckin() {
		return checkin;
	}


	public WebElement getCheckout() {
		return checkout;
	}


	public WebElement getAdult_room() {
		return adult_room;
	}


	public WebElement getSearch() {
		return search;
	}


	public WebElement getSelecthotel() {
		return selecthotel;
	}


	public WebElement getContinuee() {
		return continuee;
	}


	@FindBy(id="hotels")
	private WebElement hotels;
	
	 @FindBy (id="room_type")
	 private WebElement room_type;
	 
	 @FindBy (id="room_nos")
	 private WebElement room_nos;
	 
	 @FindBy (xpath="//input[@id='datepick_in']")
	 private WebElement checkin;
	 
	 
	 @FindBy (id="datepick_out")
	 private WebElement checkout;
	 
	 @FindBy (id="adult_room")
	 private WebElement adult_room;
	 
	 @FindBy(xpath="//input[@id='Submit']")
	 private WebElement search;
	 
	 @FindBy (id="radiobutton_0")
	 private WebElement selecthotel;
	 
	 @FindBy (id="continue")
	 private WebElement continuee;
	 
	 
public Pom_user_selects_hotel(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver2, this);
}
	 
	 
	
	
	}


