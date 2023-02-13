package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class ForgottenLoginPojo extends BaseClass{
	
	public ForgottenLoginPojo() {
	   PageFactory.initElements(driver, this);
	   
	} 
	@FindBy(xpath="//a[text()='Create New Account']")   
	private WebElement createaccount;
	
	   
	@FindBy(xpath="(//input[@type='text'])[2]")   
	private WebElement frstname;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastname;
	
	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement phone;
	
	@FindBy(xpath="(//input[@type='password'])[2]")
	private WebElement pass;

	public WebElement getCreateaccount() {
		return createaccount;
	}

	public WebElement getFrstname() {
		return frstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getPass() {
		return pass;
	}
	
	   
	   
	   
	   
	   
	   
		 
	
}