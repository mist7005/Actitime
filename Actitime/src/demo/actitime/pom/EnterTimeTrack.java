package demo.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrack {
@FindBy(id="logoutLink")
private WebElement lglink;
@FindBy(id="container_tasks")
private WebElement tasklink;
public EnterTimeTrack(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public WebElement getLglink() {
	return lglink;
}
public WebElement getTasklink() {
	return tasklink;
}

}
