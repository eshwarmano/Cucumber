package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {
	
public LoginPojo() {
	PageFactory.initElements(driver, this);
}


@FindBy(id="email")
private WebElement Username;

@FindBy(xpath="//input[@type='password']")
private WebElement password;

@FindBy(xpath="//button[@name='login']")
private WebElement click;

public WebElement getUsername() {
	return Username;
}

public WebElement getPassword() {
	return password;
}

public WebElement getClick() {
	return click;
}











}
