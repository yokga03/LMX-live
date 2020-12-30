package lmxpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Loginpage extends ProjectMethods {

	public Loginpage() {
		PageFactory.initElements(driver, this);
	}
	//enter Username
	@FindBy(id="username")
	WebElement eleUsername;
	public Loginpage typeUsername(String data) throws InterruptedException {
		Thread.sleep(1000);
		type(eleUsername, data);
		return this;
	}
	//enter Password
	@FindBy(id="password")
	WebElement elePassword;
	public Loginpage typePassword(String data)  {
		type(elePassword, data);
		return this;
	}
	
	//Click LoginP
	@FindBy(xpath="//button[text()=' Login ']")
	WebElement LoginP;
	public Productselection clickLoginP() throws InterruptedException {
		Thread.sleep(2000);	
		click(LoginP);
		return new Productselection();
	}
	
	//Click LoginD
		@FindBy(xpath="//button[text()=' Login ']")
		WebElement LoginD;
		public Dashboard clickLoginD() throws InterruptedException {
			Thread.sleep(2000);	
			click(LoginD);
			return new Dashboard();
		}
}
