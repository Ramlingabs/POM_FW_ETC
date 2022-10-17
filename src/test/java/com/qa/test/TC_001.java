package com.qa.test;

import org.testng.annotations.Test;
import com.qa.setup.SetUp;
import com.qa.utility.Excel;
import com.qa.utility.ExtentReporter;
import com.qa.utility.Utility;

public class TC_001 extends SetUp {

	@Test
	public void method1() {


		ExtentReporter.logPass("Step 1 TC_001");
		ExtentReporter.logPass("Step 2 some step TC_001");
		ExtentReporter.logPassWithScreenShot("Step 3 some step TC_001");
		ExtentReporter.logPass("Step 4 some step  tc name ->>"+Excel.getData(TC_ID, "TC_Name"));
	
		
		
	}
}
