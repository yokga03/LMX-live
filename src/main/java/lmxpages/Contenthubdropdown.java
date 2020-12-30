package lmxpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Contenthubdropdown extends ProjectMethods{

	public Contenthubdropdown() {
		PageFactory.initElements(driver, this);
	}
	
	//Click Gallery
	@FindBy(xpath="//span[text()='Gallery']")
	WebElement Gallery;
	public Gallery clickGallery() throws InterruptedException {
		Thread.sleep(2000);	
		click(Gallery);
		return new Gallery();
	}

	//Click Creatives
	@FindBy(xpath="//span[text()='Creatives']")
	WebElement Creatives;
	public Creatives clickCreatives() throws InterruptedException {
		Thread.sleep(2000);	
		click(Creatives);
		return new Creatives();
	}

	//Click Creativesapproval
	@FindBy(xpath="//span[text()='Creative Approval']")
	WebElement Creativesapproval;
	public Creativesapproval clickCreativesapproval() throws InterruptedException {
		Thread.sleep(2000);	
		click(Creativesapproval);
		return new Creativesapproval();
	}

}
