package lmxpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import wdMethods.ProjectMethods;

public class Addmediaclassic extends ProjectMethods {

	public Addmediaclassic() {
		PageFactory.initElements(driver, this);
	}
	
	//click Backlicenseclassic
	@FindBy(xpath="//strong[text()='Apply']")
	WebElement Backlicenseclassic;
	public Addmediaclassic clickBacklicenseclassic() throws InterruptedException {
		Thread.sleep(2000);	
		click(Backlicenseclassic);
		return new Addmediaclassic();
	}		

	//click Saveaddmediaclassic
	@FindBy(xpath="//button[text()=' Save & Proceed ']")
	WebElement Saveaddmediaclassic;
	public Ratesclassic clickSaveaddmediaclassic() throws InterruptedException {
		Thread.sleep(3000);	
		click(Saveaddmediaclassic);
		return new Ratesclassic();
	}

}
