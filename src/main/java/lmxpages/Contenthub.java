package lmxpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Contenthub extends ProjectMethods {

	public Contenthub() {
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
	
	//Click Backtodashboard
	@FindBy(xpath="//span[text()='Preferences']")
	WebElement Backtodashboard;
	public Dashboard Backtodashboard() throws InterruptedException {
		Thread.sleep(2000);	
		click(Backtodashboard);
		return new Dashboard();
	}

	

}
