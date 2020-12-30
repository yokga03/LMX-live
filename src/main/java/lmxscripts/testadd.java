package lmxscripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lmxpages.Loginpage;
import wdMethods.ProjectMethods;

public class testadd extends ProjectMethods{

	
	@BeforeTest
	public void setData() {
	testCaseName = "testadd";
	testDescription = "LMX Project";
	testNodes = "Add testboard";
	authors ="Yokga";
	category="sanity";
	dataSheetName = "testaddboard";
	}
	
	@Test(dataProvider="fetchData")
	public void SmokeTest1(String uname,String pwd,String location) throws InterruptedException {
	new Loginpage()
	.typeUsername(uname)
	.typePassword(pwd)
	.clickLoginD()
	.ClickBillboarddropdown()
	.clickAddbillboard()
	.clickClassicbillboard()
	.clickContinueclassic()
	.typesearchLocationclassic(location)
	.indexsearchLocationclassic1(2)
	.indexCategoryclassic(0);
	
	}

}
