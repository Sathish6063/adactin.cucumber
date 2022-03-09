package Stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.cucumber.Base2;

import Properties.Adactin_FileReaderManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef extends Base2{

	
	

	@Given("user launches browser and opens webpage")
	public void user_launches_browser_and_opens_webpage() throws Throwable {

		driver.manage().window().maximize();
		
		getUrl(Adactin_FileReaderManager.propfile().config().geturl());
		
		Thread.sleep(2000);
			
	}
	
	Pom_user_opens_webpage pom1= new Pom_user_opens_webpage(driver);
	
	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() throws Throwable {
		sendkey(pom1.getUsername(),Adactin_FileReaderManager.propfile().config().getusernmae());

		Thread.sleep(2000);

		sendkey(pom1.getPassword(), Adactin_FileReaderManager.propfile().config().getpassword());;

		Thread.sleep(2000);
	}

	@Then("clicks login")
	public void clicks_login() {
		click(pom1.getLogin());
	}
	
	Pom_user_selects_hotel pom2= new Pom_user_selects_hotel(driver);
	

	@Given("user selects desired location")
	public void user_selects_desired_location() {
		WebElement location=pom2.getLocation();
		selectByIndex(location, 4);
	}

	@Given("hotel")
	public void hotel() {
		WebElement hotel=pom2.getHotels();
		selectByIndex(hotel, 3);
	}

	@Given("room type")
	public void room_type() {
		WebElement roomtype=pom2.getRoom_type();
		selectByIndex(roomtype, 1);
	}

	@Given("number of rooms")
	public void number_of_rooms() {
		WebElement roomnos=pom2.getRoom_nos();
		selectByIndex(roomnos, 1);
	}

	@Given("check in date")
	public void check_in_date() {
		clear(pom2.getCheckin());

		sendkey(pom2.getCheckin(), "12/03/2022");
	}

	@Given("check out date")
	public void check_out_date() {
		clear(pom2.getCheckout());

		sendkey(pom2.getCheckout(), "20/03/2022");
	}

	@Given("adults per room")
	public void adults_per_room() {
		WebElement adults=pom2.getAdult_room();
		selectByIndex(adults, 2);
	}

	@Given("user clicks search")
	public void user_clicks_search() {
		click(pom2.getSearch());
	}

	@Given("user select the hotel")
	public void user_select_the_hotel() throws Throwable {
		click(pom2.getSelecthotel());
		Thread.sleep(2000);
	}

	@Then("user clicks continue")
	public void user_clicks_continue() {
		click(pom2.getContinuee());
	}
	
	Pom_user_books_hotel pom3= new Pom_user_books_hotel(driver);

	@Given("user inputs name")
	public void user_inputs_name() throws Throwable {
		sendkey(pom3.getFirst_name(),Adactin_FileReaderManager.propfile().config().getFirstname());
		Thread.sleep(2000);

		sendkey(pom3.getLast_name(),Adactin_FileReaderManager.propfile().config().getLastname());
		Thread.sleep(2000);
	}

	@When("user inputs adress")
	public void user_inputs_adress() throws Throwable {
		sendkey(pom3.getAddress(),Adactin_FileReaderManager.propfile().config().getAdress());
		Thread.sleep(2000);

	}

	@When("card number")
	public void card_number() throws Throwable {
		sendkey(pom3.getCc_num(),Adactin_FileReaderManager.propfile().config().getCardnumber());
		Thread.sleep(2000);

	}

	@When("card type")
	public void card_type() throws Throwable {
		WebElement cardtype=pom3.getCc_type();
		selectByvisible(cardtype, "American Express");
		Thread.sleep(2000);

	}

	@When("card expire month")
	public void card_expire_month() throws Throwable {
		WebElement month=pom3.getCcexpirymonth();
		selectByvisible(month, "December");
		Thread.sleep(2000);

	}

	@When("card expire year")
	public void card_expire_year() {
		WebElement year=pom3.getCcexpiryyear();
		selectByvisible(year, "2022");
	}

	@When("enter cvv")
	public void enter_cvv() throws Throwable {
		sendkey(pom3.getCvv(),Adactin_FileReaderManager.propfile().config().getCVV());
		Thread.sleep(2000);

	}

	@Then("clicks Book now")
	public void clicks_book_now() throws Throwable {
		click(pom3.getBook_now());
		Thread.sleep(10000);
	}
	
	Pom_user_cancels_booking pom4= new Pom_user_cancels_booking(driver);

	@Given("user clicks on booked itenary")
	public void user_clicks_on_booked_itenary() {
		click(pom4.getItinenary());
	}

	@When("user clicks the booked they want to cancel")
	public void user_clicks_the_booked_they_want_to_cancel() throws InterruptedException {
		click(pom4.getBooking1());
		Thread.sleep(1000);

		click(pom4.getBooking2());
		Thread.sleep(1000);


		click(pom4.getBooking3());

		Thread.sleep(2000);
	}

	@Then("clicks cancel selected")
	public void clicks_cancel_selected() throws Throwable {
		
		click(pom4.getCancels());
		Thread.sleep(2000);
	}

	@Then("user clicks ok and cancels the book")
	public void user_clicks_ok_and_cancels_the_book() throws Throwable {
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		click(pom4.getLogout());
		Thread.sleep(2000);
		driver.quit();
	}



}


