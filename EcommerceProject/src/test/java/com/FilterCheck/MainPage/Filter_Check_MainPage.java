package com.FilterCheck.MainPage;

import com.Browsers.Util.AllBrowsers;
import com.FilterCheck.testcase.Filter_Check_Page;

public class Filter_Check_MainPage extends Filter_Check_Page {

	public Filter_Check_MainPage() {
		AllBrowsers.driver = AllBrowsers.startBrowser("chrome", Weburl);
	}
	
	
	
	
	
}
