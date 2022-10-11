package demo.actitime.testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import demo.actitime.generic.BaseClass;
import demo.actitime.generic.FileLib;
import demo.actitime.pom.EnterTimeTrack;
import demo.actitime.pom.TaskListPage;

@Listeners(demo.actitime.generic.ListenerImplementation.class)
public class TestDataDemo extends BaseClass {
	@Test
	public void createCust() throws IOException, InterruptedException
	{
		EnterTimeTrack e=new EnterTimeTrack(driver);
		e.getTasklink().click();
		TaskListPage tl=new TaskListPage(driver);
		tl.getAddNewOp().click();
		tl.getNewCustomerLink().click();
		FileLib f=new FileLib();
		String expCustName = f.getExcelData("createcustomer", 1, 2);
		String desc=f.getExcelData("createcustomer", 1, 3);
		tl.getEnterCustTxtbx().sendKeys(expCustName);
		tl.getEnterCustDesc().sendKeys(desc);
		tl.getSelectCustometOp().click();
		tl.getOurCompanyOp().click();
		tl.getCreateCustBTn().click();
		Thread.sleep(4000);
		Assert.assertEquals(tl.getActualCustCreated().getText(), expCustName);
	}

}
