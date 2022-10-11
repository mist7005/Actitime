package demo.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
@FindBy(xpath="//div[text()='Add New']")
private WebElement addNewOp;
@FindBy(xpath="//div[text()='+ New Customer']")
private WebElement newCustomerLink;
@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class]")
private WebElement enterCustTxtbx;
@FindBy(xpath="//textarea[@placeholder='Enter Customer Description' and @class]")
private WebElement enterCustDesc;
@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
private WebElement selectCustometOp;
@FindBy(xpath="//div[@class='searchItemList']/div[text()='Our company']")
private WebElement ourCompanyOp;
@FindBy(xpath="//div[text()='Create Customer']")
private WebElement createCustBTn;

@FindBy(xpath="//div[@id='taskListBlock']//div[@class='titleEditButtonContainer']/div[@class='title']")
private WebElement actualCustCreated;

public TaskListPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public WebElement getAddNewOp() {
	return addNewOp;
}

public WebElement getNewCustomerLink() {
	return newCustomerLink;
}

public WebElement getEnterCustTxtbx() {
	return enterCustTxtbx;
}

public WebElement getEnterCustDesc() {
	return enterCustDesc;
}

public WebElement getSelectCustometOp() {
	return selectCustometOp;
}

public WebElement getOurCompanyOp() {
	return ourCompanyOp;
}

public WebElement getCreateCustBTn() {
	return createCustBTn;
}

public WebElement getActualCustCreated() {
	return actualCustCreated;
}

}
