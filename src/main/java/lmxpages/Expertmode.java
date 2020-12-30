package lmxpages;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import wdMethods.ProjectMethods;

public class Expertmode extends ProjectMethods {

	public Expertmode() {
		PageFactory.initElements(driver, this);
	}
	
	//click Dates
	@FindBy(name="dates")
	WebElement Dates;
	public Expertmode clickDates() throws InterruptedException {
		Thread.sleep(2000);	
		click(Dates);
		return this;
	}
	
	//click Select15days
	@FindBy(xpath="(//button[@type='button'])[3]")
	WebElement Select15days;
	public Expertmode clickSelect15days() throws InterruptedException {
		Thread.sleep(2000);	
		click(Select15days);
		return this;
	}
	
	//enter Mobilebudget
	@FindBy(xpath="//input[@formcontrolname='mobileBudget']")
	WebElement Mobilebudget;
	public Expertmode typeMobilebudget(String data1) throws InterruptedException {
		Thread.sleep(1000);
		type(Mobilebudget, data1);
		return this;
	}
	
//	//click Mediatype
//	@FindBy(name="select")
//	WebElement Mediatype;
//	public Expertmode clickMediatype() throws InterruptedException {
//		Thread.sleep(2000);	
//		click(Mediatype);
//		return this;
//	}
	
	//index indexMediatype
	@FindBy(name="select")
	WebElement indexMediatype; 
	public Expertmode indexMediatype(int index) throws InterruptedException {
		Thread.sleep(1000);
		selectDropDownUsingIndex(indexMediatype, index);
		return this;
	}
	
	//Click Brand
	@FindBy(id="brand-dropdown")
	WebElement Brand;
	public Expertmode ClickBrand() throws InterruptedException {
		click(Brand);
		Thread.sleep(1000);
		return this;
	}

	//Click Brandtype
	@FindBy(xpath="//div[text()='QA Purpose']")
	WebElement Brandtype;
	public Expertmode ClickBrandtype() throws InterruptedException {
		click(Brandtype);
		Thread.sleep(1000);
		return this;
	}

	//Click Product
	@FindBy(id="product-dropdown")
	WebElement Product;
	public Expertmode ClickProduct() throws InterruptedException {
		click(Product);
		Thread.sleep(1000);
		return this;
	}

	//Click Producttype
	@FindBy(xpath="//button[text()='QA Only']")
	WebElement Producttype;
	public Expertmode ClickProducttype() throws InterruptedException {
		click(Producttype);
		Thread.sleep(1000);
		return this;
	}
	
	//click Findsite
	@FindBy(xpath="//button[text()='Find Sites']")
	WebElement Findsite;
	public CampaignRecommendation clickFindsite() throws InterruptedException {
		Thread.sleep(2000);	
		click(Findsite);
		return new CampaignRecommendation();
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
