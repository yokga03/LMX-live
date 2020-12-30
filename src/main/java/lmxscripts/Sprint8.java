package lmxscripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lmxpages.Loginpage;
import wdMethods.ProjectMethods;

public class Sprint8 extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
	testCaseName = "Sprint 8one";
	testDescription = "LMX Project";
	testNodes = "Regression test";
	authors ="Yokga";
	category="sanity";
	dataSheetName = "";
	}
	
	@Test(dataProvider="fetchData")
	public void SmokeTest1(String uname,String pwd) throws InterruptedException {
	new Loginpage()
	.typeUsername(uname)
	.typePassword(pwd)
	.clickLoginD();
	
	
	
	
	

	}
}
