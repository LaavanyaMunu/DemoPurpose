package com.zoopla.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.zoopla.qa.utility.TestUtil;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public TestBase() throws FileNotFoundException{
		try{
			prop= new Properties();
			FileInputStream fis= new FileInputStream("C:\\Amazon\\SelfTrainingWorkspace\\SeleniumCodingChallengeZoopla\\src\\main\\java\\com\\zoopla\\qa\\configprop\\config.properties");
			prop.load(fis);
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public static void initialization(){
		String browsername =prop.getProperty("browser");
		if(browsername.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Amazon\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
						
		}
		
	

}
