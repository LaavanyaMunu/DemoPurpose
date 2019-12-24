package com.zoopla.qa.testcases;

import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zoopla.qa.base.TestBase;
import com.zoopla.qa.pages.PropertiesForSalePage;
import com.zoopla.qa.pages.ZooplaHomePage;

public class ZooplaHomePageTest extends TestBase{
	ZooplaHomePage homepage;
	PropertiesForSalePage salePage;
	public ZooplaHomePageTest() throws FileNotFoundException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void setup() throws FileNotFoundException{
		initialization();
		homepage= new ZooplaHomePage();
		
	}
	@Test(priority=1)
	public void homepageTitleTest(){
		String title= driver.getTitle();
		Assert.assertEquals(title,"Zoopla > Search Property to Buy, Rent, House Prices, Estate Agents");
	}
	@Test(priority=2)
	public void salesPage() throws FileNotFoundException{
		salePage =homepage.HomePage(prop.getProperty("inputlocation"));
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	}

