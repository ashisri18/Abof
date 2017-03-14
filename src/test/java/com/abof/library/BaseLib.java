package com.abof.library;

import java.io.File;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.kirwa.nxgreport.NXGReports;
import com.kirwa.nxgreport.logging.LogAs;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class BaseLib {

	public static AndroidDriver driver;
	public AppiumDriverLocalService services;
	static public String sDirPath = System.getProperty("user.dir");
	public String apkpath = sDirPath + "/abof.apk";
	public File apkfile = new File(apkpath);
	public static String sTestDataFile = sDirPath + "/Abof.xlsx";
	public static String sConfigFile = sDirPath + "/Config.Properties";
	public static String FB = GenericLib.getCongigValue(sConfigFile, "FBPackage");
	DesiredCapabilities capabilities;
	static WebElement wElement;
	static Dimension dSize;
	@BeforeMethod
	public void setUp() throws MalformedURLException {
		capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,GenericLib.getCongigValue(sConfigFile, "AutomationName"));
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,GenericLib.getCongigValue(sConfigFile, "PlatformName"));
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,GenericLib.getCongigValue(sConfigFile, "PlatformVersion"));
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,GenericLib.getCongigValue(sConfigFile, "DeviceName"));
		capabilities.setCapability("app", apkfile.getAbsolutePath());
		capabilities.setCapability("appPackage", GenericLib.getCongigValue(sConfigFile, "AbofPackage"));
		capabilities.setCapability("appActivity", GenericLib.getCongigValue(sConfigFile, "AbofActivity"));
		capabilities.setCapability("appWaitActivity",GenericLib.getCongigValue(sConfigFile, "AppWaitActivity"));			
		driver = new AndroidDriver(new URL(GenericLib.getCongigValue(sConfigFile, "AppiumServer_Url")), capabilities);
		NXGReports.setWebDriver(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	// WebDriver Wait
	public static void waitForElement(WebElement ele, String expResult, String actResult) {
		Wait wait = new FluentWait(driver).withTimeout(40, TimeUnit.SECONDS).pollingEvery(10, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
	//s	wElement = (WebElement) wait.until(ExpectedConditions.visibilityOf(ele));
		Assert.assertTrue(wElement.isDisplayed(), actResult);
		NXGReports.addStep(expResult, LogAs.PASSED, null);

	}
	// Swipe

	public static void swipeRightToLeft(double startX, double endX) {
		dSize = driver.manage().window().getSize();
		int startx = (int) (dSize.width * startX);
		int endx = (int) (dSize.width * endX);
		int starty = dSize.height / 2;
		driver.swipe(startx, starty, endx, starty, 3000);
	}

	public static void swipeLeftToRight(double startX, double endX) {
		dSize = driver.manage().window().getSize();
		int startx = (int) (dSize.width * startX);
		int endx = (int) (dSize.width * endX);
		int starty = dSize.height / 2;
		driver.swipe(endx, starty, startx, starty, 3000);
	}

	public static void swipeBottomToTop(double startY, double endY) {
		dSize = driver.manage().window().getSize();
		int starty = (int) (dSize.height * startY);
		int endy = (int) (dSize.height * endY);
		int startx = dSize.width / 2;
		driver.swipe(startx, starty, startx, endy, 3000);
	}

	public static void swipeTopToBottm(double startY, double endY) {
		dSize = driver.manage().window().getSize();
		int starty = (int) (dSize.height * startY);
		int endy = (int) (dSize.height * endY);
		int startx = dSize.width / 2;
		driver.swipe(startx, endy, startx, starty, 3000);
	}

	// Switch to native or webview
	public static void switchToView() {
		Set<String> contextNames = driver.getContextHandles();
		for (String contextName : contextNames) {
			if (contextName.contains("WEBVIEW")) {
				driver.context(contextName);
				System.out.println(contextName);
			} else {
				driver.context(contextName);
				System.out.println(contextName);
			}
		}
	}

	//for taking toast message
	public String verify(AppiumDriver driver) {
		String result = null;
		File scfile = driver.getScreenshotAs(OutputType.FILE);
		ITesseract instance = new Tesseract();
		try {
			result = instance.doOCR(scfile);
		} catch (TesseractException e) {
			System.out.println(e.getMessage());
		}
		return result;
	}
	 
	// based on argument perform scroll
	public void scrollToElement (int maxScroll,String scrollType,double start,double end,WebElement  element)
	 {
	 
		 while(maxScroll!=0)
		 {
			 try
			 { 
				 if(element.isDisplayed())
				 { element.click();
				 maxScroll++;
				 break;
				 }
	 
			 }
			 catch(Exception e)
			 {
				 switch (scrollType.toUpperCase()) {
				case "UP":
					 swipeBottomToTop( start, end);
					break;
                
                case "DOWN":
                	swipeTopToBottm( start,end);
					break;
					
                case "LEFT":
                	swipeRightToLeft(start, end);
					break;
					
                case "RIGHT":
                	swipeLeftToRight(start,end);
	                break;
				
                default:
                	NXGReports.addStep("Scroll to element", LogAs.INFO, null);
					break;
				}
			 }
			 maxScroll--;
		 }
	
	 }
	

    
	
	
	
	 @AfterMethod
	 public void tearDown() {
		 driver.closeApp();
	 }

}
