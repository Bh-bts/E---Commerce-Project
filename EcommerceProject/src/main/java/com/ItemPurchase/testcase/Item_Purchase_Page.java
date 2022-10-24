package com.ItemPurchase.testcase;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import com.ItemPurchase.Obj.Item_Purchase_Obj;

public class Item_Purchase_Page extends Item_Purchase_Obj {

	public void ItemAdded() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		try {

			t_shirts_button.click();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));

			js.executeScript("arguments[0].scrollIntoView();", product1);
			Actions act = new Actions(driver);
			act.moveToElement(product1).perform();

			Add_to_cart_But.click();
			Thread.sleep(5000);
			String cssPath = ".right";
			js.executeScript("document.querySelector(arguments[0],':before').click();", cssPath);
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
			js.executeScript("arguments[0].scrollIntoView();", Proceed_Checkout);
			Proceed_Checkout.click();
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
			js.executeScript("arguments[0].style.border='2px solid red'", Comment_order);
			Comment_order.sendKeys("Test order comment");
			
			js.executeScript("arguments[0].style.border='2px solid red'", Proceed_Checkout2);
			Proceed_Checkout2.click();
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
			js.executeScript("arguments[0].style.border='2px solid red'", Terms);
			Terms.click();
			
			js.executeScript("arguments[0].style.border='2px solid red'", Proceed_Checkout3);
			Proceed_Checkout3.click();
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
			js.executeScript("arguments[0].style.border='2px solid red'", PayBank);
			PayBank.click();
			
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
			js.executeScript("arguments[0].style.border='2px solid red'", Cnf_order);
			Cnf_order.click();
			
			js.executeScript("arguments[0].style.border='2px solid red'", orderMessage);
			String message = orderMessage.getText();
			System.out.println("Order message : " + message);
			
			String price = amount.getText();
			System.out.println("Amount is paid to : " + price);
			
			
		} catch (NoSuchElementException e1) {
			System.out.println(e1.getMessage());
		} catch (InterruptedException e2) {
			System.out.println(e2.getMessage());
		}

	}

}
