package lmxpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;



public class Ratesclassic extends ProjectMethods{

	public Ratesclassic() {
		PageFactory.initElements(driver, this);
	}
	
	//click Backlicenseclassic
	@FindBy(xpath="//strong[text()='Apply']")
	WebElement Backlicenseclassic;
	public Ratesclassic clickBacklicenseclassic() throws InterruptedException {
		Thread.sleep(2000);	
		click(Backlicenseclassic);
		return new Ratesclassic();
	}		
			
	//click Saveratesclassic
	@FindBy(xpath="//button[text()=' Save & Proceed ']")
	WebElement Saveratesclassic;
	public Mybillboards clickSaveratesclassic() throws InterruptedException {
		Thread.sleep(2000);	
		click(Saveratesclassic);
		return new Mybillboards();
	}

}
