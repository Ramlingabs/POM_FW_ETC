package com.qa.utility;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.setup.SetUp;

public class ActionElement extends SetUp {

	public void click_Object(WebElement obj, String eleName) {
		try {
			obj.click();
			ExtentReporter.logPass(eleName+" : Clicked successfully");
		} catch (Exception e) {
			ExtentReporter.logFail(eleName+" : NOT Clicked successfully");
		}
	}
	public void set_Value(WebElement obj, String value, String eleName) {
		try {
			obj.clear();
			obj.sendKeys(value);
			ExtentReporter.logPass(eleName+" : "+ value+" Entered successfully");
		} catch (Exception e) {
			ExtentReporter.logFail(eleName+" : "+ value+" NOT Entered successfully");
		}
	}
	
	public void waitUntilElementClickable(WebElement obj) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(obj));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
}
