package com.abof.pageobjects;

import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.Assert;

import com.abof.library.BaseLib;
import com.kirwa.nxgreport.NXGReports;
import com.kirwa.nxgreport.logging.LogAs;

import io.appium.java_client.android.AndroidDriver;


public class HamburgerMenuPO {

	AndroidDriver driver;
	public HamburgerMenuPO(AndroidDriver driver) {
		
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="com.abof.android:id/whats_hot_text")
	private WebElement eleWhatshotLnk;
	public WebElement getElewhatshotLnk()
	{
		return eleWhatshotLnk;
	}
	@FindBy(id="com.abof.android:id/men_text")
	private WebElement eleShopMenLnk;
	public WebElement getEleShopMenLnk()
	{
		return eleShopMenLnk;
	}
	@FindBy(id="com.abof.android:id/my_orders_text")
	private WebElement eleMyOrdersLnk;
	public WebElement getEleMyOrdersLnk()
	{
		return eleMyOrdersLnk;
	}
	@FindBy(id="com.abof.android:id/fav_text")
	private WebElement eleMyfavouritesLnk;
	public WebElement getEleMyFavouritesLnk()
	{
		return eleMyfavouritesLnk;
	}
	@FindBy(id="com.abof.android:id/women_text")
	private WebElement eleReferaFriendLnk;
	public WebElement getEleReferaFriendLnk()
	{
		return eleReferaFriendLnk;
	}
	@FindBy(id="com.abof.android:id/women_text")
	private WebElement eleMoreLnk;
	public WebElement getEleMoreLnk()
	{
		return eleMoreLnk;
	}
	@FindBy(id="com.abof.android:id/support_text")
	private WebElement eleAbofSupportLnk;
	public WebElement getEleAbofSupportLnk()
	{
		return eleAbofSupportLnk;
	}
	@FindBy(id="com.abof.android:id/about_text")
	private WebElement eleAboutAbofLnk;
	public WebElement getEleAboutAbofLnk()
	{
		return eleAboutAbofLnk;
	}
	@FindBy(id="com.abof.android:id/tc_text")
	private WebElement eleTermsAndConditionsLnk;
	public WebElement getEleTermsAndConditionsLnk()
	{
		return eleTermsAndConditionsLnk;
	}
	@FindBy(id="com.abof.android:id/privacy_text")
	private WebElement elePrivacyPolicyLnk;
	public WebElement getElePrivacyPolicyLnk()
	{
		return elePrivacyPolicyLnk;
	}
	@FindBy(id="com.abof.android:id/return ele_text")
	private WebElement  eleReturnAndExchangeLnk;
	public WebElement getEleReturnAndExchangeLnk()
	{
		return eleReturnAndExchangeLnk;
	}
	@FindBy(id="com.abof.android:id/style_text")
	private WebElement eleStylePreferenceLnk;
	public WebElement getEleStylePreferenceLnk()
	{
		return eleStylePreferenceLnk;
	}
	@FindBy(id="com.abof.android:id/bucks_text")
	private WebElement eleAbofBucksAndGiftCardsLnk;
	public WebElement getEleAbofBucksAndGiftCardsLnk()
	{
		return eleAbofBucksAndGiftCardsLnk;
	}
	@FindBys({@FindBy(id="com.abof.android:id/txtProductName")})
	private List<WebElement> eleMyFavoriteProductLst;
	public List<WebElement> getEleMyFavoriteProductLst()
	{
		return eleMyFavoriteProductLst;
	}
	@FindBys({@FindBy(xpath="//class='android.widget.TextView'")})
	private List<WebElement> eleHamburgerCategoryLst;
	public List<WebElement> getElehamburgerCategoryLst()
	{
		return eleHamburgerCategoryLst;
	}
	
	
	// reusable method 
	
	// selecting main category and sub category
	public void getSubmenu(String category) throws InterruptedException
	{
	  for(int i=0;i<=getElehamburgerCategoryLst().size();i++)
	  {
		  if(getElehamburgerCategoryLst().get(i).getText().equals(category))
		  {
			  getElehamburgerCategoryLst().get(i).click();
			  
		  }
	  }
	  
	}
	
	//to check, after choosing an item as fav,whether it is available in favorite list
	public void checkFavProduct(String product)
	{
		for(int i=0;i<getEleMyFavoriteProductLst().size();i++)
		{
			if(getEleMyFavoriteProductLst().get(i).getText().equals(product))
			{
				NXGReports.addStep("Selected item is in favorite list", LogAs.PASSED,null);
				break;
			}
			
			
		}
	}
	
}
