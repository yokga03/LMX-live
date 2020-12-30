package lmxscripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lmxpages.Loginpage;
import wdMethods.ProjectMethods;

public class AddBillboarddigital extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
	testCaseName = "Smoketest 4";
	testDescription = "LMX Project";
	testNodes = "Add Digitalbillboard";
	authors ="Yokga";
	category="sanity";
	dataSheetName = "smoketest2";
	}
	
	@Test(dataProvider="fetchData")
	public void SmokeTest1(String uname,String pwd,String location, String boardname, String dsiplayname) throws InterruptedException {
	new Loginpage()
	.typeUsername(uname)
	.typePassword(pwd)
	.clickLoginD()
	.ClickBillboarddropdown()
	.clickAddbillboard()
	.clickDigitalbillboard()
	.clickContinuedigital()
	.typeSearchlocationdigital(location)
	.typeBoardnamedigital(boardname)
	.typeDisplaynamedigital(dsiplayname);
	
	
	
	

	}
}
