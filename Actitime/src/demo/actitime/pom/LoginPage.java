package demo.actitime.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import demo.actitime.generic.FileLib;

public class LoginPage {
@FindBy(id="username")
private WebElement untbx;
@FindBy(name="pwd")
private WebElement pwtbx;
@FindBy(xpath="//div[text()='Login ']")
private WebElement lgbtn;

public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void setLogin(String un,String pw) throws IOException
{
	untbx.sendKeys(un);
	pwtbx.sendKeys(pw);
	lgbtn.click();
}
}
