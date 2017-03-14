package com.abof.pageobjects;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.abof.library.BaseLib;
import com.abof.library.GenericLib;
import com.kirwa.nxgreport.NXGReports;
import com.kirwa.nxgreport.logging.LogAs;

import io.appium.java_client.android.AndroidDriver;

public class LoginPagePO {
	public AndroidDriver driver;
	String sData[] = null;

	public LoginPagePO(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Facebook Login
	@FindBy(id = "com.abof.android:id/fb_login_btn")
	private WebElement eleSignInFacebookLnkTab;

	public WebElement getElesignInFacebookLnkTab() {
		return eleSignInFacebookLnkTab;
	}

	@FindBy(xpath = "//android.widget.EditText[@text='Email address or phone number']")
	private WebElement eleWoEmailorPhoneTxtBox;

	public WebElement getWoEleWEmailorPhoneTxtBox() {
		return eleWoEmailorPhoneTxtBox;
	}

	@FindBy(xpath = "//android.widget.EditText[@index='1']")
	private WebElement eleWoFbPasswordTxtBox;

	public WebElement getWoEleFbPasswordTxtBox() {
		return eleWoFbPasswordTxtBox;
	}

	@FindBy(xpath = "//android.widget.Button[@index='1'")
	private WebElement eleWoFbLoginBtn;

	public WebElement getWoEleFbLoginBtn() {
		return eleWoFbLoginBtn;
	}

	@FindBy(xpath = "//android.view.View[@text='Create account']")
	private WebElement eleWoFbCreateAccBtn;

	public WebElement getWoEleFbCreateAccBtn() {
		return eleWoFbCreateAccBtn;
	}

	@FindBy(id = "com.facebook.katana:id/login_username")
	private WebElement eleWtEmailorPhoneTxtBox;

	public WebElement getWtEleWEmailorPhoneTxtBox() {
		return eleWtEmailorPhoneTxtBox;
	}

	@FindBy(id = "com.facebook.katana:id/login_password")
	private WebElement eleWtFbPasswordTxtBox;

	public WebElement getWtEleFbPasswordTxtBox() {
		return eleWtFbPasswordTxtBox;
	}

	@FindBy(id = "com.facebook.katana:id/login_login")
	private WebElement eleWtFbLoginBtn;

	public WebElement getWtEleFbLoginBtn() {
		return eleWtFbLoginBtn;
	}

	@FindBy(id = "com.facebook.katana:id/login_create_account_flat_button")
	private WebElement eleWtFbCreateAccBtn;

	public WebElement getWtEleFbCreateAccBtn() {
		return eleWtFbCreateAccBtn;
	}

	@FindBy(name = "Sign up for an account.")
	private WebElement eleFBLoginErrorTXtn;

	public WebElement getEleWoFBLoginErrorTxt() {
		return eleFBLoginErrorTXtn;
	}

	// Gmail Login
	@FindBy(id = "com.abof.android:id/google_login_btn")
	private WebElement eleSignInGoogleLnkTab;

	public WebElement getEleSignInGoogleLnkTab() {
		return eleSignInGoogleLnkTab;
	}

	@FindBys({ @FindBy(id = "com.google.android.gms:id/select_dialog_listview") })
	List<WebElement> eleChooseAccLst;

	public List<WebElement> getEleChooseAccLst() {
		return eleChooseAccLst;
	}

	public WebElement getEleChooseAcc(String chooseAcc) {
		return driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='" + chooseAcc + "']"));
	}

	@FindBy(id = "android:id/button1")
	private WebElement eleChooseAccOKBtn;

	public WebElement getEleChooseAccOKBtn() {
		return eleChooseAccOKBtn;
	}

	@FindBy(id = "android:id/button2")
	private WebElement eleChooseAccCancelBtn;

	public WebElement getEleChooseAccCancelBtn() {
		return eleChooseAccCancelBtn;
	}

	// Normal User
	@FindBy(id = "com.abof.android:id/login_email_edt")
	private WebElement eleEmailAddressTxtBox;

	public WebElement getEleEmailAddressTxtBox() {
		return eleEmailAddressTxtBox;
	}

	@FindBy(id = "com.abof.android:id/login_password_edt_edt")
	private WebElement elePasswordTxtBox;

	public WebElement getElePasswordTxtBox() {
		return elePasswordTxtBox;
	}

	@FindBy(id = "com.abof.android:id/abof_login_btn")
	private WebElement eleSignInBtn;

	public WebElement getEleSignInBtn() {
		return eleSignInBtn;
	}

	@FindBy(id = "com.abof.android:id/closeView")
	private WebElement loginCloseBtn;

	public WebElement getLoginCloseBtn() {
		return loginCloseBtn;
	}

	@FindBy(id = "com.abof.android:id/landing_okay_gt_it_btn")
	private WebElement eleOkayBtn;

	public WebElement getEleOkayBtn() {
		return eleOkayBtn;
	}

	@FindBy(id = "com.abof.android:id/skip")
	private WebElement eleSkipBtn;

	public WebElement getEleSkipBtn() {
		return eleSkipBtn;
	}

	// Sign UP for New User

	@FindBy(id = "com.abof.android:id/abof_newcustomer_btn")
	private WebElement eleJoinToday;

	public WebElement getEleJoinToday() {
		return eleJoinToday;
	}

	@FindBy(id = "com.abof.android:id/signup_email_edt")
	private WebElement eleSignUpEmailEdtBx;

	public WebElement getEleSignUpEmailEdtBx() {
		return eleSignUpEmailEdtBx;
	}

	@FindBy(id = "com.abof.android:id/signup_password_edt_edt")
	private WebElement eleSignUpPasswordEdtBx;

	public WebElement getEleSignUpPasswordEdtBx() {
		return eleSignUpPasswordEdtBx;
	}

	@FindBy(id = "com.abof.android:id/signup_name")
	private WebElement eleSignUpNameEdtBx;

	public WebElement getEleSignUpNameEdtBx() {
		return eleSignUpNameEdtBx;
	}

	@FindBy(id = "com.abof.android:id/signup_last_name")
	private WebElement eleSignUpLastnameEdtBx;

	public WebElement getSignUpLastnameEdtBx() {
		return eleSignUpLastnameEdtBx;
	}

	@FindBy(id = "com.abof.android:id/signup_mobile")
	private WebElement eleSignUpMobile;

	public WebElement getEleSignUpMobile() {
		return eleSignUpMobile;
	}

	@FindBy(id = "com.abof.android:id/radioGroupButton_male")
	private WebElement eleSignUpMaleRdBtn;

	public WebElement getEleSignUpMaleRdBtn() {
		return eleSignUpMaleRdBtn;
	}

	@FindBy(id = "com.abof.android:id/radioGroupButton_female")
	private WebElement eleSignUpFemaleRdBtn;

	public WebElement getEleSignUpFemaleRdBtn() {
		return eleSignUpFemaleRdBtn;
	}

	@FindBy(id = "com.abof.android:id/abof_signup_btn")
	private WebElement eleSignUpJoinAbofBtn;

	public WebElement getEleSignUpJoinAbofBtn() {
		return eleSignUpJoinAbofBtn;
	}

	// Sign up as Abof,Gmail or facebook user
	public void signUpUser(String user, String gender) {
		switch (user) {
		case "ABOF":
			sData = GenericLib.toReadExcelData("Login", "TC_Login_002");
			getEleJoinToday().click();
			getEleSignUpEmailEdtBx().sendKeys("Email0");
			getEleSignUpNameEdtBx().sendKeys("Fname");
			getEleSignUpPasswordEdtBx().sendKeys("pwd");
			getEleSignUpMobile().sendKeys("Mob");
			if (gender.equals("F")) {
				getEleSignUpFemaleRdBtn().click();
			} else {
				getEleSignUpMaleRdBtn().click();
			}
			getEleSignUpJoinAbofBtn().click();
			break;
		}
	}

	//
	public void loginApp(String user) throws InterruptedException {

		switch (user) {
		case "ABOF":
			sData = GenericLib.toReadExcelData("Login", "TC_Login_002");
			getEleEmailAddressTxtBox().sendKeys("abofqa.srinivascbt@gmail.com");
			handleKeyboard();
			getElePasswordTxtBox().sendKeys("srini_49");
			handleKeyboard();
			BaseLib.waitForElement(getEleSignInBtn(), "Sign In button is displayed", "Sign In button is not displayed");
			getEleSignInBtn().click();
			break;

		case "FB":
			sData = GenericLib.toReadExcelData("Login", "TC_Login_004");
			BaseLib.waitForElement(getElesignInFacebookLnkTab(), "Facebook link tab is displayed",
					"Facebook link tab is not displayed");
			getElesignInFacebookLnkTab().click();
			Thread.sleep(10000);
			// code for FB installed app
			if (driver.isAppInstalled(BaseLib.FB)) {
				NXGReports.addStep("Facebook app is installed", LogAs.PASSED, null);
				BaseLib.waitForElement(getWtEleWEmailorPhoneTxtBox(), "Email or Phone number textfld is displayed",
						"Email or Phone number textfld is not displayed");
				getWtEleWEmailorPhoneTxtBox().sendKeys(sData[2]);
				BaseLib.waitForElement(getWtEleFbPasswordTxtBox(), "Password textfld is displayed",
						"Password textfld is not displayed");
				getWtEleFbPasswordTxtBox().sendKeys(sData[3]);
				BaseLib.waitForElement(getWtEleFbPasswordTxtBox(), "Login button is displayed",
						"Login button is not displayed");
				getWtEleFbLoginBtn().click();
			}
			// ccode for FB uninstalled app
			else {
				BaseLib.switchToView();
				BaseLib.waitForElement(getWoEleWEmailorPhoneTxtBox(), "Email or Phone number textfld is displayed",
						"Email or Phone number textfld is not displayed");
				getWoEleWEmailorPhoneTxtBox().sendKeys(sData[2]);
				BaseLib.waitForElement(getWoEleFbPasswordTxtBox(), "Password textfld is displayed",
						"Password textfld is not displayed");
				getWoEleFbPasswordTxtBox().sendKeys(sData[3]);
				BaseLib.waitForElement(getWoEleWEmailorPhoneTxtBox(), "Login button is displayed",
						"Login button is not displayed");
				getWoEleFbLoginBtn().click();
			}
			break;

		case "GMAIL":
			sData = GenericLib.toReadExcelData("Login", "TC_Login_002");
			BaseLib.waitForElement(getEleSignInGoogleLnkTab(), "Sign In with google link tab is displayed",
					"Sign In with google link tab is not displayed");
			getEleSignInGoogleLnkTab().click();
			BaseLib.waitForElement(getEleChooseAcc(sData[2]), "option is displayed", "option is not displayed");
			getEleChooseAcc(sData[2]).click();
			BaseLib.waitForElement(getEleChooseAccOKBtn(), "Choosing account 'OK' button is displayed",
					"Choosing account 'OK' button is not displayed");
			getEleChooseAccOKBtn().click();
			break;
		}

	}

	// to handle Okay Got it button
	public void handleOkayBtn() {
		try {
			getEleOkayBtn().click();
		} catch (Exception e) {
		}

	}

	// to handle keyboard
	public void handleKeyboard() {
		try {
			driver.hideKeyboard();
		} catch (Exception e) {
		}
	}

}
