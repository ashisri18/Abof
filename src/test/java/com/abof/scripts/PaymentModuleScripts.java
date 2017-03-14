package com.abof.scripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abof.library.BaseLib;
import com.abof.pageobjects.LoginPagePO;

public class PaymentModuleScripts extends BaseLib {

	@Parameters("device")
	@Test(enabled=true,priority=1,description="testinmg now")
	public void sample(String device) throws InterruptedException{
		new LoginPagePO(driver).loginApp("ABOF");
	}
}
