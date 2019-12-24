package com.zoopla.qa.pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.support.PageFactory;

import com.zoopla.qa.base.TestBase;

public class SelectedPropertyPage extends TestBase{
	
	public SelectedPropertyPage() throws FileNotFoundException {
		PageFactory.initElements(driver, this);
		
	}

}
