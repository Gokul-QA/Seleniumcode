package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Test {

	public static void main(String[] args) {
		ExtentSparkReporter reporter=new ExtentSparkReporter("report.html");
		ExtentReports reports=new ExtentReports();
		ExtentTest test=reports.createTest("test");
		reports.attachReporter(reporter);
		System.setProperty("webdriver.chrome.driver","/home/schnell/Downloads/chromedriver_version 97/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		test.pass("ts");
		driver.quit();
		reports.flush();

	}

}
