package com.zoopla.qa.pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoopla.qa.base.TestBase;

public class ZooplaHomePage extends TestBase{
	@FindBy(xpath="//*[contains(text(),'e.g. Oxford, NW3 or Waterloo Station')]")
	WebElement SearchLocation;
	@FindBy(id = "search-submit")
	WebElement search;
	//String location= prop.getProperty("input location");
	
	public ZooplaHomePage() throws FileNotFoundException{
		PageFactory.initElements(driver, this);
	}


public PropertiesForSalePage HomePage(String location) throws FileNotFoundException {

SearchLocation.sendKeys(location);
search.click();
return new PropertiesForSalePage();
}
}