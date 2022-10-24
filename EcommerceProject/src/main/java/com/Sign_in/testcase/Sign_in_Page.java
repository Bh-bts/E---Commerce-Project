package com.Sign_in.testcase;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;

import com.Sign_in.Obj.Sign_in_Obj;

public class Sign_in_Page extends Sign_in_Obj {

	public void RegisteredAccount() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		try {

			js.executeScript("arguments[0].style.border='2px solid red'", Sign_in_but);
			Sign_in_but.click();
			js.executeScript("arguments[0].style.border='2px solid red'", Email);
			Email.sendKeys("bhavin.thumar@drcsystems.com");
			js.executeScript("arguments[0].style.border='2px solid red'", password);
			password.sendKeys("Drc@1234");
			js.executeScript("arguments[0].style.border='2px solid red'", Signin_but);
			Signin_but.click();

		} catch (NoSuchElementException e1) {
			System.out.println(e1.getMessage());

		}

	}

}
