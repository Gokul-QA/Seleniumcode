package Commonfunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Readproperties {
	public static Properties prop=null;
	public static WebDriver driver=null;
	public Properties loadfile() throws IOException {
		FileInputStream file=new FileInputStream("config.Properties");
		prop=new Properties();
		prop.load(file);
		return prop;

	}
	@Before
	public void launchbrowser() throws IOException {
		loadfile();
		String browser=prop.getProperty("browser");
		String URL=prop.getProperty("URL");
		String driverlocation=prop.getProperty("driverlocation");
		if(browser.equalsIgnoreCase("Chrome")){
			System.setProperty("wedriver.chrome.driver", driverlocation);
			driver=new ChromeDriver();
		}
		driver.get(URL);
		driver.manage().window().maximize();
	}
	@After
	public void closebrowser() {
		driver.quit();

	}

}
