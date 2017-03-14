package com.abof.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class SkultPO {
	
	AndroidDriver driver;
	
	public SkultPO(AndroidDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(id="com.abof.android:id/video_layout")
	private WebElement eleSkultVideoLayout;
	public WebElement getEleSkultVideoLayout() {
		return eleSkultVideoLayout;
	}
	@FindBy(id="com.abof.android:id/play")
	private WebElement eleSkultVideoPlayBtn;
	public WebElement getEleSkultVideoPlayBtn() {
		return eleSkultVideoPlayBtn;
	}
	@FindBy(xpath="//android.widget.Button[@text='View All Products']")
	private WebElement eleViewAllProductsBtn;
	public WebElement getEleViewAllProductsBtn() {
		return eleViewAllProductsBtn;
	}
	@FindBy(xpath="//android.widget.Button[@text='View All Looks']")
	private WebElement eleViewAllLooksBtn;
	public WebElement getEleViewAllLooksBtn() {
		return eleViewAllLooksBtn;
	}

}
