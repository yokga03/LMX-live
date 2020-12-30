package lmxscripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lmxpages.Loginpage;
import wdMethods.ProjectMethods;

public class Smoketest extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
	testCaseName = "Smoke test";
	testDescription = "LMX Project";
	testNodes = "Login";
	authors ="Yokga";
	category="sanity";
	dataSheetName = "smoketest2";
	}
	
	@Test(dataProvider="fetchData")
	public void Businessflow1(String uname,String pwd) throws InterruptedException {
	new Loginpage()
	.typeUsername(uname)
	.typePassword(pwd)
	.clickLoginD()
	.ClickBillboarddropdown()
	.clickBillboardslist()
	.ClickDigitallist()
	.Backtodashboard()
	.clickAddbillboard()
	.Backtodashboard()
	.clickPlancampaign()
	.clickContenthub1()
	.clickConfigure();


}
}
