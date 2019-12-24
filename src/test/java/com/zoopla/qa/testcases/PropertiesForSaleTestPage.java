package com.zoopla.qa.testcases;

import java.io.FileNotFoundException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zoopla.qa.base.TestBase;
import com.zoopla.qa.pages.PropertiesForSalePage;
import com.zoopla.qa.pages.ZooplaHomePage;

public class PropertiesForSaleTestPage extends TestBase{
	PropertiesForSalePage salesPage;
	ZooplaHomePage homePage;
	public PropertiesForSaleTestPage() throws FileNotFoundException {
		super();
		// TODO Auto-generated constructor stub
	}
@BeforeMethod
public void setup() throws FileNotFoundException{
	initialization();
	salesPage= new PropertiesForSalePage();
	//homePage= new ZooplaHomePage();
	salesPage=homePage.HomePage(prop.getProperty("inputlocation"));
}
@Test
public void checkTitle(){
	String title= driver.getTitle();
	Assert.assertEquals(title,"Property for sale in London");
}
@AfterMethod
public void tearDown(){
	driver.quit();
}
}
