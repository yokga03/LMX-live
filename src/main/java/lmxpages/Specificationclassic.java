package lmxpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import wdMethods.ProjectMethods;

public class Specificationclassic extends ProjectMethods {

	public Specificationclassic() {
		PageFactory.initElements(driver, this);
	}

	//enter Nofacespecificationclassic
	@FindBy(name="faces")
	WebElement Nofacespecificationclassic;
	public Specificationclassic typeNofacespecificationclassic(String noface)  {
		type(Nofacespecificationclassic, noface);
		return this;
	}

	//enter Panelwidthspecificationclassic
	@FindBy(name="panelWidth")
	WebElement Panelwidthspecificationclassic;
	public Specificationclassic typePanelwidthspecificationclassic(String width) throws InterruptedException {
		Thread.sleep(1000);
		type(Panelwidthspecificationclassic, width);
		return this;
	}
	//enter Panelheightspecificationclassic
	@FindBy(name="panelHeight")
	WebElement Panelheightspecificationclassic;
	public Specificationclassic typePanelheightspecificationclassic(String height)  {
		type(Panelheightspecificationclassic, height);
		return this;
	}

	//Click Panelformatclassic
	@FindBy(xpath="//a[@href='#/reset/request']")
	WebElement Panelformatclassic;
	public Specificationclassic ClickPanelformatclassic() throws InterruptedException {
		click(Panelformatclassic);
		Thread.sleep(1000);
		return this;	
	}

	//Click Boardpositionclassic
	@FindBy(xpath="//a[@href='#/reset/request']")
	WebElement Boardpositionclassic;
	public Specificationclassic ClickBoardpositionclassic() throws InterruptedException {
		click(Boardpositionclassic);
		Thread.sleep(1000);
		return this;	
	}

	//enter Viewdistanceclassic
	@FindBy(name="distance")
	WebElement Viewdistanceclassic;
	public Specificationclassic typeViewdistanceclassic(String viewd) throws InterruptedException {
		Thread.sleep(1000);
		type(Viewdistanceclassic, viewd);
		return this;
	}

	//click Illuminationclassic
	@FindBy(xpath="//button[@class='btn login-button']")
	WebElement Illuminationclassic;
	public Specificationclassic clickIlluminationclassic() {
		click(Illuminationclassic);
		return this;
	}


	//click Backspecificationclassic
	@FindBy(xpath="//strong[text()='Apply']")
	WebElement Backspecificationclassic;
	public Specificationclassic clickBackspecificationclassic() throws InterruptedException {
		Thread.sleep(2000);	
		click(Backspecificationclassic);
		return new Specificationclassic();
	}		

	//click Savespecificationclassic
	@FindBy(xpath="//button[text()=' Save & Proceed ']")
	WebElement Savespecificationclassic;
	public Licenseclassic clickSavespecificationclassic() throws InterruptedException {
		Thread.sleep(2000);	
		click(Savespecificationclassic);
		return new Licenseclassic();
	}

}
