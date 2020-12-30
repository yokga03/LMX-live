package lmxpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Defaultpreferences extends ProjectMethods{

	public Defaultpreferences() {
		PageFactory.initElements(driver, this);
	}
	
	//click Billboardtype
	@FindBy(id="media-dropdown")
	WebElement Billboardtype;
	public Defaultpreferences clickBillboardtype() throws InterruptedException {
		Thread.sleep(2000);	
		click(Billboardtype);
		return this;
	}
		
	//click Billboardtypeclassic
	@FindBy(xpath="//button[text()='CLASSIC']")
	WebElement Billboardtypeclassic;
	public Defaultclassic clickBillboardtypeclassic() throws InterruptedException {
		Thread.sleep(2000);	
		click(Billboardtypeclassic);
		return new Defaultclassic();
	}

}
