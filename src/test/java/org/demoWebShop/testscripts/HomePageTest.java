package org.demoWebShop.testscripts;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.demoWebShop.automationCore.Base;
import org.demoWebShop.listeners.TestListener;
import org.demoWebShop.pages.HomePage;
import org.demoWebShop.utilities.ExcelUtility;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HomePageTest extends Base {
    HomePage home;
    ExcelUtility excel = new ExcelUtility();
    ThreadLocal<ExtentTest> extentTest = TestListener.getTestInstance();

    @Test(priority = 1,description = "TC_001_Verification of home page title")
    public void verifyHomePageTitle(){
        extentTest.get().assignCategory("Smoke");
        home = new HomePage(driver);
        List<String> data = excel.readDataFromExcel("HomePage");
        String expectedHomePageTitle = data.get(1);
        String actualHomePageTitle = home.getHomePageTitle();
        extentTest.get().log(Status.PASS, "Login page title recieved");
        Assert.assertEquals(actualHomePageTitle, expectedHomePageTitle, "ERROR::Invalid HomePageTitle");
        extentTest.get().log(Status.PASS, "Expected title is mached with actual home page title");
    }

}
