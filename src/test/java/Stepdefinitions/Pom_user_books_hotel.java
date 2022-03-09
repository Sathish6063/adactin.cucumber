package Stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_user_books_hotel {

	public static WebDriver driver;

	public WebElement getFirst_name() {
		return first_name;
	}




	public WebElement getLast_name() {
		return last_name;
	}




	public WebElement getAddress() {
		return address;
	}




	public WebElement getCc_num() {
		return cc_num;
	}




	public WebElement getCc_type() {
		return cc_type;
	}




	public WebElement getCcexpirymonth() {
		return ccexpirymonth;
	}




	public WebElement getCcexpiryyear() {
		return ccexpiryyear;
	}




	public WebElement getCvv() {
		return cvv;
	}




	public WebElement getBook_now() {
		return book_now;
	}




	@FindBy (id="first_name")
	private WebElement first_name;

	@FindBy (id="last_name")
	private WebElement last_name;

	@FindBy (id="address")
	private WebElement address;

	@FindBy (id="cc_num")
	private WebElement cc_num;

	@FindBy (id="cc_type")
	private WebElement cc_type;

	@FindBy (id="cc_exp_month")
	private WebElement ccexpirymonth;

	@FindBy (id="cc_exp_year")
	private WebElement ccexpiryyear;

	@FindBy (id="cc_cvv")
	private WebElement cvv;

	@FindBy (id="book_now")
	private WebElement book_now;




	public Pom_user_books_hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);




	}
}
