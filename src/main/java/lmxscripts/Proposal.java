package lmxscripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lmxpages.Loginpage;
import wdMethods.ProjectMethods;

public class Proposal extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
	testCaseName = "Business Flow 2";
	testDescription = "LMX Project";
	testNodes = "Proposal";
	authors ="Yokga";
	category="sanity";
	dataSheetName = "smoketest2";
	}
	
	@Test(dataProvider="fetchData")
	public void Businessflow2(String uname,String pwd) throws InterruptedException {
	new Loginpage()
	.typeUsername(uname)
	.typePassword(pwd)
	.clickLoginD()
	.clickConfigure()
	.clickProposal();

}
}
