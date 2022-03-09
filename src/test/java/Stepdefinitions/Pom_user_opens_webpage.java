package Stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_user_opens_webpage {
	public static WebDriver driver;
	
	


@FindBy (id="username")
	private WebElement username;
	
public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLogin() {
	return login;
}

@FindBy(id="password")
private WebElement password;

@FindBy(id="login")

private WebElement login;

public Pom_user_opens_webpage(WebDriver driver2){
	this.driver=driver2;
	PageFactory.initElements(driver2, this);
}
}
