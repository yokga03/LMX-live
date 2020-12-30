package lmxpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Addclassic extends ProjectMethods {

	public Addclassic() {
		PageFactory.initElements(driver, this);
	}
	
	//enter searchLocationclassic 
	@FindBy(id="searchMap")
	WebElement searchLocationclassic; 
	public Addclassic typesearchLocationclassic(String data) throws InterruptedException {
		Thread.sleep(4000);
		type(searchLocationclassic, data);
		return this;
	}
	
	//index searchLocationclassic1 
	@FindBy(css="input#searchMap")
	WebElement searchLocationclassic1; 
	public Addclassic indexsearchLocationclassic1(int index) throws InterruptedException {
		Thread.sleep(4000);
		selectDropDownUsingIndex(searchLocationclassic1, index);
		return this;
	}
	
	//enter Boardnameclassic
	@FindBy(name="billboardName")
	WebElement Boardnameclassic;
	public Addclassic typeBoardnameclassic(String data) throws InterruptedException {
		Thread.sleep(1000);
		type(Boardnameclassic, data);
		return this;
	}
	//enter Displaynameclassic 
	@FindBy(name="displayName")
	WebElement Displaynameclassic;
	public Addclassic typeDisplaynameclassic(String data)  {
		type(Displaynameclassic, data);
		return this;
	}
	
	//index indexVenuetypeclassic 
	@FindBy(name="venueType")
	WebElement indexVenuetypeclassic; 
	public Addclassic indexVenuetypeclassic(int index) throws InterruptedException {
		Thread.sleep(4000);
		selectDropDownUsingIndex(indexVenuetypeclassic, index);
		return this;
	}
	
	
	//index indexboardfacingclassic 
	@FindBy(name="cardinalPoint")
	WebElement indexboardfacingclassic; 
	public Addclassic indexboardfacingclassic(int index) throws InterruptedException {
		Thread.sleep(1000);
		selectDropDownUsingIndex(indexboardfacingclassic, index);
		return this;
	}

	
	//index indexfacingclassic 
	@FindBy(name="facingDirection")
	WebElement indexfacingclassic; 
	public Addclassic indexfacingclassic(int index) throws InterruptedException {
		Thread.sleep(1000);
		selectDropDownUsingIndex(indexfacingclassic, index);
		return this;
	}
	
	
	//index indexGroupclassic 
	@FindBy(css="div#add-billboard-locations>app-mar-billboard-add-locations>form>div>div>div>div:nth-of-type(3)>div>div>div>div:nth-of-type(6)>div>div>select")
	WebElement indexGroupclassic; 
	public Addclassic indexGroupclassic(int index) throws InterruptedException {
		Thread.sleep(1000);
		selectDropDownUsingIndex(indexGroupclassic, index);
		return this;
	}

	
	//index indexCategoryclassic
	@FindBy(css="div#add-billboard-locations>app-mar-billboard-add-locations>form>div>div>div>div:nth-of-type(3)>div>div>div>div:nth-of-type(4)>div>div>select")
	WebElement indexCategoryclassic; 
	public Addclassic indexCategoryclassic(int index) throws InterruptedException {
		Thread.sleep(1000);
		selectDropDownUsingIndex(indexCategoryclassic, index);
		return this;
	}
	
	//index indexActiveclassic
	@FindBy(name="active")
	WebElement indexActiveclassic; 
	public Addclassic indexActiveclassic(int index) throws InterruptedException {
		Thread.sleep(1000);
		selectDropDownUsingIndex(indexActiveclassic, index);
		return this;
	}

	//index indexAvailableclassic
	@FindBy(name="availableBooking")
	WebElement indexAvailableclassic; 
	public Addclassic indexAvailableclassic(int index) throws InterruptedException {
		Thread.sleep(1000);
		selectDropDownUsingIndex(indexAvailableclassic, index);
		return this;
	}

	//index indexAccesslassic
	@FindBy(name="access")
	WebElement indexAccesslassic; 
	public Addclassic indexAccesslassic(int index) throws InterruptedException {
		Thread.sleep(1000);
		selectDropDownUsingIndex(indexAccesslassic, index);
		return this;
	}

	//click Saveclassiclocation
	@FindBy(xpath="//button[text()=' Save & Proceed ']")
	WebElement Saveclassiclocation;
	public Specificationclassic clickSaveclassiclocation() throws InterruptedException {
		Thread.sleep(6000);	
		click(Saveclassiclocation);
		return new Specificationclassic();
	}
	
	//click Cancelclassiclocation
	@FindBy(xpath="//button[text()='Previous']")
	WebElement Cancelclassiclocation;
	public Billboardselection clickCancelclassiclocation() throws InterruptedException {
		Thread.sleep(2000);	
		click(Cancelclassiclocation);
		return new Billboardselection();
	}
	
		
	

}
