package lmxpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Adddigital extends ProjectMethods{

	public Adddigital() {
		PageFactory.initElements(driver, this);
	}

	//enter Searchlocationdigital
	@FindBy(id="searchMap")
	WebElement Searchlocationdigital; 
	public Adddigital typeSearchlocationdigital(String data) throws InterruptedException {
		Thread.sleep(1000);
		type(Searchlocationdigital, data);
		return this;
	}

	//index indexgooglelocation 
	@FindBy(id="searchMap")
	WebElement indexgooglelocation; 
	public Adddigital indexgooglelocation(int index) throws InterruptedException {
		Thread.sleep(4000);
		selectDropDownUsingIndex(indexgooglelocation, index);
		return this;
	}

	//enter Boardnamedigital
	@FindBy(name="billboardName")
	WebElement Boardnamedigital;
	public Adddigital typeBoardnamedigital(String data) throws InterruptedException {
		Thread.sleep(1000);
		type(Boardnamedigital, data);
		return this;
	}
	//enter Displaynamedigital
	@FindBy(name="displayName")
	WebElement Displaynamedigital;
	public Adddigital typeDisplaynamedigital(String data)  {
		type(Displaynamedigital, data);
		return this;
	}

	//index indexFormat 
	@FindBy(name="formats")
	WebElement indexFormat; 
	public Adddigital indexFormat(int index) throws InterruptedException {
		Thread.sleep(4000);
		selectDropDownUsingIndex(indexFormat, index);
		return this;
	}

	//index indexCategory
	@FindBy(name="category")
	WebElement indexCategory; 
	public Adddigital indexCategory(int index) throws InterruptedException {
		Thread.sleep(1000);
		selectDropDownUsingIndex(indexCategory, index);
		return this;
	}

	//index indexGroup
	@FindBy(name="group") 
	WebElement indexGroup; 
	public Adddigital indexGroup(int index) throws InterruptedException {
		Thread.sleep(1000);
		selectDropDownUsingIndex(indexGroup, index);
		return this;
	}

	//index indexBoardfacing
	@FindBy(name="cardinalPoint")
	WebElement indexBoardfacing; 
	public Adddigital indexBoardfacing(int index) throws InterruptedException {
		Thread.sleep(1000);
		selectDropDownUsingIndex(indexBoardfacing, index);
		return this;
	}

	//index indexFacing
	@FindBy(name="facingDirection")
	WebElement indexFacing; 
	public Adddigital indexFacing(int index) throws InterruptedException {
		Thread.sleep(1000);
		selectDropDownUsingIndex(indexFacing, index);
		return this;
	}


	//index indexVenuetypeclassic 
	@FindBy(name="venueType")
	WebElement indexVenuetypeclassic; 
	public Adddigital indexVenuetypeclassic(int index) throws InterruptedException {
		Thread.sleep(4000);
		selectDropDownUsingIndex(indexVenuetypeclassic, index);
		return this;
	}


	//index indexActive
	@FindBy(name="active")
	WebElement indexActive; 
	public Adddigital indexActive(int index) throws InterruptedException {
		Thread.sleep(1000);
		selectDropDownUsingIndex(indexActive, index);
		return this;
	}

	//index indexAvailable
	@FindBy(name="availableBooking")
	WebElement indexAvailable; 
	public Adddigital indexAvailable(int index) throws InterruptedException {
		Thread.sleep(1000);
		selectDropDownUsingIndex(indexAvailable, index);
		return this;
	}

	//index indexAccess
	@FindBy(name="access")
	WebElement indexAccess; 
	public Adddigital indexAccess(int index) throws InterruptedException {
		Thread.sleep(1000);
		selectDropDownUsingIndex(indexAccess, index);
		return this;
	}

	//click Savedigitallocation
	@FindBy(xpath="//strong[text()='Apply']")
	WebElement Savedigitallocation;
	public Specificationdigital clickSavedigitallocation() throws InterruptedException {
		Thread.sleep(2000);	
		click(Savedigitallocation);
		return new Specificationdigital();
	}

	//click Canceldigitallocation
	@FindBy(xpath="//strong[text()='Apply']")
	WebElement Canceldigitallocation;
	public Billboardselection clickCanceldigitallocation() throws InterruptedException {
		Thread.sleep(2000);	
		click(Canceldigitallocation);
		return new Billboardselection();
	}


}
