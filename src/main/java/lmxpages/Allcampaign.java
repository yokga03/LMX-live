 package lmxpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Allcampaign extends ProjectMethods{

	public Allcampaign() {
		PageFactory.initElements(driver, this);
	}
	
	//click allcampaigndropdown
	@FindBy(xpath="//i[contains(@class,'fa fa-chevron-down')]")
	WebElement allcampaigndropdown;
	public Allcampaign clickallcampaigndropdown() {
		click(allcampaigndropdown);
		return this;
	}
	
	//click Bookingconfirmed
	@FindBy(xpath="//button[text()='Booking Confirmed']")
	WebElement Bookingconfirmed;
	public Allcampaign clickBookingconfirmed() {
		click(Bookingconfirmed);
		return this;
	}
	
	//click Continue
	@FindBy(xpath="//button[text()='Continue']")
	WebElement Continue;
	public Allcampaign clickContinue() {
		click(Continue);
		return this;
	}
	
	//click Download
	@FindBy(xpath="//button[text()=' Download PPT ']")
	WebElement Download;
	public Allcampaign clickDownload() throws InterruptedException {
		click(Download);
		Thread.sleep(7000);	
		return this;
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
