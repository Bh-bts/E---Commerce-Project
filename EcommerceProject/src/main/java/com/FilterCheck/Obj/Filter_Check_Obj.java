package com.FilterCheck.Obj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Browsers.Util.AllBrowsers;

public class Filter_Check_Obj extends AllBrowsers {
	
	public @FindBy(xpath = "//a[@title='Women']") WebElement Women_btn;
	public @FindBy(xpath = "//input[@id='layered_category_4']") WebElement Tops_Chbox;
	public @FindBy(xpath = "//input[@id='layered_category_8']") WebElement Dress_Chbox;
	public @FindBy(xpath = "//div[@class='product-count']") WebElement Show_items_count;
	public @FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?id_category=3&controller=category#categories-tops']/span") WebElement Tops_cout;
	public @FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?id_category=3&controller=category#categories-dresses']/span") WebElement Dress_cout;
	
	
	

}
