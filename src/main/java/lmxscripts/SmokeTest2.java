package lmxscripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lmxpages.Loginpage;
import wdMethods.ProjectMethods;

public class SmokeTest2 extends ProjectMethods{

	@BeforeTest
	public void setData() {
	testCaseName = "Sprint Feature";
	testDescription = "LMX Project";
	testNodes = "Gallery";
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
	.clickContenthubdropdown()
	.clickGallery();
	
	

	}
}
