package lmxscripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lmxpages.Loginpage;
import wdMethods.ProjectMethods;

public class Sprint7 extends ProjectMethods {
	
	
	@BeforeTest
	public void setData() {
	testCaseName = "Sprint 7one";
	testDescription = "LMX Project";
	testNodes = "Regression test";
	authors ="Yokga";
	category="sanity";
	dataSheetName = "smoketest2";
	}
	
	@Test(dataProvider="fetchData")
	public void SmokeTest1(String uname,String pwd) throws InterruptedException {
	new Loginpage()
	.typeUsername(uname)
	.typePassword(pwd)
	.clickLoginD()
	.ClickBillboarddropdown()
	.clickAddbillboard()
	.clickClassicbillboard()
	.clickClassicbillboard()
	.clickContinueclassic()
	.ClickVenuetypeclassic();
	

}
}
