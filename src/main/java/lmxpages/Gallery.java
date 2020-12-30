package lmxpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Gallery extends ProjectMethods {

	public Gallery() {
		PageFactory.initElements(driver, this);
	}
	
	//Click Action
	@FindBy(xpath="(//i[@class='fa fa-ellipsis-v'])[1]")
	WebElement Action;
	public Gallery ClickAction() throws InterruptedException {
		click(Action);
		Thread.sleep(1000);
		return this;
	} 
	
	//Click View
	@FindBy(xpath="//div[@class='dropdown-menu show']//button[1]")
	WebElement View;
	public Gallery ClickView() throws InterruptedException {
		click(View);
		Thread.sleep(1000);
		return this;
	} 
	
	//Click Download
	@FindBy(xpath="//button[text()='Download']")
	WebElement Download;
	public Gallery ClickDownload() throws InterruptedException {
		click(Download);
		Thread.sleep(1000);
		return this;
	} 

	//Click Exitview
	@FindBy(xpath="/html/body/ngb-modal-window/div/div/app-mar-content-hub-view/button")
	WebElement Exitview;
	public Gallery ClickExitview() throws InterruptedException {
		click(Exitview);
		Thread.sleep(1000);
		return this;
	} 

	//Click Tagbillboard
	@FindBy(xpath="(//div[@class='dropdown-menu show']//button)[2]")
	WebElement Tagbillboard;
	public Gallery ClickTagbillboard() throws InterruptedException {
		click(Tagbillboard);
		Thread.sleep(1000);
		return this;
	} 
	
//	//Click Action
//	@FindBy(xpath="//a[@ng-reflect-ngb-tooltip='Billboard']]")
//	WebElement Action;
//	public Gallery ClickAction() throws InterruptedException {
//		click(Action);
//		Thread.sleep(1000);
//		return this;
//	} 
//
//	//Click Action
//	@FindBy(xpath="//a[@ng-reflect-ngb-tooltip='Billboard']]")
//	WebElement Action;
//	public Gallery ClickAction() throws InterruptedException {
//		click(Action);
//		Thread.sleep(1000);
//		return this;
//	} 
//
//	//Click Action
//	@FindBy(xpath="//a[@ng-reflect-ngb-tooltip='Billboard']]")
//	WebElement Action;
//	public Gallery ClickAction() throws InterruptedException {
//		click(Action);
//		Thread.sleep(1000);
//		return this;
//	} 
//
//	//Click Action
//	@FindBy(xpath="//a[@ng-reflect-ngb-tooltip='Billboard']]")
//	WebElement Action;
//	public Gallery ClickAction() throws InterruptedException {
//		click(Action);
//		Thread.sleep(1000);
//		return this;
//	} 

	//Click Tagcampaign
	@FindBy(xpath="(//div[@class='dropdown-menu show']//button)[3]")
	WebElement Tagcampaign;
	public Gallery ClickTagcampaign() throws InterruptedException {
		click(Tagcampaign);
		Thread.sleep(1000);
		return this;
	} 

	//Click Delete
	@FindBy(xpath="html[1]/body[1]/div[5]/div[1]/button[4]")
	WebElement Delete;
	public Gallery ClickDelete() throws InterruptedException {
		click(Delete);
		Thread.sleep(1000);
		return this;
	} 

	



}
