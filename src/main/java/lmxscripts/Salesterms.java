package lmxscripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lmxpages.Loginpage;
import wdMethods.ProjectMethods;

public class Salesterms extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
	testCaseName = "Smoke Test 1";
	testDescription = "LMX Project";
	testNodes = "Import";
	authors ="Yokga";
	category="sanity";
	dataSheetName = "smoketest1";
	}
	
	@Test(dataProvider="fetchData")
	public void SmokeTest1(String uname,String pwd,String location,String boardname,String displayname,String numface,String width,String height, String view) throws InterruptedException {
	new Loginpage()
	.typeUsername(uname)
	.typePassword(pwd)
	.clickLoginD()
	.clickConfigure()
	.clickSaleterms();
	

}
}