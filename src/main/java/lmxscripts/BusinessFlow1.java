package lmxscripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lmxpages.Loginpage;
import wdMethods.ProjectMethods;

public class BusinessFlow1 extends ProjectMethods {

	@BeforeTest
	public void setData() {
	testCaseName = "Business Flow 1";
	testDescription = "LMX Project";
	testNodes = "Set up";
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
	.clickPlancampaign()
	.clickContenthub1()
	.clickConfigure();
	
	
	
	
	
	
	
	

}
}
