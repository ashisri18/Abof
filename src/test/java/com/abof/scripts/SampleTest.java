package com.abof.scripts;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.kirwa.nxgreport.NXGReports;

import io.appium.java_client.android.AndroidDriver;

public class SampleTest {
	public DesiredCapabilities caps;
	public AndroidDriver driver;
	@Test(priority=1,enabled=true,description="To clear the databases of Assessment")
	public void sampletest(){
		try{
			caps = new DesiredCapabilities();
			caps.setCapability("automationName", "Appium");
			caps.setCapability("platformName", "Android");
			caps.setCapability("platformVersion", "6.0.1");
			caps.setCapability("deviceName", "10.10.13.125:5555");
			caps.setCapability("browserName", "chrome");
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
			NXGReports.setWebDriver(driver);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://www.google.com");
			//driver.findElement(By.xpath("//*[@resource-id='com.actimind.actitime:id/old_user']")).click();
			driver.quit();

		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
