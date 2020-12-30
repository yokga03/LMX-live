package lmxpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import wdMethods.ProjectMethods;

public class Billboarddropdown extends ProjectMethods {

	public Billboarddropdown() {
		// TODO Auto-generated constructor stub
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
	@FindBy(xpath="//a[@href='/lmx/billboards/add']//span[1]")
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

}
