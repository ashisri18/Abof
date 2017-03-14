package com.abof.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.abof.library.BaseLib;
import com.kirwa.nxgreport.NXGReports;
import com.kirwa.nxgreport.logging.LogAs;

import io.appium.java_client.android.AndroidDriver;

//this page class will contain product related info and PLP and PDP verifcation
public class ProductPO {
	
	AndroidDriver driver;
	public ProductPO(AndroidDriver driver) {
	    this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="com.abof.android:id/search_icn")
	private WebElement elePlpSearchIcon;
	public WebElement getEleplpSearchIcon(){
		return elePlpSearchIcon;
	}
	@FindBy(id="com.abof.android:id/fav_icn")
	private WebElement elePlpNotificationIcon;
	public WebElement getElePlpNotificationIcon(){
		return elePlpNotificationIcon;
	}
	@FindBy(id="com.abof.android:id/cart_icn")
	private WebElement eleCartIcon;
	public WebElement getEleCartIcon(){
		return eleCartIcon;
	}
	@FindBy(id="com.abof.android:id/title")
	private WebElement elePlpCategoryName;
	public WebElement getElePlpCategoryName(){
		return elePlpCategoryName;
	}
	@FindBy(id="com.abof.android:id/actionbarTitle")
	private WebElement elePdpCategoryName;
	public WebElement getElePdpCategoryName(){
		return elePdpCategoryName;
	}
	@FindBy(id="com.abof.android:id/fave_img_view")
	private WebElement elePlpFavIcon;
	public WebElement getElePlpFavIcon(){
		return elePlpFavIcon;
	}
	@FindBys({@FindBy(id="com.abof.android:id/fave_img_view")})
	private List<WebElement> elePlpFavLst;
	public List<WebElement> getElePlpFavLst(){
		return elePlpFavLst;
	}
	@FindBy(id="com.abof.android:id/pdp_name")
	private WebElement elePdpProductName;
	public WebElement getElePdpProductName(){
		return elePdpProductName;
	}
	@FindBy(id="com.abof.android:id/prduct_name")
	private WebElement elePlpProductName;
	public WebElement getElePlpProductName(){
		return elePlpProductName;
	}
	@FindBy(id="com.abof.android:id/offer_price")
	private WebElement elePlpProductPrice;
	public WebElement getElePlpProductPrice(){
		return elePlpProductPrice;
	}
    @FindBy(id="com.abof.android:id/pdp_discount_price")
	private WebElement elePdpProductPrice;
	public WebElement getElePdpProductPrice(){
		return elePdpProductPrice;
	}
	@FindBy(id="com.abof.android:id/switchtolist")
	private WebElement elePlpSwitchtoListIcon;
	public WebElement getElePlpSwitchtoListIcon(){
		return elePlpSwitchtoListIcon;
	}
	@FindBy(id="com.abof.android:id/img_filter")
	private WebElement elePlpFilterIcon;
	public WebElement getElePlpFilterIcon(){
		return elePlpFilterIcon;
	}
	@FindBy(xpath="//android.widget.ImageButton[contains(@content-desc,'Navigate up')]")
	private WebElement elePlpbackBtn;
	public WebElement getElePlpBackBtn(){
		return elePlpbackBtn;
	}
	@FindBy(id="com.abof.android:id/txt_product_count")
	private WebElement elePlpProductCountTxt;
	public WebElement getElePlpProductCountTxt(){
		return elePlpProductCountTxt;
	}
	@FindBy(xpath="//android.widget.Button[contains(@text,'ADD TO BAG')]")
	private WebElement eleAddToBagBtn;
	public WebElement getEleAddToBagBtn(){
		return eleAddToBagBtn;
	}
	@FindBy(id="com.abof.android:id/pdp_save_for_later_icon2")
	private WebElement eleSaveForLaterLnk;
	public WebElement getEleSaveForLaterLnk(){
		return eleSaveForLaterLnk;
	}
	@FindBy(id="com.abof.android:id/pdp_share2")
	private WebElement eleShareLnk;
	public WebElement getEleShareLnk(){
		return eleShareLnk;
	}
	@FindBy(id="com.abof.android:id/pdp_size_guide_text")
	private WebElement eleSizeGuideLnk;
	public WebElement getEleSizeGuideLnk(){
		return eleSizeGuideLnk;
	}
	@FindBy(id="com.abof.android:id/pdp_colors_text")
	private WebElement eleColorTxt;
	public WebElement getEleColorTxt(){
		return eleColorTxt;
	}
	@FindBy(id="com.abof.android:id/pdp_size_text")
	private WebElement eleSizeTxt;
	public WebElement getEleSizeTxt(){
		return eleSizeTxt;
	}
	@FindBys({@FindBy(id="com.abof.android:id/product_img_view")})
	private List<WebElement> eleProductLst;
	public List<WebElement> getEleProductLst(){
		return eleProductLst;
	}
	@FindBy(id="com.abof.android:id/filter_header_back_txt")
	private WebElement eleFilterCloseBtn;
	public WebElement getEleFilterCloseBtn(){
		return eleFilterCloseBtn;
	}
	@FindBy(xpath="//android.widget.TextView[contains(@text,'Sort')]")
	private WebElement eleSort;
	public WebElement getEleSort(){
		return eleSort;
	}
    @FindBy(xpath="//android.widget.TextView[contains(@text,'Gender')]")
	private WebElement eleGender;
	public WebElement getEleGender(){
		return eleGender;
	}
	@FindBy(xpath="//android.widget.TextView[contains(@text,'Product')]")
	private WebElement eleProduct;
	public WebElement getEleProduct(){
		return eleProduct;
	}
	@FindBy(xpath="//android.widget.TextView[contains(@text,'Price')]")
	private WebElement elePrice;
	public WebElement getElePrice(){
		return elePrice;
	}
	@FindBy(xpath="//android.widget.TextView[contains(@text,'Size')]")
	private WebElement eleSize;
	public WebElement getEleSize(){
		return eleSize;
	}
	@FindBy(xpath="//android.widget.TextView[contains(@text,'Brand')]")
	private WebElement eleBrand;
	public WebElement getEleBrand()
	{
		return eleBrand;
	}	
    @FindBy(xpath="//android.widget.TextView[contains(@text,'Colour')]")
	private WebElement eleColour;
	public WebElement getEleColour()
	{
		return eleColour;
	}
	@FindBy(xpath="//android.widget.TextView[contains(@text,'Popularity')]")
	private WebElement elePopularity;
	public WebElement getElePopularity()
	{
		return elePopularity;
	}
	@FindBy(xpath="//android.widget.TextView[contains(@text,'Newest')]")
	private WebElement eleNewest;
	public WebElement getEleNewest()
	{
		return eleNewest;
	}
	@FindBy(xpath="//android.widget.TextView[contains(@text,'Discount')]")
	private WebElement eleDiscount;
	public WebElement getEleDiscount()
	{
		return eleDiscount;
	}
	@FindBy(xpath="//android.widget.TextView[contains(@text,'Price-High to Low')]")
	private WebElement elePriceHighToLow;
	public WebElement getElePriceHighToLow()
	{
		return elePriceHighToLow;
	}	
	@FindBy(xpath="//android.widget.TextView[contains(@text,'Price-Low to High')]")
	private WebElement elePriceLowToHigh;
	public WebElement getElePriceLowToHigh()
	{
		return elePriceLowToHigh;
	}
	@FindBy(id="com.abof.android:id/filter_clear_bt")
	private WebElement eleClearAll;
	public WebElement getEleClearAll()
	{
		return eleClearAll;
	}
	@FindBy(id="com.abof.android:id/filter_product_count")
	private WebElement eleProductCount;
	public WebElement getEleProductCount()
	{
		return eleProductCount;
	}
	@FindBy(id="com.abof.android:id/img_filter_tick")
	private WebElement eleFilterTick;
	public WebElement getEleFilterTick()
	{
		return eleFilterTick;
    }
	@FindBys({@FindBy(id="com.abof.android:id/text")})
	private List<WebElement> eleFilterBrandLst;
	public List<WebElement> getEleFilterBrandLst()
	{
		return eleFilterBrandLst;
	}
	@FindBys({@FindBy(id="com.abof.android:id/prduct_name")})
	private List<WebElement> eleProductNameLst;
	public List<WebElement> getEleProductNameLst()
	{
		return eleProductNameLst;
	}
	@FindBy(id="com.abof.android:id/arrowview")
	private WebElement eleSelectSize;
	public WebElement getSelectSize()
	{
		return eleSelectSize;
	}
	@FindBys({@FindBy(id="com.abof.android:id/pdp_sizename")})
	private List<WebElement> eleSizeGridLst;
	public List<WebElement> getEleSizeGridLst()
	{
		return eleSizeGridLst;
	}
	//this is to check all webElement of PLP
	public void verifyPLPContent(){
		BaseLib.waitForElement(getElePlpBackBtn(),"Back button is displayed in PLP page","Back button is not displayed in PLP page");
		BaseLib.waitForElement(getElePlpCategoryName(),"Category name is displayed in PLP page" ,"Category name is not displayed in PLP page" );
		BaseLib.waitForElement(getEleplpSearchIcon(),"Search icon is displayed in PLP page","Search icon is not displayed in PLP page");
		BaseLib.waitForElement(getElePlpNotificationIcon(),"Notification icon is displayed in PLP page", "Notification icon is displayed in PLP page");
		BaseLib.waitForElement(getEleCartIcon(),"Cart icon is displayed in PLP page","Cart icon is displayed in PLP page");
		BaseLib.waitForElement(getElePlpProductCountTxt(),"Product count is displayed in PLP page","Product count is not displayed in PLP page");
		BaseLib.waitForElement(getElePlpSwitchtoListIcon(),"Switch to list icon is displayed", "Switch to list icon is displayed in PLP page");
		BaseLib.waitForElement(getElePlpProductName(),"Product name is displayed","Product Name is not displayed");
		BaseLib.waitForElement(getElePlpProductPrice(),"Product price is displayed","Product price is not displayed");
		BaseLib.waitForElement(getElePlpFavIcon(),"Favorite(heart) icon is displayed","Favorite(heart) icon is  not displayed");
		BaseLib.waitForElement(getElePlpFilterIcon(),"Filter icon is displayed","Filter icon is not displayed");
		
	}
	public void verifyPDPContent(){
		BaseLib.waitForElement(getElePdpCategoryName(),"Category name is displayed in PDP page" ,"Category name is not displayed in PDP page" );
		BaseLib.waitForElement(getEleplpSearchIcon(),"Search icon is displayed in PDP page","Search icon is not displayed in PDP page");
		BaseLib.waitForElement(getElePlpNotificationIcon(),"Notification icon is displayed in PDP page", "Notification icon is displayed in PDP page");
		BaseLib.waitForElement(getEleCartIcon(),"Cart icon is displayed in PDP page","Cart icon is displayed in PDP page");
		BaseLib.waitForElement(getElePdpProductName(),"Product name is displayed","Product Name is not displayed");
		BaseLib.waitForElement(getElePdpProductPrice(),"Product price is displayed","Product price is not displayed");
		BaseLib.waitForElement(getEleSaveForLaterLnk(),"SaveForLater Link is displayed in PDP page","SaveForLater Link is not displayed in PDP page");
		BaseLib.waitForElement(getEleSizeGuideLnk(),"SizeGuide Link is displayed in PDP page","SizeGuide Link is not displayed in PDP page");
		BaseLib.waitForElement(getEleShareLnk(),"Share Link is displayed in PDP page","Share Link is displayed in PDP page");
		BaseLib.waitForElement(getEleColorTxt(),"Color Text is displayed in PDP page","Color Text is displayed in PDP page");
		BaseLib.waitForElement(getEleSizeTxt(),"Size Text is displayed in PDP page","Size Text is displayed in PDP page");
	
	}
	public void verifyFilterScreenContent(){
		BaseLib.waitForElement(getEleFilterCloseBtn(),"	 FilterClose Button is displayed in PDP page" ,"  FilterClose Button is not displayed in PDP page" );
		BaseLib.waitForElement(getEleProductCount(),"	ProductCount is displayed in PDP page" ,"ProductCount is not displayed in PDP page" );
		BaseLib.waitForElement(getEleClearAll(),"	ClearAll is displayed in PDP page" ,"ClearAll is not displayed in PDP page" );
		BaseLib.waitForElement(getEleSort(),"	Sort is displayed in PDP page" ," Sortis not displayed in PDP page" );
		BaseLib.waitForElement(getEleGender(),"	Gender is displayed in PDP page" ," Gender is not displayed in PDP page" );
		BaseLib.waitForElement(getElePrice()," Price	 is displayed in PDP page" ,"  Price is not displayed in PDP page" );
		BaseLib.waitForElement(getEleSize(),"	Size is displayed in PDP page" ," Size is not displayed in PDP page" );
		BaseLib.waitForElement(getEleBrand(),"	Brand is displayed in PDP page" ,"Brand is not displayed in PDP page" );
		BaseLib.waitForElement(getEleColour(),"	 Colour is displayed in PDP page" ," Colour is not displayed in PDP page" );
		BaseLib.waitForElement(getElePopularity(),"	Popularity is displayed in PDP page" ,"Popularity is not displayed in PDP page" );
		BaseLib.waitForElement(getEleNewest(),"	Newest is displayed in PDP page" ," Newest is not displayed in PDP page" );
		BaseLib.waitForElement(getEleDiscount(),"Discount is displayed in PDP page" ,"Discount is not displayed in PDP page" );
		BaseLib.waitForElement(getElePriceHighToLow(),"PriceHighToLow	 is displayed in PDP page" ,"PriceHighToLow is not displayed in PDP page" );
		BaseLib.waitForElement(getElePriceLowToHigh(),"PriceLowToHigh	 is displayed in PDP page" ,"PriceLowToHigh is not displayed in PDP page" );
		BaseLib.waitForElement(getEleFilterTick(),"	FilterTick is displayed in PDP page" ,"FilterTick is not displayed in PDP page" );
	
	}
	
	

	public void filterBasedOnSortOption(String Option)
	{
		
		 driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'"+Option+"')]/../android.widget.RelativeLayout[contains(@resource-id,'com.abof.android:id/filter_bt_layout')]")).click();
		
		 NXGReports.addStep(" Given Filter Option is selected ", LogAs.PASSED,null);
		 getEleFilterTick().click();
		 NXGReports.addStep(" filterTick is clicked", LogAs.PASSED,null);
		 
		}
	
	
	public void filterBasedOnBrands(String Brandname) throws InterruptedException
	{
		int flag=0;
	
		   System.out.println(getEleFilterBrandLst().size());
		   
			for(int i=0;i<=getEleFilterBrandLst().size();i++)
			{
				if(getEleFilterBrandLst().get(i).getText().contains(Brandname))
				{
					System.out.println(getEleFilterBrandLst().get(i).getText());
					getEleFilterBrandLst().get(i).click();
					
					Thread.sleep(10000);
					break;
				}
			}
		
			getEleFilterTick().click();
		
			for(int j=0;j<=getEleProductNameLst().size()-1;j++)
			{
			
				if(!(getEleProductNameLst().get(j).getText().contains(Brandname)))
				{
					flag=1;
					break;
				}
			}
		
			if(flag==1)
			{
				System.out.println(" PLP doesn't contain this brand");
			}
			else{
				System.out.println(" PLP contain same brand");
			}
		
	
	
          }

	
	public void getSize(String size)
	{
		
	
		getSelectSize().click();
	
	
		for(int i=0;i<=getEleSizeGridLst().size()-1;i++)
		{
		
			if(getEleSizeGridLst().get(i).getText().equalsIgnoreCase(size))
			{
				
				getEleSizeGridLst().get(i).click();
				NXGReports.addStep("Given size:"+size+"is clicked", LogAs.PASSED,null );
				break;
			}
		}
		
	}
	
	     
	
}
