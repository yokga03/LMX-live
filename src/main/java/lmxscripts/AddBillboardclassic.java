package lmxscripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lmxpages.Loginpage;
import wdMethods.ProjectMethods;

public class AddBillboardclassic extends ProjectMethods {
	
	@BeforeTest
	public void setData() {
	testCaseName = "Addclassic";
	testDescription = "LMX Project";
	testNodes = "Add Classicbillboard";
	authors ="Yokga";
	category="sanity";
	dataSheetName = "classicdata";
	}
	
	@Test(dataProvider="fetchData")
	public void SmokeTest1(String uname,String pwd,String location,String boardname,String displayname,String noface,String width,String height,String viewd) throws InterruptedException {
	new Loginpage()
	.typeUsername(uname)
	.typePassword(pwd)
	.clickLoginD()
	.ClickBillboarddropdown()
	.clickAddbillboard()
	.clickClassicbillboard()
	.clickContinueclassic()
	.typesearchLocationclassic(location)
	.typeBoardnameclassic(boardname)
	.typeDisplaynameclassic(displayname)
	.indexCategoryclassic(1)
	.indexGroupclassic(1)
	.indexboardfacingclassic(1)
	.indexfacingclassic(0)
	.indexActiveclassic(1)
//	.indexAvailableclassic(0)
//	.indexAccesslassic(0)
	.clickSaveclassiclocation()
	.typeNofacespecificationclassic(noface)
	.typePanelwidthspecificationclassic(width)
	.typePanelheightspecificationclassic(height)
	.typeViewdistanceclassic(viewd)
	.clickSavespecificationclassic()
	.clickSavelicenseclassic()
	.clickSaveaddmediaclassic()
	.clickSaveratesclassic();
	
	
	
	

	

	
	
	

	}
}
