package lmxpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Mybillboards extends ProjectMethods{

	public Mybillboards() {
		PageFactory.initElements(driver, this);
		
	}
	//click Addbillboard
	@FindBy(xpath="//button[text()='Add Billboard']")
	WebElement Addbillboard;
	public Billboardselection clickAddbillboard() throws InterruptedException {
	Thread.sleep(2000);	
		click(Addbillboard);
		return new Billboardselection();
	}
	
	//Click Digitallist
	@FindBy(xpath="//div[text()='Digital']")
	WebElement Digitallist;
	public Mybillboards ClickDigitallist() throws InterruptedException {
		click(Digitallist);
		Thread.sleep(1000);
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
	
	//Click Lastpagebillboard
	@FindBy(xpath="(//li[contains(@class,'page-item disabled')])[2]")
	WebElement Lastpagebillboard;
	public Mybillboards ClickLastpagebillboard() throws InterruptedException {
		Thread.sleep(2000);	
		click(Lastpagebillboard);
		return this;
	}
	
	//Click Action
	@FindBy(xpath="//table[contains(@class,'custom-list-table table')]/tbody[1]/tr[10]/td[5]/div[1]/button[1]/i[1]")
	WebElement Action;
	public Mybillboards ClickAction() throws InterruptedException {
		click(Action);
		Thread.sleep(1000);
		return this;
	}
	
	//Click Edit
	@FindBy(xpath="(//div[@class='dropdown-menu show']//button)[2]")
	WebElement Edit;
	public Mybillboards ClickEdit() throws InterruptedException {
		click(Edit);
		Thread.sleep(1000);
		return this;
	}
	
	//Click Configuration
	@FindBy(css="div#custome-wizard>ul>li:nth-of-type(4)>a")
	WebElement Configuration;
	public Mybillboards ClickConfiguration() throws InterruptedException {
		click(Configuration);
		Thread.sleep(1000);
		return this;
	}
	
	//enter Endtime
	@FindBy(xpath="(//input[@type='time'])[2]")
	WebElement Endtime;
	public Mybillboards typeEndtime(String endtime) throws InterruptedException {
		Thread.sleep(1000);
		type(Endtime, endtime);
		return this;
	}
	
	//Click Saveproceed
	@FindBy(xpath="//button[text()='Update & Proceed']")
	WebElement Saveproceed;
	public Mybillboards ClickSaveproceed() throws InterruptedException {
		click(Saveproceed);
		Thread.sleep(1000);
		return this;
	}
	
	//Click Rates
	@FindBy(css="div#custome-wizard>ul>li:nth-of-type(6)>a")
	WebElement Rates;
	public Mybillboards ClickRates() throws InterruptedException {
		click(Rates);
		Thread.sleep(1000);
		return this;
	}
	
	//Click Saveproceed2
	@FindBy(xpath="//button[text()=' Update & Proceed ']")
	WebElement Saveproceed2;
	public Mybillboards ClickSaveproceed2() throws InterruptedException {
		click(Saveproceed2);
		Thread.sleep(1000);
		return this;
	}
	
	
	
	
	

	





	

}
