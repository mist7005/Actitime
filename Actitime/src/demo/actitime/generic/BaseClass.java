package demo.actitime.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.util.security.Password;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import demo.actitime.pom.EnterTimeTrack;
import demo.actitime.pom.LoginPage;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static WebDriver driver;
	@BeforeTest
	public void openBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
	@BeforeMethod
	public void login() throws IOException
	{
		FileLib l=new FileLib();
		String url = l.getPropertyData("url");
		String un = l.getPropertyData("username");
		String pw = l.getPropertyData("password");
		driver.get(url);
		LoginPage p=new LoginPage(driver);
		p.setLogin(un,pw);
		
	}
	@AfterMethod
	public void logout()
	{
		EnterTimeTrack t=new EnterTimeTrack(driver);
		t.getLglink().click();
	}
	
	
}
