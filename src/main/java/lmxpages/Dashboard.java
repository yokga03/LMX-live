package lmxpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Dashboard extends ProjectMethods {

	public Dashboard () {
		PageFactory.initElements(driver, this);

	}
	 
	//Click Billboarddropdown
	@FindBy(xpath="//a[@ngbtooltip='Billboard']")
	WebElement Billboarddropdown;
	public Dashboard ClickBillboarddropdown() throws InterruptedException {
		click(Billboarddropdown);
		Thread.sleep(1000);
		return this;
	} 
	
	//Click Billboardslist
	@FindBy(xpath="//span[text()='Billboard List']")
	WebElement Billboardslist;
	public Mybillboards clickBillboardslist() throws InterruptedException {
		Thread.sleep(2000);	
		click(Billboardslist);
		return new Mybillboards();
	}
	
	//Click Addbillboard
	@FindBy(xpath="//span[text()='Add Billboard']")
	WebElement Addbillboard;
	public Billboardselection clickAddbillboard() throws InterruptedException {
		Thread.sleep(2000);	
		click(Addbillboard);
		return new Billboardselection();
	}
	
	//Click Importbillboard
	@FindBy(xpath="//span[text()='Import Billboards']")
	WebElement Importbillboard;
	public Importbillboard clickImportbillboard() throws InterruptedException {
		Thread.sleep(2000);	
		click(Importbillboard);
		return new Importbillboard();
	}
	//Click Setpreferences
	@FindBy(xpath="//span[text()='Set Preferences']")
	WebElement Setpreferences;
	public Setpreferences clickSetpreferences() throws InterruptedException {
		Thread.sleep(2000);	
		click(Setpreferences);
		return new Setpreferences();
	}
	
	//Click Plancampaign 
	@FindBy(xpath="//a[@ngbtooltip='Plan a Campaign']")
	WebElement Plancampaign;
	public Dashboard clickPlancampaign() throws InterruptedException {
		click(Plancampaign);
		Thread.sleep(2000);
		return this;
	}
	
	//Click Expertmode
	@FindBy(xpath="//span[contains(.,'Expert ModeFor fine tuning. Takes time.')]")
	WebElement Expertmode;
	public Expertmode ClickExpertmode() throws InterruptedException {
		click(Expertmode);
		Thread.sleep(1000);
		return new Expertmode();
	}

	//Click Expressmode
	@FindBy(xpath="//span[contains(.,'Express ModeQuick step for digital sites only.')]")
	WebElement Expressmode;
	public Expressmode ClickExpressmode() throws InterruptedException {
		click(Expressmode);
		Thread.sleep(1000);
		return new Expressmode();
	}
	
	//Click Allcampaign
	@FindBy(xpath="//span[text()='All Campaigns']")
	WebElement Allcampaign;
	public Allcampaign ClickAllcampaign() throws InterruptedException {
		click(Allcampaign);
		Thread.sleep(2000);
		return new Allcampaign();
	}
	
	//Click Contenthubdropdown
	@FindBy(xpath="(//a[@ngbtooltip='Billboard'])[2]")
	WebElement Contenthubdropdown;
	public Contenthub clickContenthubdropdown() throws InterruptedException {
		Thread.sleep(2000);	
		click(Contenthubdropdown);
		return new Contenthub();
	}
	//Click Contenthub1
	@FindBy(xpath="(//a[@ngbtooltip='Billboard'])[2]")
	WebElement Contenthub1;
	public Dashboard clickContenthub1() throws InterruptedException {
		click(Contenthub1);
		Thread.sleep(2000);	
		return this;
	}
	
	
	//Click Configure
	@FindBy(xpath="//a[@ngbtooltip='Configure']")
	WebElement Configure;
	public Configuredropdown clickConfigure() throws InterruptedException {
		Thread.sleep(2000);	
		click(Configure);
		return new Configuredropdown();
	}
	
	//Click Closemainmenu
	@FindBy(xpath="//i[contains(@class,'fa fa-times')]")
	WebElement Closemainmenu;
	public Dashboard clickClosemainmenu() throws InterruptedException {
		click(Closemainmenu);
		Thread.sleep(2000);	
		return this;
	}

	//Click Openmainmenu
	@FindBy(xpath="//i[contains(@class,'fa fa-angle-right')]")
	WebElement Openmainmenu;
	public Dashboard clickOpenmainmenu() throws InterruptedException {
		click(Openmainmenu);
		Thread.sleep(2000);	
		return this;
	}

}
