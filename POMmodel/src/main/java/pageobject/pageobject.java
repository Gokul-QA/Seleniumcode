package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pageobject {
	WebDriver driver;
	@FindBy(id="id_user_email")
	public static WebElement userName;
	@FindBy(id="id_password")
	public static WebElement password;
	@FindBy(id="sign_in_form")
	public static WebElement submit;
}
