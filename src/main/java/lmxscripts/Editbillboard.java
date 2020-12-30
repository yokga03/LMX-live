package lmxscripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lmxpages.Loginpage;
import wdMethods.ProjectMethods;

public class Editbillboard extends ProjectMethods {
	
	
	@BeforeTest
	public void setData() {
	testCaseName = "Edit";
	testDescription = "LMX Project";
	testNodes = "Edit Billboard";
	authors ="Yokga";
	category="sanity";
	dataSheetName = "edit";
	}


	
	@Test(dataProvider="fetchData",invocationCount=1)
	public void Editbillboard(String uname,String pwd,String endtime) throws InterruptedException {
	new Loginpage()
	.typeUsername(uname)
	.typePassword(pwd)
	.clickLoginD()
	.ClickBillboarddropdown()
	.clickBillboardslist()
	.ClickDigitallist()
	.ClickLastpagebillboard()
	.ClickAction()
	.ClickEdit()
	.ClickConfiguration()
	.typeEndtime(endtime)
	.ClickSaveproceed()
	.ClickRates()
	.ClickSaveproceed2();
	
	
	
	
	
	
	
	
	
	

	
		
	}

}
