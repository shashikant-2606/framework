package com.new_maven_project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_element 
{
	WebDriver driver;
	@FindBy(xpath="/html/body/form/table/tbody/tr[1]/td[2]/input")WebElement userid1;
	@FindBy(name="password")WebElement userpassword;
	@FindBy(xpath="/html/body/form/table/tbody/tr[3]/td[2]/input[1]")WebElement loginbutton;
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")WebElement logoutbutton;
	
	public login_element(WebDriver d1)
	{
		//this.driver=driver;
		PageFactory.initElements(d1,this);
		driver=d1;
	}
	
	public void username(String s1)
	{
		userid1.sendKeys(s1);
	}
	public void password(String s2)
	{
		userpassword.sendKeys(s2);
	}
	public void buttonclick()
	{
		loginbutton.click();
	}
	public void logout()
	{
		logoutbutton.click();
	}


}
