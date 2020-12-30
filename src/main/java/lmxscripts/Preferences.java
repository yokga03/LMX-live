package lmxscripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lmxpages.Loginpage;
import wdMethods.ProjectMethods;

public class Preferences extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
	testCaseName = "Smoke Test 1";
	testDescription = "LMX Project";
	testNodes = "Preferences";
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
	.clickConfigure()
	.clickSaleterms();

}
}