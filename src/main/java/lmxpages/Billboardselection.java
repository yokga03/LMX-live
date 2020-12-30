package lmxpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Billboardselection extends ProjectMethods{

	public Billboardselection() {
		PageFactory.initElements(driver, this);
	}
	
	//click Classicbillboard
	@FindBy(xpath="//input[@name='optradio']")
	WebElement Classicbillboard;
	public Billboardselection clickClassicbillboard() throws InterruptedException {
		click(Classicbillboard);
		Thread.sleep(1000);
		return this;
	}  
	
	//click Digitalbillboard
	@FindBy(xpath="//label[text()='Classic Street Furniture ']/following::input")
	WebElement Digitalbillboard;
	public Billboardselection clickDigitalbillboard() throws InterruptedException {
		click(Digitalbillboard);
		Thread.sleep(1000);
		return this;
	}
	
	//Click Continuedigital
	@FindBy(xpath="//button[text()='Proceed']")
	WebElement Continuedigital;
	public Adddigital clickContinuedigital() throws InterruptedException {	
		click(Continuedigital);
		Thread.sleep(2000);
		return new Adddigital();
	}	

	//Click Continueclassic
	@FindBy(xpath="//button[text()='Proceed']")
	WebElement Continueclassic;
	public Addclassic clickContinueclassic() throws InterruptedException {
		Thread.sleep(4000);	
		click(Continueclassic);
		return new Addclassic();
	}	
	
	//Click Backtodashboard
	@FindBy(xpath="//span[text()='Dashboard']")
	WebElement Backtodashboard;
	public Dashboard Backtodashboard() throws InterruptedException {
		Thread.sleep(2000);	
		click(Backtodashboard);
		return new Dashboard();
	}

	

}
