package lmxpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import wdMethods.ProjectMethods;

public class CampaignRecommendation extends ProjectMethods {

	public CampaignRecommendation() {
		PageFactory.initElements(driver, this);
	}

	//enter Searchbillboards
	@FindBy(xpath="//input[@placeholder='Search billboards']")
	WebElement elePassword;
	public CampaignRecommendation typeSearchbillboards(String data)  {
		type(elePassword, data);
		return this;
	}

	//Click Applyfilters
	@FindBy(name="apply-filters-div")
	WebElement Applyfilters;
	public CampaignRecommendation ClickApplyfilters() throws InterruptedException {
		click(Applyfilters);
		Thread.sleep(1000);
		return this;
	}

	//Click Allcheckbox
	@FindBy(xpath="//span[@class='checkmark-checkbox']")
	WebElement Allcheckbox;
	public CampaignRecommendation ClickAllcheckbox() throws InterruptedException {
		click(Allcheckbox);
		Thread.sleep(1000);
		return this;
	}

	//Click Addtocart
	@FindBy(xpath="//button[text()='Add to Cart']")
	WebElement Addtocart;
	public CampaignRecommendation ClickAddtocart() throws InterruptedException {
		click(Addtocart);
		Thread.sleep(1000);
		return this;
	}


	//Click Cart
	@FindBy(xpath="//i[@class='fa fa-shopping-cart']")
	WebElement Cart;
	public CampaignRecommendation ClickCart() throws InterruptedException {
		click(Cart);
		Thread.sleep(1000);
		return this;
	}

	//Click Schedule
	@FindBy(xpath="//button[text()='Schedule']")
	WebElement Schedule;
	public CampaignRecommendation ClickSchedule() throws InterruptedException {
		click(Schedule);
		Thread.sleep(1000);
		return this;
	}

	//Click Startschedule
	@FindBy(xpath="//button[text()='Start Schedule']")
	WebElement Startschedule;
	public CampaignRecommendation ClickStartschedule() throws InterruptedException {
		click(Startschedule);
		Thread.sleep(1000);
		return this;
	}
	
	//click Nextschedule
	@FindBy(xpath="//button[text()=' Next ']")
	WebElement Nextschedule;
	public CampaignRecommendation clickNextschedule() throws InterruptedException {
		Thread.sleep(2000);	
		click(Nextschedule);
		return this;
	}
	
	//enter Dailybudget
	@FindBy(xpath="//input[@formcontrolname='dailyBudget']")
	WebElement Dailybudget;
	public CampaignRecommendation typeDailybudget(String data2) throws InterruptedException {
		Thread.sleep(1000);
		type(Dailybudget, data2);
		return this;
	}

	//enter Fixbid
	@FindBy(xpath="//input[@formcontrolname='fixedBid']")
	WebElement Fixbid;
	public CampaignRecommendation typeFixbid(String data3) throws InterruptedException {
		Thread.sleep(1000);
		type(Fixbid, data3);
		return this;
	}
	
	//enter Domain
	@FindBy(xpath="//input[contains(@class,'form-control ng-untouched')]")
	WebElement Domain;
	public CampaignRecommendation typeDomain(String data4) throws InterruptedException {
		Thread.sleep(1000);
		type(Domain, data4);
		return this;
	}
	
	//click Addtargeting
	@FindBy(id="add-targeting-dropdown")
	WebElement Addtargeting;
	public CampaignRecommendation clickAddtargeting() throws InterruptedException {
		Thread.sleep(2000);	
		click(Addtargeting);
		return this;
	}
	
	//click Geography
	@FindBy(xpath="//div[text()=' Geography ']")
	WebElement Geography;
	public CampaignRecommendation clickGeography() throws InterruptedException {
		Thread.sleep(2000);	
		click(Geography);
		return this;
	}

	//click Addgeography
	@FindBy(xpath="//button[text()='Add']")
	WebElement Addgeography;
	public CampaignRecommendation clickAddgeography() throws InterruptedException {
		Thread.sleep(2000);	
		click(Addgeography);
		return this;
	}
	
	//click Nextmobileschedule
		@FindBy(xpath="//button[text()=' Next ']")
		WebElement Nextmobileschedule;
		public CampaignRecommendation clickNextmobileschedule() throws InterruptedException {
			Thread.sleep(2000);	
			click(Nextmobileschedule);
			return this;
		}
		
		
		//click Donemobileschedule
		@FindBy(xpath="//button[text()='Done']")
		WebElement Donemobileschedule;
		public CampaignRecommendation clickDonemobileschedule() throws InterruptedException {
			Thread.sleep(2000);	
			click(Donemobileschedule);
			return this;
		}

		//click Generateproposal
		@FindBy(xpath="//button[text()=' Generate Proposal ']")
		WebElement Generateproposal;
		public CampaignRecommendation clickGenerateproposal() throws InterruptedException {
			Thread.sleep(2000);	
			click(Generateproposal);
			return this;
		}
	
	

	





}
