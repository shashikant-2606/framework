package com.new_maven_project.test_case;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.new_maven_project.pom.login_element;
import com.new_maven_project.utility.excel_provider;

public class login_test_case extends base_class
{
	
	@Test
	public void login() throws InterruptedException, IOException
	{
		excel_provider provide=new excel_provider();
		login_element log1=new login_element(driver);
		driver.get(Url);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		log1.username(provide.getStringData("Login", 0, 0));
		log1.password(provide.getStringData("Login", 0, 1));
		log1.buttonclick();
	}
	
	

}
