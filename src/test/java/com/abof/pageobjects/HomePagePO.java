package com.abof.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.kirwa.nxgreport.NXGReports;
import com.kirwa.nxgreport.logging.LogAs;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen;
import com.kirwa.nxgreport.selenium.reports.CaptureScreen.ScreenshotOf;

import io.appium.java_client.android.AndroidDriver;

public class HomePagePO {
	AndroidDriver driver;
	
	public HomePagePO(AndroidDriver  driver) {
	
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//android.widget.ImageButton[contains(@content-desc,'Navigate up')]")
	 private WebElement hamburgerMenuIcon;
	 public WebElement getHamburgerIcon() {
	  return hamburgerMenuIcon;
	 }
	@FindBy(id="com.abof.android:id/actionbarTitle")
    private WebElement homeAboflnk;
	public WebElement getHomeAboflnk() {
		return homeAboflnk;
	} 
	@FindBy(id="com.abof.android:id/search_icn")
	private WebElement homeSearchIcon;
	public WebElement getHomeSearchIcon() {
		return homeSearchIcon;
	} 
	@FindBy(id="com.abof.android:id/fav_icn")
	private WebElement homeNotificationIcon;
	public WebElement getHomeNotificationIcon() {
		return homeNotificationIcon;
	} 
    @FindBy(id="com.abof.android:id/cart_icn")
	private WebElement homeCartIcon;
	public WebElement getHomeCartIcon() {
		return homeCartIcon;
	} 
	@FindBy(name="MEN")
	private WebElement homeMenLnk;
	public WebElement getHomeMenLnk() {
		return homeMenLnk;
	} 
	@FindBy(xpath="//text()='WOMEN'")
	private WebElement homeWomenLnk;
	public WebElement getHomeWomenLnk() {
		return homeWomenLnk;
	} 
	@FindBy(xpath="//text()='WHAT'S HOT'")
	private WebElement eleWhatsHotLnk;
	public WebElement getwhatsHotLnk() {
		return eleWhatsHotLnk;
	} 
	@FindBy(id="com.abof.android:id/search_edittext")
	private WebElement eleSearchEdtBx;
	public WebElement getEleSearchEdtBx() {
		return eleSearchEdtBx;
	} 
	@FindBy(xpath="//text()='That's a buzzkill! No matches 'savvy''")
	private WebElement eleNoMatchTxt;
	public WebElement getNoMatchTxt() {
		return eleNoMatchTxt;
	} 
	@FindBy(xpath="//android.widget.TextView[contains(@text,'My Favourites')]")
	private WebElement eleSearchPageMyFavLnk;
	public WebElement getEleSearchPageMyFavLnk() {
		return eleSearchPageMyFavLnk;
	} 
	@FindBy(xpath="//android.widget.TextView[contains(@text,'Our Recommendations')]")
	private WebElement eleSearchPageRecommendationLnk;
	public WebElement getEleSearchPageRecommendationLnk() {
		return eleSearchPageRecommendationLnk;
	}
	@FindBys({@FindBy(id="com.abof.android:id/prduct_name")})
	private List<WebElement> eleSearchPageFavLst;
	public List<WebElement> getEleSearchPageFavLst()
	{
		return eleSearchPageFavLst;
	}
	@FindBys({@FindBy(className="android.widget.LinearLayout")})
	private List<WebElement> eleSearchPageRecomendlst;
	public List<WebElement> getEleSearchPageRecomendLst()
	{
		return eleSearchPageRecomendlst;
	}
	
	
	//after performing invalid search My fav item is displayed or not 
	public void favItemListIsPresent()
	{
		 if(getEleSearchPageFavLst().isEmpty())
	     {
	    	 NXGReports.addStep(" In search Page,All product in My Favorites are not displayed", LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
	     }
	     else
	     {
	    	 NXGReports.addStep(" In search Page,All product in My Favorites are displayed", LogAs.PASSED, null);
	    	 
	     }
		
	}
	
	//after performing invalid search Recommendation item is displayed or not 
	public void recomendationListIsPresent()
	{
		if(getEleSearchPageRecomendLst().isEmpty())
	     {
	    	 NXGReports.addStep("Recommendation list is not displayed", LogAs.FAILED,new CaptureScreen(ScreenshotOf.BROWSER_PAGE) );
	     }
	     else
	     {
	    	 NXGReports.addStep("Recommendation list is displayed", LogAs.PASSED,null);
	     }
	}
}
