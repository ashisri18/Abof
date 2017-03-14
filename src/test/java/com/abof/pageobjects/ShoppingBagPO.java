package com.abof.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class ShoppingBagPO {

   AndroidDriver driver;
	public ShoppingBagPO(AndroidDriver driver) {
	
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(name="shopping bag")
	private WebElement eleShoppingBagTxt;
	public WebElement getEleShoppingBagTxt()
	{
		return eleShoppingBagTxt;
		
	}

	@FindBy(id="com.abof.android:id/button_place_order")
	private WebElement elePlaceOrderBtn;
	public WebElement getElePlaceOrderBtn()
	{
		return elePlaceOrderBtn;
		
	}
	
	
	@FindBy(name="Delivery Address")
	private WebElement eleDeliveryAddressTxt;
	public WebElement getEleDeliveryAddressTxt()
	{
		return eleDeliveryAddressTxt;
		
	}
}
