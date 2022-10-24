package com.FilterCheck.testcase;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;

import com.FilterCheck.Obj.Filter_Check_Obj;

public class Filter_Check_Page extends Filter_Check_Obj {

	public void Categories() {

		try {
			Women_btn.click();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			Tops_Chbox.click();
			
			

		} catch (NoSuchElementException e1) {
			System.out.println(e1.getMessage());
		}
	}

}
