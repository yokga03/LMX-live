package lmxpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import wdMethods.ProjectMethods;



public class Licenseclassic extends ProjectMethods{

	public Licenseclassic() {
		PageFactory.initElements(driver, this);
	}
	
	//enter Licensenoclassic
	@FindBy(id="username")
	WebElement Licensenoclassic;
	public Licenseclassic typeLicensenoclassic(String data) throws InterruptedException {
		Thread.sleep(1000);
		type(Licensenoclassic, data);
		return this;
	}
	//enter Licenseauthorityclassic
	@FindBy(id="password")
	WebElement Licenseauthorityclassic;
	public Licenseclassic typeLicenseauthorityclassic(String data)  {
		type(Licenseauthorityclassic, data);
		return this;
	}

	//click Issuedateclassic
	@FindBy(xpath="//strong[text()='Apply']")
	WebElement Issuedateclassic;
	public Licenseclassic clickIssuedateclassic() throws InterruptedException {
		click(Issuedateclassic);
		return this;
	}
	//click Expirydateclassic
	@FindBy(xpath="//strong[text()='Apply']")
	WebElement Expirydateclassic;
	public Licenseclassic clickExpirydateclassic() throws InterruptedException {
		click(Expirydateclassic);
		return this;
		
	}

	//click Savelicenseclassic
	@FindBy(xpath="//button[text()=' Save & Proceed ']")
	WebElement Savelicenseclassic;
	public Addmediaclassic clickSavelicenseclassic() throws InterruptedException {
		Thread.sleep(2000);	
		click(Savelicenseclassic);
		return new Addmediaclassic();
	}
	
	//click Backlicenseclassic
	@FindBy(xpath="//strong[text()='Apply']")
	WebElement Backlicenseclassic;
	public Specificationclassic clickBacklicenseclassic() throws InterruptedException {
		Thread.sleep(2000);	
		click(Backlicenseclassic);
		return new Specificationclassic();
	}		

}
