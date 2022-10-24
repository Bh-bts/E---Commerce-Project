package com.ItemPurchase.MainPage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Browsers.Util.AllBrowsers;
import com.ItemPurchase.testcase.Item_Purchase_Page;
import com.Sign_in.testcase.Sign_in_Page;

public class Item_Purchase_MainPage extends Sign_in_Page {

	public Item_Purchase_MainPage() {
		AllBrowsers.driver = AllBrowsers.startBrowser("chrome", Weburl);
	}

	@Test(priority = 1)

	public void signin() {
		Sign_in_Page SignIn = PageFactory.initElements(driver, Sign_in_Page.class);
		SignIn.RegisteredAccount();
	}

	@Test(priority = 2)
	public void Item_Added() {

		Item_Purchase_Page blank1 = PageFactory.initElements(driver, Item_Purchase_Page.class);
		blank1.ItemAdded();

	}

}
