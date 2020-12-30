package lmxpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Configuredropdown extends ProjectMethods {

	public Configuredropdown() {
		PageFactory.initElements(driver, this);
	}
	
	//Click Import
	@FindBy(xpath="//a[contains(@class,'nav-link select-campaign-title')]")
	WebElement Import;
	public Importbillboard clickImport() throws InterruptedException {
		Thread.sleep(2000);	
		click(Import);
		return new Importbillboard();
	}
	
	
//	//Click Preferences
//	@FindBy(xpath="//span[text()='Preferences']")
//	WebElement Preferences;
//	public Defaultpreferences clickPreferences() throws InterruptedException {
//		Thread.sleep(2000);	
//		click(Preferences);
//		return new Defaultpreferences();
//	}

	
	//Click Proposal 
	@FindBy(xpath="//span[text()='Proposal']")
	WebElement Proposal;
	public Proposalvalidity clickProposal() throws InterruptedException {
		Thread.sleep(2000);	
		click(Proposal);
		return new Proposalvalidity();
	}


	//Click Saleterms
	@FindBy(xpath="//span[text()='Sale Terms']")
	WebElement Saleterms;
	public Sellingterms clickSaleterms() throws InterruptedException {
		Thread.sleep(2000);	
		click(Saleterms);
		return new Sellingterms();
	}
	
	//Click Orderform
	@FindBy(xpath="//a[contains(@class,'nav-link select-campaign-title')]")
	WebElement Orderform;
	public Orderform clickOrderform() throws InterruptedException {
		Thread.sleep(2000);	
		click(Orderform);
		return new Orderform();
	}

	//Click Agreement
	@FindBy(xpath="//a[contains(@class,'nav-link select-campaign-title')]")
	WebElement Agreement;
	public Agreement clickAgreement() throws InterruptedException {
		Thread.sleep(2000);	
		click(Agreement);
		return new Agreement();
	}

	//Click Termscondition
	@FindBy(xpath="//span[text()='Terms and Conditions']")
	WebElement Termscondition;
	public Termscondition clickTermscondition() throws InterruptedException {
		Thread.sleep(2000);	
		click(Termscondition);
		return new Termscondition();
	}

	//Click Backtodashboard
	@FindBy(xpath="//a[@container='body']//i")
	WebElement Backtodashboard;
	public Dashboard Backtodashboard() throws InterruptedException {
		Thread.sleep(2000);	
		click(Backtodashboard);
		return new Dashboard();
	}


}
