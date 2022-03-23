package testCases;

import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import Commonfunctions.Readproperties;
import pageobject.pageobject;

public class Logintestcase extends Readproperties{
	@Test
	public void Login() {
		PageFactory.initElements(driver,pageobject.class);
		pageobject.userName.sendKeys(prop.getProperty("Username"));
		pageobject.password.sendKeys(prop.getProperty("Password"));
		pageobject.submit.click();
		
	}

}
