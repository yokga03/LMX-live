package lmxpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Specificationdigital extends ProjectMethods {

	public Specificationdigital() {
		PageFactory.initElements(driver, this);
	}

	//enter Noofpaneldigital
	@FindBy(xpath="//input[@ng-reflect-name='faces']")
	WebElement Noofpaneldigital;
	public Specificationdigital typeNoofpaneldigital(String panel)  {
		type(Noofpaneldigital, panel);
		return this;
	}
	
	//enter Noofscreendigital
	@FindBy(xpath="//input[@ng-reflect-name='faces']")
	WebElement Noofscreendigital;
	public Specificationdigital typeNoofscreendigital(String screen)  {
		type(Noofscreendigital, screen);
		return this;
	}

	//enter Panelwidthspecificationdigital
	@FindBy(xpath="//input[@ng-reflect-name='panelWidth']")
	WebElement Panelwidthspecificationclassic;
	public Specificationdigital typePanelwidthspecificationclassic(String width) throws InterruptedException {
		Thread.sleep(1000);
		type(Panelwidthspecificationclassic, width);
		return this;
	}
	//enter Panelheightspecificationdigital
	@FindBy(xpath="//input[@ng-reflect-name='panelHeight']")
	WebElement Panelheightspecificationclassic;
	public Specificationdigital typePanelheightspecificationclassic(String height)  {
		type(Panelheightspecificationclassic, height);
		return this;
	}

	//Click Panelformatdigital
	@FindBy(xpath="//a[@href='#/reset/request']")
	WebElement Panelformatclassic;
	public Specificationdigital ClickPanelformatclassic() throws InterruptedException {
		click(Panelformatclassic);
		Thread.sleep(1000);
		return this;	
	}

	//Click Boardpositiondigital
	@FindBy(xpath="//a[@href='#/reset/request']")
	WebElement Boardpositionclassic;
	public Specificationdigital ClickBoardpositionclassic() throws InterruptedException {
		click(Boardpositionclassic);
		Thread.sleep(1000);
		return this;	
	}

	//enter Viewdistancedigital
	@FindBy(xpath="//input[@ng-reflect-name='distance']")
	WebElement Viewdistanceclassic;
	public Specificationdigital typeViewdistanceclassic(String viewd) throws InterruptedException {
		Thread.sleep(1000);
		type(Viewdistanceclassic, viewd);
		return this;
	}

	//click Illuminationdigital
	@FindBy(xpath="//button[@class='btn login-button']")
	WebElement Illuminationclassic;
	public Specificationdigital clickIlluminationclassic() {
		click(Illuminationclassic);
		return this;
	}
  

	//click Backspecificationdigital
	@FindBy(xpath="//strong[text()='Apply']")
	WebElement Backspecificationdigital;
	public Specificationdigital clickBackspecificationdigital() throws InterruptedException {
		Thread.sleep(2000);	
		click(Backspecificationdigital);
		return new Specificationdigital();
	}		

	//click Savespecificationclassic
	@FindBy(xpath="//button[text()=' Save & Proceed ']")
	WebElement Savespecificationclassic;
	public Licensedigital clickSavespecificationclassic() throws InterruptedException {
		Thread.sleep(2000);	
		click(Savespecificationclassic);
		return new Licensedigital();
	}

}




