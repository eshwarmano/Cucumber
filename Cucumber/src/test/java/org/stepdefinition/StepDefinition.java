package org.stepdefinition;

import java.util.List;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.pojo.ForgottenLoginPojo;
import org.pojo.LoginPojo;
import org.testng.annotations.BeforeMethod;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.ast.DataTable;

public class StepDefinition extends BaseClass{
LoginPojo l;	

@Given("user have to  launch the brouser and facebook url")
public void user_have_to_launch_the_brouser_and_facebook_url() {
  OpenBrouser();
  LaunchUrl("https://www.facebook.com/");
}



@When("user have  to  pass the invalid username and invalid password")
public void user_have_to_pass_the_invalid_username_and_invalid_password(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
    List<String> asList = dataTable.asList();
    String s = asList.get(0);
    String r = asList.get(1);
    l=new LoginPojo();
    WebElement username = l.getUsername();
    PassValue(username, s);
    Thread.sleep(2000);
    WebElement pass = l.getPassword();
    PassWord(pass, r);
}

@Then("user have to click login button")
public void user_have_to_click_login_button() {
	WebElement click = l.getClick();
	Click(click);
}
@Given("user have to maximize the window")
public void user_have_to_maximize_the_window() throws InterruptedException {
  Maximize();
   
}
@When("user have  to  pass the invalid username and valid password")
public void user_have_to_pass_the_invalid_username_and_valid_password(io.cucumber.datatable.DataTable d) {
   List<List<String>> li = d.asLists();
   List<String> data = li.get(1);
   String email = data.get(1);
   l=new LoginPojo();
   WebElement username = l.getUsername();
   PassValue(username, email);
   WebElement password = l.getPassword();
   PassWord(password,li.get(2).get(1));
}



@Then("user have to close the brouser")
public void user_have_to_close_the_brouser() {
    CloseTheBrouser();
   
}




























}

	


