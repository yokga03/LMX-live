package lmxscripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lmxpages.Loginpage;
import wdMethods.ProjectMethods;

public class BusinessFlow2 extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
	testCaseName = "BusinessFlow 2";
	testDescription = "LMX Project";
	testNodes = "Campaign Flow";
	authors ="Yokga";
	category="sanity";
	dataSheetName = "Campaigndata";
	}
	
	@Test(dataProvider="fetchData")
	public void Businessflow2(String uname,String pwd,String data1, String data2,String data3, String data4) throws InterruptedException {
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
	.ClickSchedule()
	.ClickStartschedule()
	.clickNextschedule()
	.typeDailybudget(data2)
	.typeFixbid(data3)
	.typeDomain(data4)
	.clickAddtargeting()
	.clickGeography()
	.clickAddgeography()
	.clickNextmobileschedule()
	.clickDonemobileschedule();
	
	
	
	

}
}
