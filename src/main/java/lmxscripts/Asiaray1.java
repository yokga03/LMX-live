package lmxscripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lmxpages.Loginpage;
import wdMethods.ProjectMethods;

public class Asiaray1 extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
	testCaseName = "Asiaray Issues";
	testDescription = "LMX Project";
	testNodes = "Login";
	authors ="Yokga";
	category="sanity";
	dataSheetName = "asiaraydata";
	}
	
	@Test(dataProvider="fetchData")
	public void Asiarayautomation(String uname,String pwd,String data1) throws InterruptedException {
	new Loginpage()
	.typeUsername(uname)
	.typePassword(pwd)
	.clickLoginD()
	.clickPlancampaign()
	.ClickExpertmode()
	.clickDates()
	.clickSelect15days()
	.typeMobilebudget(data1)
	.ClickBrand()
	.ClickBrandtype()
	.ClickProduct()
	.ClickProducttype()
	.clickFindsite()
	.ClickAllcheckbox()
	.ClickAddtocart()
	.ClickCart()
	.ClickSchedule();
	

}
}
