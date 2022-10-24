package com.Sign_in.Obj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.ItemPurchase.testcase.Item_Purchase_Page;

public class Sign_in_Obj extends Item_Purchase_Page {
	
	public @FindBy(xpath = "//a[@class='login']") WebElement Sign_in_but;
	public @FindBy(xpath = "//div[@class='form-group']/input[@id='email']") WebElement Email;
	public @FindBy(xpath = "//div[@class='form-group']/span/input") WebElement password;
	public @FindBy(xpath = "//p[@class='submit']/button") WebElement Signin_but;
	

}
