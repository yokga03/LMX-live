package lmxpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Importbillboard extends ProjectMethods{

	public Importbillboard() {
		PageFactory.initElements(driver, this);
	}
	
	//click SelectMO
	@FindBy(xpath="//select[contains(@class,'custom-select ng-pristine')]")
	WebElement SelectMO;
	public Importbillboard clickSelectMO() {
		click(SelectMO);
		return this;
	}
	
	//click ChooseMO
	@FindBy(xpath="//select[contains(@class,'custom-select ng-pristine')]")
	WebElement ChooseMO;
	public Importbillboard clickChooseMO() {
		click(ChooseMO);
		return this;
	}
	
	


}