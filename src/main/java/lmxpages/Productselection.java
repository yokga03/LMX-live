package lmxpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Productselection extends ProjectMethods{

	public Productselection() {
		PageFactory.initElements(driver, this);
	}
		
	//click Registry
	@FindBy(xpath="//p[text()='Manage your inventory and accounts']")
	WebElement Registry; 
	public Productselection clickRegistry() {
		click(Registry);
		return this;
	}

	//click Continue
	@FindBy(name="button")
	WebElement Continue;
	public Dashboard clickContinue() throws InterruptedException {
		Thread.sleep(2000);	
		click(Continue);
		return new Dashboard();
	}
		
		

}



