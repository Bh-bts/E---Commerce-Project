package com.ItemPurchase.Obj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.Browsers.Util.AllBrowsers;

public class Item_Purchase_Obj extends AllBrowsers{
	
	public @FindBy(xpath = "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[@title='T-shirts']") WebElement t_shirts_button;
	public @FindBy(id = "layered_price_range") WebElement Act_range;
	public @FindBy(xpath = "//a[@class='ui-slider-handle ui-state-default ui-corner-all'][2]") WebElement Right_drag;
	public @FindBy(xpath = "//div[@class='ui-slider-range ui-widget-header ui-corner-all']") WebElement slider;
	public @FindBy(xpath = "//a[@class='product_img_link']/img[@class='replace-2x img-responsive']") WebElement product1;
	public @FindBy(xpath = "//a[@class='button ajax_add_to_cart_button btn btn-default']/span") WebElement Add_to_cart_But;
	public @FindBy(xpath = "//div[@class='layer_cart_product col-xs-12 col-md-6']/h2") WebElement succ_mess;
	public @FindBy(xpath = "//a[@class='btn btn-default button button-medium']/span/i") WebElement checkout_but;
	public @FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']") WebElement Proceed_Checkout;
	public @FindBy(xpath = "//textarea") WebElement Comment_order;
	public @FindBy(xpath = "//button[@name='processAddress']") WebElement Proceed_Checkout2;
	public @FindBy(xpath = "//input[@id='cgv']") WebElement Terms;
	public @FindBy(xpath = "//button[@class='button btn btn-default standard-checkout button-medium']") WebElement Proceed_Checkout3; 
	public @FindBy(xpath = "//tr/td[@id='total_product']") WebElement total_pro;
	public @FindBy(xpath = "//tr/td[@id='total_shipping']") WebElement total_ship;
	public @FindBy(xpath = "//tr/td[@id='total_price_container']") WebElement total;
	public @FindBy(xpath = "//a[@class='bankwire']") WebElement PayBank;
	public @FindBy(xpath = "//button[@class='button btn btn-default button-medium']") WebElement Cnf_order;
	public @FindBy(xpath = "//p[@class='cheque-indent']/strong") WebElement orderMessage;
	public @FindBy(xpath = "//span[@class='price']") WebElement amount;
	
	
	

}
