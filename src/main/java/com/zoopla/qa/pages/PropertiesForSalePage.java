package com.zoopla.qa.pages;

import java.io.FileNotFoundException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.zoopla.qa.base.TestBase;

public class PropertiesForSalePage extends TestBase{
	@FindBy(name = "results_sort")
	WebElement sorting;
	String sortby= prop.getProperty("sortingByText");
	
	public PropertiesForSalePage() throws FileNotFoundException{
		PageFactory.initElements(driver, this);
	}
	public SelectedPropertyPage descendingPropertyPrice(String sortby) throws FileNotFoundException{
		Select sel= new Select(sorting);
		sel.selectByVisibleText(sortby);
		
		return new SelectedPropertyPage();
		
	}

}
