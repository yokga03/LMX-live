package lmxscripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lmxpages.Loginpage;
import wdMethods.ProjectMethods;

public class AddBillboardnetwork extends ProjectMethods{
	
	
	@BeforeTest
	public void setData() {
	testCaseName = "Edit";
	testDescription = "LMX Project";
	testNodes = "Edit time";
	authors ="Yokga";
	category="sanity";
	dataSheetName = "networkdata";
	}
	
	@Test(dataProvider="fetchData")
	public void SmokeTest1(String uname,String pwd) throws InterruptedException {
	new Loginpage()
	.typeUsername(uname)
	.typePassword(pwd)
	.clickLoginD();
	
	

}
}
