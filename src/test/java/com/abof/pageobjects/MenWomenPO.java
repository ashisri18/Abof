package com.abof.pageobjects;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.abof.library.BaseLib;

import io.appium.java_client.android.AndroidDriver;


public class MenWomenPO
{
	  AndroidDriver driver;
	 
	   public MenWomenPO(AndroidDriver driver)
	   {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);		
	   }
		
		@FindBy(xpath="//android.widget.TextView[contains(@text,'MEN')]")
	    private WebElement eleMenModule;
		
		public WebElement getEleMenModule() {
			return eleMenModule;
		}
		
		@FindBy(xpath="//android.widget.TextView[cont@text,'WOMEN']")
	    private WebElement womenModule;
		public WebElement getEleWomenModule(){
			return eleMenModule;
		}
		
		@FindBys({
			@FindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.abof.android:id/land_category_txt')]")
			})
		private List<WebElement>  eleSubCategoryLst;
		public List<WebElement>  getEleSubCategoryLst()
		{
			return eleSubCategoryLst;
		}
		
		@FindBys({
			@FindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.abof.android:id/text')]")
			})
		private List<WebElement>  eleviewAllBrandLst;
		public List<WebElement>  getEleviewAllBrandLst()
		{
			return eleviewAllBrandLst;
		}
		
		@FindBy(id="com.abof.android:id/trending_brand_text")
	    private WebElement eleViewAllBtn;
		
		public WebElement getEleViewAllBtn() {
			return eleViewAllBtn;
		}
		
		
		@FindBy(id="com.abof.android:id/brand_search")
	    private WebElement eleViewAllSearchTxtBx;
		
		public WebElement getEleViewAllSearchTxtBx() {
			return eleViewAllSearchTxtBx;
		}

		@FindBys({
			@FindBy(xpath="//android.widget.ImageView[contains(@resource-id,'com.abof.android:id/brand_image')]")
			})
		private List<WebElement>  eleShopBrandLst;
		public List<WebElement>  getEleShopBrandLst()
		{
			return eleShopBrandLst;
		}
		
		public void getSubmenu(String Index,String subCategory) throws InterruptedException
		{
			
		    driver.findElement(By.xpath("//android.widget.RelativeLayout[contains(@index,'"+Index+"')]")).click();
		
						for(int j=0;j<=getEleSubCategoryLst().size();j++)
							{
							 						
					            if(getEleSubCategoryLst().get(j).getText().contains(subCategory))
					                  {
					            		getEleSubCategoryLst().get(j).click();
					                  }
							}
						
		}
	
		
	
	
		
		
}
