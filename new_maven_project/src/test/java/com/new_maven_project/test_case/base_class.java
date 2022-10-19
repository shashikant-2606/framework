package com.new_maven_project.test_case;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class base_class
{
	WebDriver driver;
	String username="mngr266311";
	String password="Admin123$";
	String Url="https://demo.guru99.com/v3/index.php";
	@Parameters("Browser")
	@BeforeMethod
	public void browser_launch(String browser)
	{
		
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium material\\Selenium project\\new_maven_project\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Selenium material\\Selenium project\\new_maven_project\\drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browser.equals("edge"))
		{
			System.setProperty("webdriver.ie.driver", "D:\\Selenium material\\Selenium project\\new_maven_project\\drivers\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		else if(browser.equals("ie"))
		{
			System.setProperty("webdriver.edge.driver", "D:\\Selenium material\\Selenium project\\new_maven_project\\drivers\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
	}

	@AfterMethod
	public void end_browser()
	{
		driver.quit();	
	}
		
	}
	


