//package com.appium.tests;
//
//import io.appium.java_client.AppiumBy;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.remote.MobileCapabilityType;
//import org.junit.Assert;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Platform;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//import java.net.URL;
//import java.util.logging.Logger;
//
//public class CalculatorTests {
//    private AndroidDriver driver;
//
//    private static final Logger logger = Logger.getLogger(CalculatorTests.class.getName());
//
//    @Test
//    public void test1() throws Exception {
//
//        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
//        desiredCapabilities.setCapability("appium:version", "7.0");
//        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 2");
//        // These 2 parameters are required if you want to automate an existing application
//        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
//        desiredCapabilities.setCapability("appium:appActivity", "com.android.calculator2.Calculator");
//        desiredCapabilities.setCapability("appium:appPackage", "com.android.calculator2");
//        driver = new AndroidDriver(new URL("http://localhost:4723"), desiredCapabilities);
//
//        logger.info("Ok");
//
//        WebElement digit1 = driver.findElement(By.id("com.android.calculator2:id/digit_1"));
//        WebElement digit2 = driver.findElement(By.id("com.android.calculator2:id/digit_2"));
//        WebElement plus = driver.findElement(AppiumBy.accessibilityId("plus"));
//        WebElement equals = driver.findElement(AppiumBy.accessibilityId("equals"));
//        WebElement result = driver.findElement(By.id("com.android.calculator2:id/result"));
//        WebElement minus = driver.findElement(AppiumBy.accessibilityId("minus"));
//        WebElement multiply = driver.findElement(AppiumBy.accessibilityId("multiply"));
//        WebElement divide = driver.findElement(AppiumBy.accessibilityId("divide"));
//        WebElement delete = driver.findElement(AppiumBy.accessibilityId("delete"));
//
//        digit1.click();//click on 1
//        digit2.click();//click on 2
//
//        plus.click();//click on +
//
//        digit2.click();//click on 2
//        digit2.click();//click on 2
//
//        equals.click();//click on equals
//
//        String actual = result.getText();//get text of result
//
//        Assert.assertEquals("34", actual);
//
//        //2 * 2 = 4
//        getDigit(2).click();//click on 2
//        multiply.click();
//        getDigit(2).click();//click on 2
//        equals.click();
//        Assert.assertEquals("4", result.getText());
//
//        //10 - 5 + 6 = 11
//
//        getDigit(1).click();
//        getDigit(0).click();
//        minus.click();
//        getDigit(5).click();
//        plus.click();
//        getDigit(6).click();
//
//        Assert.assertEquals("11", result.getText());
//        delete.click();
//
//        //before clicking equals, make sure that formula and result are displayed
//
//
//        getDigit(1).click();
//        getDigit(0).click();
//        minus.click();
//        getDigit(5).click();
//        plus.click();
//        getDigit(6).click();
//        //java.lang.ClassCastException: class org.openqa.selenium.remote.RemoteWebElement cannot be cast to class io.appium.java_client.MobileElement
//        // (org.openqa.selenium.remote.RemoteWebElement and io.appium.java_client.MobileElement are in unnamed module of loader 'app')
//        // it means that we are trying to convert wem element into mobile element or action that we are trying to do is not available for mobile element
//        //getAttribute - returns string, and we need to convert it into boolean
//        //that's why we use Boolean.parseBoolean() method
//        boolean actualFormulaVisibilityStatus = Boolean.parseBoolean(driver.findElement(By.id("com.android.calculator2:id/formula")).getAttribute("displayed"));
//
//        Assert.assertTrue("Formula is not visible!", actualFormulaVisibilityStatus);
//        Assert.assertTrue("Result is not visible!", driver.findElement(By.id("com.android.calculator2:id/result")).isDisplayed());
//        System.out.println(driver.findElement(By.id("com.android.calculator2:id/formula")).getAttribute("displayed"));
//
//
//        Thread.sleep(3000);
//        driver.closeApp();
//
//
//    }
//
//    public WebElement getDigit(int digit) {
//        return driver.findElement(By.id("com.android.calculator2:id/digit_" + digit));
//    }
//}
